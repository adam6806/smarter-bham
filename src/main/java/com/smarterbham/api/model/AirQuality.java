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
public class AirQuality implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant receivedAt;
    private Double latitude;
    private Double longitude;
    private Integer altitude;
    private Integer ambientLight;
    private Integer celsius;
    private Integer dewpoint;
    private Integer ir;
    private Integer particulate1;
    private Integer particulate10;
    private Integer particulate2dot5;
    private Integer particulate4;
    private Double pressure;
    private Integer relativeHumidity;
    private Integer uv;
    private Integer voc;
    private Long connectionId;
    private String deviceId;

    public AirQuality(ThingsNetworkPayload thingsNetworkPayload, Connection connection, Device device) {

        deviceId = device.getDeviceId();
        connectionId = connection.getId();
        receivedAt = thingsNetworkPayload.getData().getReceivedAt();
        latitude = device.getLatitude();
        longitude = device.getLongitude();
        altitude = device.getAltitude();
        ambientLight = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getAmbientLight();
        celsius = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getCelsius();
        dewpoint = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getDewpoint();
        ir = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getIr();
        particulate1 = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getParticulate1();
        particulate10 = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getParticulate10();
        particulate2dot5 = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getParticulate2dot5();
        particulate4 = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getParticulate4();
        pressure = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getPressure();
        relativeHumidity = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getRelativeHumidity();
        uv = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getUv();
        voc = thingsNetworkPayload.getData().getUplinkMessage().getDecodedPayload().getVoc();
    }
}
