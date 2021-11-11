
package com.smarterbham.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RxMetadatum implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gateway_ids_id")
    public GatewayIds gatewayIds;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "packet_broker_id")
    public PacketBroker packetBroker;
    public Instant time;
    public Integer rssi;
    public Integer channelRssi;
    public Double snr;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    public Location location;
    @Column(length = 5000)
    public String uplinkToken;

}
