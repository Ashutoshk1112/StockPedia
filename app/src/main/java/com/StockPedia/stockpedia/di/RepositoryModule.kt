package com.StockPedia.stockpedia.di

import com.StockPedia.stockpedia.data.csv.CSVParser
import com.StockPedia.stockpedia.data.csv.CompanyListingsParser
import com.StockPedia.stockpedia.data.csv.IntradayInfoParser
import com.StockPedia.stockpedia.data.repository.StockRepositoryImpl
import com.StockPedia.stockpedia.domain.model.CompanyListing
import com.StockPedia.stockpedia.domain.model.IntradayInfo
import com.StockPedia.stockpedia.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}