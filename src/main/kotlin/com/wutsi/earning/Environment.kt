package com.wutsi.earning

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-earning-test.herokuapp.com"),
  PRODUCTION("https://wutsi-earning-prod.herokuapp.com"),
  ;
}
