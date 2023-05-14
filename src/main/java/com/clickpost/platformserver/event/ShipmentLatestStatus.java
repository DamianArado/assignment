package com.clickpost.platformserver.event;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentLatestStatus {

    @JsonProperty("tracking_id")
    private Integer trackingId_;

    @JsonProperty("status_id")
    private Integer statusId_;

    @JsonProperty("account_type_id")
    private Integer accountTypeId_;

    @JsonProperty("enterprise_user_id")
    private Integer enterpriseUserId_;

    @JsonProperty("cp_partner_id")
    private Integer cpPartnerId_;


    public ShipmentLatestStatus() {
    }

    public ShipmentLatestStatus(Integer trackingId, Integer statusId, Integer accountTypeId,
                                Integer enterpriseUserId, Integer cpPartnerId) {
        trackingId_ = trackingId;
        statusId_ = statusId;
        accountTypeId_ = accountTypeId;
        enterpriseUserId_ = enterpriseUserId;
        cpPartnerId_ = cpPartnerId;
    }

    public Integer getTrackingId() {
        return trackingId_;
    }

    public Integer getStatusId() {
        return statusId_;
    }

    public Integer getAccountTypeId() {
        return accountTypeId_;
    }

    public Integer getEnterpriseUserId() {
        return enterpriseUserId_;
    }

    public Integer getCpPartnerId() {
        return cpPartnerId_;
    }
}
