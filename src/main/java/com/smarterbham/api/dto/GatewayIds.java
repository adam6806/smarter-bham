
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class GatewayIds implements Serializable {

    private final static long serialVersionUID = -3370193571104717745L;
    public String gatewayId;
    public String eui;

}
