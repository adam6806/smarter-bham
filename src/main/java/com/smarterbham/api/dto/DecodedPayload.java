
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class DecodedPayload implements Serializable {

    private Integer ambientLight;
    private Double battery;
    private Integer celsius;
    private Integer dewpoint;
    private Integer ir;
    private Integer particulate1;
    private Integer particulate10;
    private Integer particulate2dot5;
    private Integer particulate4;
    private Double pressure;
    private Integer relativeHumidity;
    private Integer uv;
    private Integer voc;

}
