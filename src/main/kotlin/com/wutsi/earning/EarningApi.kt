package com.wutsi.earning

import com.wutsi.earning.dto.SearchEarningResponse
import feign.Param
import feign.RequestLine
import java.time.LocalDate
import kotlin.Int
import kotlin.Long
import kotlin.Unit

public interface EarningApi {
  @RequestLine("GET /v1/earnings/users/{user-id}?year={year}")
  public fun userEarnings(@Param("user-id") userId: Long, @Param("year") year: Int):
      SearchEarningResponse

  @RequestLine("GET /v1/earnings/compute?year={year}&month={month}")
  public fun compute(@Param("year") year: Int, @Param("month") month: Int): Unit

  @RequestLine("GET /v1/earnings/replay?start-date={start-date}&end-date={end-date}")
  public fun replay(@Param("start-date") startDate: LocalDate, @Param("end-date")
      endDate: LocalDate? = null): Unit
}
