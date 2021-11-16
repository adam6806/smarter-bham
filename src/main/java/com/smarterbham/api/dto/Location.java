
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
public class Location implements Serializable {

    private final static long serialVersionUID = 563227197372542841L;
    public Double latitude;
    public Double longitude;
    public Integer altitude;
    public String source;

}
