package com.example.project_banco.domain.dto.request;


import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatusEventoRequest {

    @NotEmpty(message = "Nome Status is required")
    private String NomeStatus;

}