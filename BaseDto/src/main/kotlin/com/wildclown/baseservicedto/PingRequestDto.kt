package com.wildclown.baseservicedto

import com.fasterxml.jackson.annotation.JsonProperty


data class PingRequestDto(
    @JsonProperty("ping")
    val ping: String
)
