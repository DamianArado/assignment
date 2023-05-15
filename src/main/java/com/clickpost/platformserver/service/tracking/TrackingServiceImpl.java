package com.clickpost.platformserver.service.tracking;

import com.clickpost.platformserver.database.ClickPostDataBase;
import com.clickpost.platformserver.service.tracking.object.RtoToForwardScanAnomaly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.Map;
import java.util.Optional;

/**
 * The type Tracking service.
 */
public class TrackingServiceImpl implements TrackingService {
    private final ClickPostDataBase clickPostDataBase_;
    private final Logger LOGGER = LoggerFactory.getLogger(TrackingService.class);

    /**
     * Instantiates a new Tracking service.
     *
     * @param clickPostDataBase the click post data base
     */
    @Inject
    public TrackingServiceImpl(ClickPostDataBase clickPostDataBase) {
        clickPostDataBase_ = clickPostDataBase;
    }

    @Override
    public RtoToForwardScanAnomaly[] detectRtoToForwardAnomaliesForShipment(int shipmentId) {
        return new RtoToForwardScanAnomaly[0];
    }

    @Override
    public Optional<Integer> updateTracking(int shipmentId, String[] courierPartnerScans,
                                     @NotNull Integer shipmentCycle, @NotNull Integer nextShipmentCycle,
                                     @Nullable String rtoAwb, @Nullable String cpEdd){
        return Optional.of(1);
    }

    @Override
    public Integer fetchShipment(int shipmentId){
        return 1;
    }

    /**
     * This method will filter out duplicate courier partner scans
     *
     * @param courierPartnerScanTrackingStatusMap Courier Partner Scans with corresponding Tracking Status Details.
     * @return Courier partner scans with Tracking Status after filtering Duplicate Scans.
     */
    protected @Nullable  Map<String, Integer> filterDuplicateScans(
            Map<String, Integer> courierPartnerScanTrackingStatusMap) {
        return null;
    }

    /**
     * This method will save duplicate courier partner scans
     *
     * @param courierPartnerScanTrackingStatusMap the courier partner scan tracking status map
     * @return Courier partner scans with Tracking Status after filtering Duplicate Scans.
     */
    protected @Nullable  Map<String, Integer> saveDuplicateScans(
            Map<String, Integer> courierPartnerScanTrackingStatusMap) {
        return null;
    }

    /**
     * Filter unique scans map.
     *
     * @param courierPartnerScanTrackingStatusMap the courier partner scan tracking status map
     * @return the map
     */
    protected @Nullable  Map<String, Integer> filterUniqueScans(
            Map<String, Integer> courierPartnerScanTrackingStatusMap) {
        return null;
    }

    /**
     * This method will filter out the courier partner scans for which System already have Scans.
     *
     * @param trackingScans                               List of existing available Tracking Scans in the system.
     * @param existingCourierPartnerScanTrackingStatusMap Courier partner scans with tracking status details
     *                                                    that are new.
     * @return Courier partner Scans with Tracking Status after filtering out the existing scans in the system.
     */
    private @Nullable Map<Integer, Integer> filterExistingScans(String[] trackingScans,
                                                                          Map<Integer, Integer>
                                                                                  existingCourierPartnerScanTrackingStatusMap) {
        return null;
    }

    /**
     * This method will filter out the courier partner scans for which System already have Scans.
     *
     * @param existingCourierPartnerScanTrackingStatusMap Courier partner scans with tracking status details
     *                                                    that are new.
     * @return Courier partner Scans with Tracking Status after filtering out the existing scans in the system.
     */
    private @Nullable Map<Integer, Integer> removeExistingScans(String[] trackingScans,
                                                                Map<Integer, Integer>
                                                                        existingCourierPartnerScanTrackingStatusMap) {
        return null;
    }


    private @Nullable Map<Integer, Integer> saveExistingScans(String[] trackingScans,
                                                                Map<Integer, Integer>
                                                                        existingCourierPartnerScanTrackingStatusMap) {
        return null;
    }


}
