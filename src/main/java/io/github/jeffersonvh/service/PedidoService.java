package io.github.jeffersonvh.service;

import io.github.jeffersonvh.domain.entity.Pedido;
import io.github.jeffersonvh.domain.enums.StatusPedido;
import io.github.jeffersonvh.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
