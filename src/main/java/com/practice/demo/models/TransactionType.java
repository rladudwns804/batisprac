package com.practice.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TransactionType {

    @JsonProperty("WITHDRAW")
    WITHDRAW,
    @JsonProperty("TRANSFER")
    TRANSFER,
    @JsonProperty("DEPOSIT")
    DEPOSIT
}
