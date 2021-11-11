
package com.smarterbham.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DecodedPayload implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
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
