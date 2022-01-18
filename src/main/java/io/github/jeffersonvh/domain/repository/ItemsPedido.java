package io.github.jeffersonvh.domain.repository;

import io.github.jeffersonvh.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
