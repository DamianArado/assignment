package com.clickpost.platformserver.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingUpdateEvent {

    @JsonProperty("latest_status")
    private ShipmentLatestStatus shipmentLatestStatus_;

    @JsonProperty("history_status")
    private ArrayList<HistoryScan> historyScans_;

    public TrackingUpdateEvent() {
    }

    public TrackingUpdateEvent(ShipmentLatestStatus shipmentLatestStatus, ArrayList<HistoryScan> historyScans) {
        shipmentLatestStatus_ = shipmentLatestStatus;
        historyScans_ = historyScans;
    }


    public ShipmentLatestStatus getShipmentLatestStatus() {
        return shipmentLatestStatus_;
    }

    public ArrayList<HistoryScan> getHistoryScans() {
        return historyScans_;
    }
}
