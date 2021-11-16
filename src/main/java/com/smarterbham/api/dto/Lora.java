
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
public class Lora implements Serializable {

    private static final long serialVersionUID = 1539168856776493281L;
    private Integer bandwidth;
    private Integer spreadingFactor;

}
