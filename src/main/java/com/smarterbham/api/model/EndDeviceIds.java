
package com.smarterbham.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EndDeviceIds implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String deviceId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "application_ids_id")
    private ApplicationIds applicationIds;
    private String devEui;
    private String joinEui;
    private String devAddr;

}
