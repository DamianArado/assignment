package com.clickpost.platformserver.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type History scan.
 *
 * @author khanh
 * @version $Id: $Id
 */
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

    /**
     * Instantiates a new History scan.
     */
    public HistoryScan() {
    }

    /**
     * Instantiates a new History scan.
     *
     * @param statusId the status id
     * @param remark the remark
     * @param cp_status the cp status
     * @param scanTimestamp the scan timestamp
     * @param cpStatusCode the cp status code
     * @param cpStatusDescription the cp status description
     * @param location the location
     */
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

    /**
     * Gets status id.
     *
     * @return the status id
     */
    public Integer getStatusId() {
        return statusId_;
    }

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
        return remark_;
    }

    /**
     * Gets cp status.
     *
     * @return the cp status
     */
    public String getCpStatus() {
        return cpStatus_;
    }

    /**
     * Gets scan timestamp.
     *
     * @return the scan timestamp
     */
    public String getScanTimestamp() {
        return scanTimestamp_;
    }

    /**
     * Gets cp status code.
     *
     * @return the cp status code
     */
    public String getCpStatusCode() {
        return cpStatusCode_;
    }

    /**
     * Gets cp status description.
     *
     * @return the cp status description
     */
    public String getCpStatusDescription() {
        return cpStatusDescription_;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location_;
    }
}
