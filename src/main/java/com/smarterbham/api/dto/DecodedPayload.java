
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class DecodedPayload implements Serializable {

    private final static long serialVersionUID = -6643758045911795161L;
    public Integer ambientLight;
    public Double battery;
    public Integer celsius;
    public Integer dewpoint;
    public Integer ir;
    public Integer particulate1;
    public Integer particulate10;
    public Integer particulate2dot5;
    public Integer particulate4;
    public Double pressure;
    public Integer relativeHumidity;
    public Integer uv;
    public Integer voc;

}
