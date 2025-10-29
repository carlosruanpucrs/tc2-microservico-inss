package com.carlosruanpucrs.tc2_microservico_inss.mapper;

import com.carlosruanpucrs.tc2_microservico_inss.api.request.PagamentoInssRequest;
import com.carlosruanpucrs.tc2_microservico_inss.model.entity.PagamentoInssEntity;

public class InssMapper {

    public static PagamentoInssRequest mapToPagamentoInssRequest(PagamentoInssEntity entity) {
        return PagamentoInssRequest.builder()
                .idInss(entity.getId())
                .numeroConta(entity.getNumeroConta())
                .numeroBeneficio(entity.getNumeroBeneficio())
                .dataPagamento(entity.getDataPagamento())
                .valorPagamento(entity.getValorPagamento())
                .situacao(entity.getSituacao())
                .build();
    }

}
