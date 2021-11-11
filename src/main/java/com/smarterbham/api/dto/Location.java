
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Location implements Serializable {

    private Double latitude;
    private Double longitude;
    private Integer altitude;

}
