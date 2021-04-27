package com.wutsi.earning.dto

import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class Earning(
  public val id: Long = 0,
  public val userId: Long = 0,
  public val contractId: Long? = null,
  public val partnerId: Long? = null,
  public val date: LocalDate = LocalDate.now(),
  public val amount: Long = 0,
  public val currency: String = "",
  public val syncDateTime: OffsetDateTime = OffsetDateTime.now()
)
