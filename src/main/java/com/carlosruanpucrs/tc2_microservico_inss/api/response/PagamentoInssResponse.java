package com.carlosruanpucrs.tc2_microservico_inss.api.response;

import com.carlosruanpucrs.tc2_microservico_inss.enums.SituacaoPagamentoInssEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PagamentoInssResponse {

    String idInss;
    String comprovante;
    SituacaoPagamentoInssEnum resultado;
}
