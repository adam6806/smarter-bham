
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class NetworkIds implements Serializable {

    private String netId;
    private String tenantId;
    private String clusterId;

}
