
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UplinkMessage implements Serializable {

    private static final long serialVersionUID = -5916808818650619698L;
    private DecodedPayload decodedPayload;
    private List<RxMetadatum> rxMetadata = null;
    private Settings settings;
    private Instant receivedAt;

}
