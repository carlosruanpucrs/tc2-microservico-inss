package com.carlosruanpucrs.tc2_microservico_inss.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PagamentoInssDto {

    Integer numeroConta;
    Integer numeroBeneficio;
    BigDecimal valor;
    LocalDate dataPagamento;
}
