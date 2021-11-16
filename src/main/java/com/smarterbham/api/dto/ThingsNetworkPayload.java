
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
public class ThingsNetworkPayload implements Serializable {

    private final static long serialVersionUID = 3639065172409837081L;
    public String time;
    public Data data;

}
