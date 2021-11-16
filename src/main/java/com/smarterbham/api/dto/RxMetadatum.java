
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RxMetadatum implements Serializable {

    private static final long serialVersionUID = -8332398093512070497L;
    private GatewayIds gatewayIds;
    private String time;
    private Integer rssi;
    private Integer channelRssi;
    private Double snr;
    private Location location;
    private String uplinkToken;

}
