
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

    private static final long serialVersionUID = 563227197372542841L;
    private Double latitude;
    private Double longitude;
    private Integer altitude;
    private String source;

}
