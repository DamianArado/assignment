package com.clickpost.platformserver.service.tracking;

import com.clickpost.platformserver.service.tracking.object.RtoToForwardScanAnomaly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

/**
 * The interface Tracking service.
 *
 * @author khanh
 * @version $Id: $Id
 */
public interface TrackingService {
    /**
     * This method will detect if there are any RTO TO forward Anomalies for the given shipment. It will execute logics:
     * <p><p> 1. First it will fetch RTO Scans for the shipment, If there is no RTO Scans it will return blank List ( No
     * Anomaly found for the shipment) <p><p> 2. It will fetch Forward Scans after the first RTO Scan (using timestamp
     * filters) <p><p> 3. If no forward Scans are present after the First RTO Scan then this will return blank List ( No
     * Anomaly found for the shipment) <p><p> 4. If there are Forward Scans after first RTO Scans then for each RTO Scan
     * we will check if there is different forward scan after that RTO scan. Like this we will generate all RTO to
     * forward anomalies and will return as output.
     *
     * @param shipmentId ID of the shipment
     * @return List of RtoToForwardScanAnomaly Objects which contains data for Rto To Forward Anomaly.
     */
    RtoToForwardScanAnomaly[] detectRtoToForwardAnomaliesForShipment(int shipmentId);

    /**
     * Last Mile Shipment: This policy is for last mile shipments only (Purplle). We check if the shipment is last mile
     * shipment. We append 'LAST MILE' to status_code, status and description.
     * <p>
     * OFD Duplication Policy: Some courier partner duplicate OFD scans. Lets say they are saying  Shipment got OFD at
     * 13 then they are saying shipment is again got OFD at 13:15. So one of the scan is faulty.
     * <p>
     * Tracking Scan Uniqueness Policy: We save unique Tracking Scans in our system for each shipment. Uniqueness of a
     * scan is defined based on Scan TimeStamp + Uber Status for the given Scan.
     * <p>
     * Future Scan Policy: Our system does not save scans which has future timestamp. We consider such scans as faulty
     * Scans. We consider a scan as future scan if it has timestamp more than Current UTC Timestamp.
     * <p>
     * Latest Scan Policy: Apart from Keep Tracking scans in the system for a shipment. We also detect that what is the
     * current/latest scan of the shipment. Our logic is to detect Latest Scan for the shipment is: <p><p> 1. If there
     * is no terminal scan for the shipment then Scan which has highest Timestamp is latest scan. 2. If there is
     * terminal scan for the shipment and time difference between terminal scan and shipment with highest timestamp is
     * less than 12 hours then terminal scan will be the latest scan.
     *
     * @param shipmentId Shipment ID
     * @param courierPartnerScans List of Courier Partner Scans
     * @param shipmentCycle the shipment cycle
     * @param nextShipmentCycle Next Shipment Cycle for the shipment.
     * @param rtoAwb RTO AWB for the shipment.
     * @param cpEdd the cp edd
     * @return the optional
     */
    Optional<Integer> updateTracking(int shipmentId, String[] courierPartnerScans,
                                     @NotNull Integer shipmentCycle, @NotNull Integer nextShipmentCycle,
                                     @Nullable String rtoAwb, @Nullable String cpEdd);

    /**
     * This method will fetch Shipment Details from the system for given Shipment ID.<p><p>
     *
     * @param shipmentId the shipment id
     * @return Shipment Detail Object of the shipment which contain shipment details
     */
    Integer fetchShipment(int shipmentId);


}
