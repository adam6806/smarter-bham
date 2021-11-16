
package com.smarterbham.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class DataRate implements Serializable {

    private final static long serialVersionUID = 4898521423137604625L;
    public Lora lora;

}
