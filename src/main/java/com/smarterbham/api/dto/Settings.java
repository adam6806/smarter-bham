
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Settings implements Serializable {

    public DataRate dataRate;
    public Integer dataRateIndex;
    public String codingRate;
    public String frequency;

}
