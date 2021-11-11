package com.smarterbham.api.model;

import com.smarterbham.api.dto.ThingsNetworkPayload;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String deviceId;
    private Double latitude;
    private Double longitude;
    private Integer altitude;
    private String address;
    private String ownerName;
    private String email;
    private String phone;
    private String description;

    public Device(ThingsNetworkPayload thingsNetworkPayload) {
        deviceId = thingsNetworkPayload.getEndDeviceIds().getDeviceId();
    }
}
