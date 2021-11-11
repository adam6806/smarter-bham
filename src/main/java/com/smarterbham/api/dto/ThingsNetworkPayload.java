
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
public class ThingsNetworkPayload implements Serializable {

    private EndDeviceIds endDeviceIds;
    private List<String> correlationIds;
    private Instant receivedAt;
    private UplinkMessage uplinkMessage;

}
