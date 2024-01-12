package com.StockPedia.stockpedia.domain.repository

import com.StockPedia.stockpedia.domain.model.CompanyInfo
import com.StockPedia.stockpedia.domain.model.CompanyListing
import com.StockPedia.stockpedia.domain.model.IntradayInfo
import com.StockPedia.stockpedia.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}