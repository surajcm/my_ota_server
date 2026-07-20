package com.github.surajcm.online.travel.air.controller

import com.github.surajcm.online.travel.air.service.AirShoppingService
import com.github.surajcm.online.travel.schema.request.shop.IATAAirShoppingRQ
import com.github.surajcm.online.travel.schema.response.shop.IATAAirShoppingRS
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "Air", description = "IATA NDC air shopping operations")
class AirController(
    private val airShoppingService: AirShoppingService
) {
    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello World!"
    }

    @Operation(
        summary = "AirShopping",
        description = "Mocks the IATA NDC AirShopping operation, returning a single sandbox offer."
    )
    @PostMapping(
        "/ndc/airshopping",
        consumes = [MediaType.APPLICATION_XML_VALUE],
        produces = [MediaType.APPLICATION_XML_VALUE]
    )
    fun airShopping(@RequestBody request: IATAAirShoppingRQ): IATAAirShoppingRS {
        return airShoppingService.shop(request)
    }
}
