
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class PacketBroker implements Serializable {

    private String messageId;
    private String forwarderNetId;
    private String forwarderTenantId;
    private String forwarderClusterId;
    private String forwarderGatewayEui;
    private String forwarderGatewayId;
    private String homeNetworkNetId;
    private String homeNetworkTenantId;
    private String homeNetworkClusterId;

}
