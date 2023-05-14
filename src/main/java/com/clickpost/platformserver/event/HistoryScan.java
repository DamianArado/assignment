package com.clickpost.platformserver.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryScan {
    @JsonProperty("status_id")
    private Integer statusId_;

    @JsonProperty("latest_remark")
    private String remark_;

    @JsonProperty("cp_status")
    private String cpStatus_;

    @JsonProperty("latest_timestamp")
    private String scanTimestamp_;

    @JsonProperty("cp_status_code")
    private String cpStatusCode_;

    @JsonProperty("cp_status_description")
    private String cpStatusDescription_;

    @JsonProperty("location")
    private String location_;

    public HistoryScan() {
    }


    public HistoryScan(Integer statusId, String remark, String cp_status, String scanTimestamp, String cpStatusCode,
                       String cpStatusDescription, String location) {
        statusId_ = statusId;
        remark_ = remark;
        cpStatus_ = cp_status;
        scanTimestamp_ = scanTimestamp;
        cpStatusCode_ = cpStatusCode;
        cpStatusDescription_ = cpStatusDescription;
        location_ = location;
    }

    public Integer getStatusId() {
        return statusId_;
    }

    public String getRemark() {
        return remark_;
    }

    public String getCpStatus() {
        return cpStatus_;
    }

    public String getScanTimestamp() {
        return scanTimestamp_;
    }

    public String getCpStatusCode() {
        return cpStatusCode_;
    }

    public String getCpStatusDescription() {
        return cpStatusDescription_;
    }

    public String getLocation() {
        return location_;
    }
}