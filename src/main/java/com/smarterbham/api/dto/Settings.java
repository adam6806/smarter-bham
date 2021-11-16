
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
public class Settings implements Serializable {

    private static final long serialVersionUID = 6910320660131043171L;
    private DataRate dataRate;
    private String codingRate;
    private String frequency;
    private String time;

}
