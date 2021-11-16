
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
public class DataRate implements Serializable {

    private static final long serialVersionUID = 4898521423137604625L;
    private Lora lora;

}
