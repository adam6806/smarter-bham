
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class EndDeviceIds implements Serializable {

    private String deviceId;
    private ApplicationIds applicationIds;
    private String devEui;
    private String joinEui;
    private String devAddr;

}
