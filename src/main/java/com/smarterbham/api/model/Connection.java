package com.smarterbham.api.model;

import com.smarterbham.api.dto.ThingsNetworkPayload;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Connection implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant receivedAt;
    private String deviceId;
    private Double battery;
    private Double gatewayLatitude;
    private Double gatewayLongitude;
    private Integer gatewayAltitude;
    private Integer dataRateIndex;
    private String codingRate;
    private String frequency;
    private Integer rssi;
    private Double snr;
    private String forwarderGatewayId;
    private Integer bandwidth;
    private Integer spreadingFactor;

    public Connection(ThingsNetworkPayload thingsNetworkPayload, Device device) {

        deviceId = device.getDeviceId();
        receivedAt = thingsNetworkPayload.getReceivedAt();
        battery = thingsNetworkPayload.getUplinkMessage().getDecodedPayload().getBattery();
        gatewayLatitude = thingsNetworkPayload.getUplinkMessage().getRxMetadata().get(0).getLocation().getLatitude();
        gatewayLongitude = thingsNetworkPayload.getUplinkMessage().getRxMetadata().get(0).getLocation().getLongitude();
        gatewayAltitude = thingsNetworkPayload.getUplinkMessage().getRxMetadata().get(0).getLocation().getAltitude();
        dataRateIndex = thingsNetworkPayload.getUplinkMessage().getSettings().getDataRateIndex();
        codingRate = thingsNetworkPayload.getUplinkMessage().getSettings().getCodingRate();
        frequency = thingsNetworkPayload.getUplinkMessage().getSettings().getFrequency();
        rssi = thingsNetworkPayload.getUplinkMessage().getRxMetadata().get(0).getRssi();
        snr = thingsNetworkPayload.getUplinkMessage().getRxMetadata().get(0).getSnr();
        forwarderGatewayId = thingsNetworkPayload.getUplinkMessage().getRxMetadata().get(0).getPacketBroker().getForwarderGatewayId();
        bandwidth = thingsNetworkPayload.getUplinkMessage().getSettings().getDataRate().getLora().getBandwidth();
        spreadingFactor = thingsNetworkPayload.getUplinkMessage().getSettings().getDataRate().getLora().getSpreadingFactor();
    }
}
