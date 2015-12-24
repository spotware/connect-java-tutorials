package com.mycompany.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(Include.NON_NULL)
public class MessageJson<T> {
    private T data;
    private ErrorJson error;

    public MessageJson() {}

    public MessageJson(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public ErrorJson getError() {
        return error;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(ErrorJson error) {
        this.error = error;
    }

    public static <T> MessageJson<T> newInstance(T data) {
        return new MessageJson<T>(data);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("data", data).append("error", error).toString();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageJson)) {
            return false;
        }
        MessageJson<?> other = (MessageJson) obj;
        return new EqualsBuilder().append(data, other.data).append(error, other.error).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(data).append(error).toHashCode();
    }
}
