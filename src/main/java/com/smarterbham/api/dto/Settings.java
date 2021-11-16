
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
    public String codingRate;
    public String frequency;
    private final static long serialVersionUID = 6910320660131043171L;
    public Integer timestamp;
    public String time;

}
