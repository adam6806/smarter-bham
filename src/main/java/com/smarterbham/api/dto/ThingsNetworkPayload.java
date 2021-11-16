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

    private static final long serialVersionUID = 7764733453704985227L;
    private String type;
    private EndDeviceIds endDeviceIds;
    private Instant receivedAt;
    private UplinkMessage uplinkMessage;

}

