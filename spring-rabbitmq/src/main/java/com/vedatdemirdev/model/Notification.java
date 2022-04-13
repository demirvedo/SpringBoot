package com.vedatdemirdev.model;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {

    private String id;
    private Date createdAt;
    private Boolean isSeen;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getSeen() {
        return isSeen;
    }

    public void setSeen(Boolean seen) {
        isSeen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", isSeen=" + isSeen +
                ", message='" + message + '\'' +
                '}';
    }
}
