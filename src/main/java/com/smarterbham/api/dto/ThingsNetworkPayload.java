package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class ThingsNetworkPayload implements Serializable {

    private final static long serialVersionUID = 7764733453704985227L;
    public String type;
    public EndDeviceIds endDeviceIds;
    public Instant receivedAt;
    public UplinkMessage uplinkMessage;

}

