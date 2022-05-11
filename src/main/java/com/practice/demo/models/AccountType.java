package com.practice.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AccountType {
    @JsonProperty("Saving")
    SAVING,
    @JsonProperty("Checking")
    CHECKING
}
