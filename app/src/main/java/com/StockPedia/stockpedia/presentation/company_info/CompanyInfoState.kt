package com.StockPedia.stockpedia.presentation.company_info

import com.StockPedia.stockpedia.domain.model.CompanyInfo
import com.StockPedia.stockpedia.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
