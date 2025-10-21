package com.example.sospets.controllers.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class StandartError {

    LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String path;
}
