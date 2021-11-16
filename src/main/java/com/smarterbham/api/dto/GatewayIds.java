
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
public class GatewayIds implements Serializable {

    private static final long serialVersionUID = -3370193571104717745L;
    private String gatewayId;
    private String eui;

}
