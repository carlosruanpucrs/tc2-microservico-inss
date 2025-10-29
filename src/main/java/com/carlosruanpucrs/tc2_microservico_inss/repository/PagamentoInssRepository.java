package com.carlosruanpucrs.tc2_microservico_inss.repository;

import com.carlosruanpucrs.tc2_microservico_inss.model.entity.PagamentoInssEntity;
import com.carlosruanpucrs.tc2_microservico_inss.enums.SituacaoPagamentoInssEnum;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PagamentoInssRepository extends MongoRepository<PagamentoInssEntity, String> {

    List<PagamentoInssEntity> findAllBySituacaoIs(SituacaoPagamentoInssEnum situacao);
}
