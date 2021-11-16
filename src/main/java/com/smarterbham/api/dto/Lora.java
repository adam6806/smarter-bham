
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Lora implements Serializable {

    private final static long serialVersionUID = 1539168856776493281L;
    public Integer bandwidth;
    public Integer spreadingFactor;

}
