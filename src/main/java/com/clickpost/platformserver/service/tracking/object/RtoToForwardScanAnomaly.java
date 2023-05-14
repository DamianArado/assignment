package com.clickpost.platformserver.service.tracking.object;

import java.util.Date;

public class RtoToForwardScanAnomaly {
    private final int shipmentId_;
    private final long anomalyId_;
    private final long rtoScanId_;
    private final long forwardScanId_;
    private final Date anomalyDetectionTime_;

    public RtoToForwardScanAnomaly(int shipmentId, long anomalyId, long rtoScanId, long forwardScanId,
                                   Date anomalyDetectionTime) {
        shipmentId_ = shipmentId;
        anomalyId_ = anomalyId;
        rtoScanId_ = rtoScanId;
        forwardScanId_ = forwardScanId;
        anomalyDetectionTime_ = anomalyDetectionTime;
    }

    public int getShipmentId() {
        return shipmentId_;
    }

    public long getAnomalyId() {
        return anomalyId_;
    }

    public long getRtoScanId() {
        return rtoScanId_;
    }

    public long getForwardScanId() {
        return forwardScanId_;
    }

    public Date getAnomalyDetectionTime() {
        return anomalyDetectionTime_;
    }
}
