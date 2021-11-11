
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Lora implements Serializable {

    private Integer bandwidth;
    private Integer spreadingFactor;

}
