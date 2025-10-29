package com.carlosruanpucrs.tc2_microservico_inss.api.request;

import com.carlosruanpucrs.tc2_microservico_inss.enums.SituacaoPagamentoInssEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PagamentoInssRequest {

    String idInss;
    Integer numeroConta;
    Integer numeroBeneficio;
    LocalDate dataPagamento;
    BigDecimal valorPagamento;
    SituacaoPagamentoInssEnum situacao;
}