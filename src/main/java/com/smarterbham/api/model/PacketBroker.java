
package com.smarterbham.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PacketBroker implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
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
