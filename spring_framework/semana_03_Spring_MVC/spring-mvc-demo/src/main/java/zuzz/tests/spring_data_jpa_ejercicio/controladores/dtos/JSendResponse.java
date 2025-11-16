package zuzz.tests.spring_data_jpa_ejercicio.controladores.dtos;

import lombok.Data;

@Data
public class JSendResponse {

    private String status;
    private String message;
    private String data;
    private Long code;
}
