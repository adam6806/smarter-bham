
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
public class UplinkMessage implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String sessionKeyId;
    private Integer fPort;
    private Integer fCnt;
    private String frmPayload;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "decoded_payload_id")
    private DecodedPayload decodedPayload;
    @OneToMany(cascade = CascadeType.ALL)
    private List<RxMetadatum> rxMetadata;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "settings_id")
    private Settings settings;
    private Instant receivedAt;
    private String consumedAirtime;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "network_ids_id")
    private NetworkIds networkIds;

}
