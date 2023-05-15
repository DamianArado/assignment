package com.clickpost.platformserver.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * The type Tracking update event.
 *
 * @author khanh
 * @version $Id: $Id
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingUpdateEvent {

    @JsonProperty("latest_status")
    private ShipmentLatestStatus shipmentLatestStatus_;

    @JsonProperty("history_status")
    private ArrayList<HistoryScan> historyScans_;

    /**
     * Instantiates a new Tracking update event.
     */
    public TrackingUpdateEvent() {
    }

    /**
     * Instantiates a new Tracking update event.
     *
     * @param shipmentLatestStatus the shipment latest status
     * @param historyScans the history scans
     */
    public TrackingUpdateEvent(ShipmentLatestStatus shipmentLatestStatus, ArrayList<HistoryScan> historyScans) {
        shipmentLatestStatus_ = shipmentLatestStatus;
        historyScans_ = historyScans;
    }

    /**
     * Gets shipment latest status.
     *
     * @return the shipment latest status
     */
    public ShipmentLatestStatus getShipmentLatestStatus() {
        return shipmentLatestStatus_;
    }

    /**
     * Gets history scans.
     *
     * @return the history scans
     */
    public ArrayList<HistoryScan> getHistoryScans() {
        return historyScans_;
    }
}
