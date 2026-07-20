package com.github.surajcm.online.travel.air.service

import com.github.surajcm.online.travel.schema.request.shop.IATAAirShoppingRQ
import com.github.surajcm.online.travel.schema.response.shop.AmountType
import com.github.surajcm.online.travel.schema.response.shop.CarrierOffersType
import com.github.surajcm.online.travel.schema.response.shop.DateTimeType
import com.github.surajcm.online.travel.schema.response.shop.DescType
import com.github.surajcm.online.travel.schema.response.shop.IATAAirShoppingRS
import com.github.surajcm.online.travel.schema.response.shop.IATAPayloadStandardAttributesType
import com.github.surajcm.online.travel.schema.response.shop.OfferType
import com.github.surajcm.online.travel.schema.response.shop.OffersGroupType
import com.github.surajcm.online.travel.schema.response.shop.PriceType
import com.github.surajcm.online.travel.schema.response.shop.ShoppingResponseType
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.ZonedDateTime
import java.util.UUID

/**
 * Mocks the IATA NDC AirShopping operation.
 *
 * This is a sandbox implementation: it does not perform a real availability
 * search. It returns a single, statically-priced carrier offer so downstream
 * NDC tooling has a well-formed [IATAAirShoppingRS] to consume.
 */
@Service
class AirShoppingService {

    fun shop(request: IATAAirShoppingRQ): IATAAirShoppingRS {
        val response = IATAAirShoppingRS()
        response.payloadAttributes = payloadAttributes(request)
        response.response = mockResponse()
        return response
    }

    private fun payloadAttributes(request: IATAAirShoppingRQ): IATAPayloadStandardAttributesType {
        val attributes = IATAPayloadStandardAttributesType()
        attributes.versionNumber = NDC_VERSION
        attributes.timestamp = now()
        // Echo the caller's token back so they can correlate the round-trip.
        attributes.echoTokenText = request.payloadAttributes?.echoTokenText
        return attributes
    }

    private fun mockResponse(): IATAAirShoppingRS.Response {
        val response = IATAAirShoppingRS.Response()

        val shoppingResponse = ShoppingResponseType()
        shoppingResponse.shoppingResponseRefID = UUID.randomUUID().toString()
        response.shoppingResponse = shoppingResponse

        val offersGroup = OffersGroupType()
        offersGroup.carrierOffers.add(mockCarrierOffers())
        response.offersGroup = offersGroup

        return response
    }

    private fun mockCarrierOffers(): CarrierOffersType {
        val carrierOffers = CarrierOffersType()
        carrierOffers.offer.add(mockOffer())
        return carrierOffers
    }

    private fun mockOffer(): OfferType {
        val offer = OfferType()
        offer.offerID = UUID.randomUUID().toString()
        offer.ownerCode = MOCK_CARRIER
        offer.validatingCarrierCode = MOCK_CARRIER

        val price = PriceType()
        price.baseAmount = amount(BigDecimal("199.00"))
        offer.totalPrice = price

        val expiry = now()
        // Sandbox offers are valid for one hour from issue.
        expiry.value = expiry.value.plusHours(1)
        offer.offerExpirationTimeLimitDateTime = expiry

        val desc = DescType()
        desc.descText = "Mock NDC sandbox offer"
        offer.desc.add(desc)

        return offer
    }

    private fun amount(value: BigDecimal): AmountType {
        val amount = AmountType()
        amount.value = value
        amount.curCode = MOCK_CURRENCY
        return amount
    }

    private fun now(): DateTimeType {
        val dateTime = DateTimeType()
        dateTime.value = ZonedDateTime.now()
        return dateTime
    }

    private companion object {
        val NDC_VERSION: BigDecimal = BigDecimal("19.2")
        const val MOCK_CARRIER = "ZZ"
        const val MOCK_CURRENCY = "USD"
    }
}
