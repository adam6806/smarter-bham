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
    private String codingRate;
    private String frequency;
    private Integer rssi;
    private Double snr;
    private String gatewayEui;
    private Integer bandwidth;
    private Integer spreadingFactor;

    public Connection(ThingsNetworkPayload thingsNetworkPayload, Device device) {

        deviceId = device.getDeviceId();
        receivedAt = thingsNetworkPayload.getData().getReceivedAt();
        battery = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getBattery();
        gatewayLatitude = thingsNetworkPayload.getData().getUplinkMessage().getRxMetadata().get(0).getLocation().getLatitude();
        gatewayLongitude = thingsNetworkPayload.getData().getUplinkMessage().getRxMetadata().get(0).getLocation().getLongitude();
        gatewayAltitude = thingsNetworkPayload.getData().getUplinkMessage().getRxMetadata().get(0).getLocation().getAltitude();
        codingRate = thingsNetworkPayload.getData().getUplinkMessage().getSettings().getCodingRate();
        frequency = thingsNetworkPayload.getData().getUplinkMessage().getSettings().getFrequency();
        rssi = thingsNetworkPayload.getData().getUplinkMessage().getRxMetadata().get(0).getRssi();
        snr = thingsNetworkPayload.getData().getUplinkMessage().getRxMetadata().get(0).getSnr();
        gatewayEui = thingsNetworkPayload.getData().getUplinkMessage().getRxMetadata().get(0).getGatewayIds().getEui();
        bandwidth = thingsNetworkPayload.getData().getUplinkMessage().getSettings().getDataRate().getLora().getBandwidth();
        spreadingFactor = thingsNetworkPayload.getData().getUplinkMessage().getSettings().getDataRate().getLora().getSpreadingFactor();
    }
}
