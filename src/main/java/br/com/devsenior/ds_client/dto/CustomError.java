package br.com.devsenior.ds_client.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomError {
    
    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;
}
