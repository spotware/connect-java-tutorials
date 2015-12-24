package com.mycompany.app.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CursorMessageJson<T> extends MessageJson<T> {
    private String next;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public static <T> CursorMessageJson<T> newInstance(T data, String nextCursor) {
        CursorMessageJson<T> connectCursorMessage = new CursorMessageJson<T>();
        connectCursorMessage.setData(data);
        connectCursorMessage.setNext(nextCursor);
        return connectCursorMessage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).appendSuper(super.toString()).append("next", next).toString();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CursorMessageJson)) {
            return false;
        }
        CursorMessageJson<?> other = (CursorMessageJson) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj)).append(next, other.next).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(next).toHashCode();
    }

}
