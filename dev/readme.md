### AirShopping

Mock IATA NDC `AirShopping` operation.

- **Endpoint:** `POST /ndc/airshopping`
- **Content-Type / Accept:** `application/xml`
- **Port:** `8090`

This is a sandbox: it does not perform a real availability search. It returns a
single, statically-priced carrier offer and echoes the request's `EchoTokenText`
so callers can correlate the round-trip.

#### Request sample

```xml
<?xml version="1.0" encoding="UTF-8"?>
<IATA_AirShoppingRQ xmlns="http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ">
  <PayloadAttributes>
    <EchoTokenText>demo-echo-123</EchoTokenText>
  </PayloadAttributes>
</IATA_AirShoppingRQ>
```

#### Response sample

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<IATA_AirShoppingRS xmlns="http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS">
  <Response>
    <OffersGroup>
      <CarrierOffers>
        <Offer>
          <Desc><DescText>Mock NDC sandbox offer</DescText></Desc>
          <OfferExpirationTimeLimitDateTime>2026-07-11T16:38:36.757095+05:30</OfferExpirationTimeLimitDateTime>
          <OfferID>91e71bd5-72d2-4033-a94b-3edf74818f11</OfferID>
          <OwnerCode>ZZ</OwnerCode>
          <TotalPrice><BaseAmount CurCode="USD">199.00</BaseAmount></TotalPrice>
          <ValidatingCarrierCode>ZZ</ValidatingCarrierCode>
        </Offer>
      </CarrierOffers>
    </OffersGroup>
    <ShoppingResponse>
      <ShoppingResponseRefID>168a0887-c347-419f-a0b8-c584e7a170d6</ShoppingResponseRefID>
    </ShoppingResponse>
  </Response>
  <PayloadAttributes>
    <EchoTokenText>demo-echo-123</EchoTokenText>
    <Timestamp>2026-07-11T15:38:36.754659+05:30</Timestamp>
    <VersionNumber>19.2</VersionNumber>
  </PayloadAttributes>
</IATA_AirShoppingRS>
```

#### Try it with curl

```bash
curl -X POST http://localhost:8090/ndc/airshopping \
  -H "Content-Type: application/xml" \
  --data-binary @dev/airshopping-request.xml
```
