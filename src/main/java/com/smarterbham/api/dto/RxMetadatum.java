
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

    private final static long serialVersionUID = -8332398093512070497L;
    public GatewayIds gatewayIds;
    public String time;
    public Integer timestamp;
    public Integer rssi;
    public Integer channelRssi;
    public Double snr;
    public Location location;
    public String uplinkToken;

}
