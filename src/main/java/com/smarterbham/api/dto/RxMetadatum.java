
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class RxMetadatum implements Serializable {

    private GatewayIds gatewayIds;
    private PacketBroker packetBroker;
    private Instant time;
    private Integer rssi;
    private Integer channelRssi;
    private Double snr;
    private Location location;
    private String uplinkToken;

}
