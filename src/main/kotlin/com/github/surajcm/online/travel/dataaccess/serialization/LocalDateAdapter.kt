package com.github.surajcm.online.travel.dataaccess.serialization

import jakarta.xml.bind.annotation.adapters.XmlAdapter
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class LocalDateAdapter: XmlAdapter<String, LocalDate>() {

    override fun unmarshal(date: String?): LocalDate? {
        return if (date != null) {
            LocalDate.parse(date, DateTimeFormatter.ISO_DATE)
        } else {
            null
        }
    }

    override fun marshal(date: LocalDate?): String {
        return date.toString()
    }
}