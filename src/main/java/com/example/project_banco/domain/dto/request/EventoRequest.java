package com.example.project_banco.domain.dto.request;


import java.util.Date;

import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventoRequest {

    //@NotEmpty(message = "Id_Evento_Status is required")
    private Integer IdEventoStatus;

    //@NotEmpty(message = "Id_Categoria_Evento is required")
    private Integer IdCategoriaEvento;

    @NotEmpty(message = "Nome is required")
    private String Nome;

    //@NotEmpty(message = "Data_Hora_Inicio is required")
    private Date DataHoraInicio;

    //@NotEmpty(message = "Data_Hora_Fim is required")
    private Date DataHoraFim;

    @NotEmpty(message = "Local is required")
    private String Local;

    @NotEmpty(message = "Descricao is required")
    private String Descricao;

    //@NotEmpty(message = "Limite_Vagas is required")
    private Integer LimiteVagas;
}
