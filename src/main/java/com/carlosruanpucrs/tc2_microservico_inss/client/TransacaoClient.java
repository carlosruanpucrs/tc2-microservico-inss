package com.carlosruanpucrs.tc2_microservico_inss.client;

import com.carlosruanpucrs.tc2_microservico_inss.api.request.PagamentoInssRequest;
import com.carlosruanpucrs.tc2_microservico_inss.api.response.PagamentoInssResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "transacao-service", path = "/v1/pagamentos/inss")
public interface TransacaoClient {

    @GetMapping("/{numeroConta}")
    ResponseEntity<PagamentoInssResponse> pagarInss(@RequestBody PagamentoInssRequest request);
}