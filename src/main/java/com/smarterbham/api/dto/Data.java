
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class Data implements Serializable {

    private final static long serialVersionUID = 7764733453704985227L;
    public String type;
    public EndDeviceIds endDeviceIds;
    public Instant receivedAt;
    public UplinkMessage uplinkMessage;

}
