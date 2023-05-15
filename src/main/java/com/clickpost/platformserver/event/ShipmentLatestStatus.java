package com.clickpost.platformserver.event;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Shipment latest status.
 *
 * @author khanh
 * @version $Id: $Id
 */
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

    /**
     * Instantiates a new Shipment latest status.
     */
    public ShipmentLatestStatus() {
    }

    /**
     * Instantiates a new Shipment latest status.
     *
     * @param trackingId the tracking id
     * @param statusId the status id
     * @param accountTypeId the account type id
     * @param enterpriseUserId the enterprise user id
     * @param cpPartnerId the cp partner id
     */
    public ShipmentLatestStatus(Integer trackingId, Integer statusId, Integer accountTypeId,
                                Integer enterpriseUserId, Integer cpPartnerId) {
        trackingId_ = trackingId;
        statusId_ = statusId;
        accountTypeId_ = accountTypeId;
        enterpriseUserId_ = enterpriseUserId;
        cpPartnerId_ = cpPartnerId;
    }

    /**
     * Gets tracking id.
     *
     * @return the tracking id
     */
    public Integer getTrackingId() {
        return trackingId_;
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
     * Gets account type id.
     *
     * @return the account type id
     */
    public Integer getAccountTypeId() {
        return accountTypeId_;
    }

    /**
     * Gets enterprise user id.
     *
     * @return the enterprise user id
     */
    public Integer getEnterpriseUserId() {
        return enterpriseUserId_;
    }

    /**
     * Gets cp partner id.
     *
     * @return the cp partner id
     */
    public Integer getCpPartnerId() {
        return cpPartnerId_;
    }
}
