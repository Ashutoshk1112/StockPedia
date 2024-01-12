package com.StockPedia.stockpedia.data.mapper

import com.StockPedia.stockpedia.data.local.CompanyListingEntity
import com.StockPedia.stockpedia.data.remote.dto.CompanyInfoDto
import com.StockPedia.stockpedia.domain.model.CompanyInfo
import com.StockPedia.stockpedia.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}