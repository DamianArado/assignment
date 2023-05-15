package com.clickpost.platformserver.service.tracking.object;

import java.util.Date;

/**
 * The type Rto to forward scan anomaly.
 */
public class RtoToForwardScanAnomaly {
    private final int shipmentId_;
    private final long anomalyId_;
    private final long rtoScanId_;
    private final long forwardScanId_;
    private final Date anomalyDetectionTime_;

    /**
     * Instantiates a new Rto to forward scan anomaly.
     *
     * @param shipmentId the shipment id
     * @param anomalyId the anomaly id
     * @param rtoScanId the rto scan id
     * @param forwardScanId the forward scan id
     * @param anomalyDetectionTime the anomaly detection time
     */
    public RtoToForwardScanAnomaly(int shipmentId, long anomalyId, long rtoScanId, long forwardScanId,
                                   Date anomalyDetectionTime) {
        shipmentId_ = shipmentId;
        anomalyId_ = anomalyId;
        rtoScanId_ = rtoScanId;
        forwardScanId_ = forwardScanId;
        anomalyDetectionTime_ = anomalyDetectionTime;
    }

    /**
     * Gets shipment id.
     *
     * @return the shipment id
     */
    public int getShipmentId() {
        return shipmentId_;
    }

    /**
     * Gets anomaly id.
     *
     * @return the anomaly id
     */
    public long getAnomalyId() {
        return anomalyId_;
    }

    /**
     * Gets rto scan id.
     *
     * @return the rto scan id
     */
    public long getRtoScanId() {
        return rtoScanId_;
    }

    /**
     * Gets forward scan id.
     *
     * @return the forward scan id
     */
    public long getForwardScanId() {
        return forwardScanId_;
    }

    /**
     * Gets anomaly detection time.
     *
     * @return the anomaly detection time
     */
    public Date getAnomalyDetectionTime() {
        return anomalyDetectionTime_;
    }
}
