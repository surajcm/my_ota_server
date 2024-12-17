package com.github.surajcm.online.travel.dataaccess.serialization

import jakarta.xml.bind.annotation.adapters.XmlAdapter
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class ZonedDateTimeAdapter : XmlAdapter<String, ZonedDateTime>() {
    override fun unmarshal(dateVal: String?): ZonedDateTime? {
        return if (dateVal != null) {
            ZonedDateTime.parse(dateVal, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        } else {
            null
        }
    }

    override fun marshal(dateVal: ZonedDateTime?): String? {
        return if (dateVal != null) {
            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dateVal)
        } else {
            null
        }
    }

}