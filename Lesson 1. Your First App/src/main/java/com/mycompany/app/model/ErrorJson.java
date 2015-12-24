package com.mycompany.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ErrorJson {
    private final String errorCode;
    private final String description;

    public ErrorJson(@JsonProperty("errorCode") String type, @JsonProperty("description") String message) {
        this.errorCode = type;
        this.description = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("errorCode", errorCode).append("description", description).toString();
    }
}
