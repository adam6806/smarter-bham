
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class EndDeviceIds implements Serializable {

    private static final long serialVersionUID = 5182496296974157333L;
    private String deviceId;
    private String devEui;

}
