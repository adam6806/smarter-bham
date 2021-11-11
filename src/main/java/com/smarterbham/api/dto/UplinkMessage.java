
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UplinkMessage implements Serializable {

    private String sessionKeyId;
    private Integer fPort;
    private Integer fCnt;
    private String frmPayload;
    private DecodedPayload decodedPayload;
    private List<RxMetadatum> rxMetadata;
    private Settings settings;
    private Instant receivedAt;
    private String consumedAirtime;
    private NetworkIds networkIds;

}
