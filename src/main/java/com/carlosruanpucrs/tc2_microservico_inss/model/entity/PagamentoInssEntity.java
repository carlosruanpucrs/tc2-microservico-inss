package com.carlosruanpucrs.tc2_microservico_inss.model.entity;

import com.carlosruanpucrs.tc2_microservico_inss.enums.SituacaoPagamentoInssEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "pagamentos_inss")
public class PagamentoInssEntity {

    @Id
    String id;

    Integer numeroConta;
    Integer numeroBeneficio;
    LocalDate dataPagamento;
    BigDecimal valorPagamento;
    SituacaoPagamentoInssEnum situacao;
    String comprovantePagamento;
}