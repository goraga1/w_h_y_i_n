package com.whyinside.whyinside.services.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginData {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("session_id")
    @Expose
    private String sessionId;
    @SerializedName("action")
    @Expose
    private String action;

    /**
     * @return The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return The sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId The session_id
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * @return The action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action The action
     */
    public void setAction(String action) {
        this.action = action;
    }

}