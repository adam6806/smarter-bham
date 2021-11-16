
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class EndDeviceIds implements Serializable {

    private final static long serialVersionUID = 5182496296974157333L;
    public String deviceId;
    public String devEui;

}
