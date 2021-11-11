
package com.smarterbham.api.model;

import java.time.Instant;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ThingsNetworkPayload implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "end_device_ids_device_id")
    private EndDeviceIds endDeviceIds;
    @ElementCollection
    private List<String> correlationIds;
    private Instant receivedAt;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uplink_message_id")
    private UplinkMessage uplinkMessage;

}
