package io.github.jeffersonvh.domain.repository;

import io.github.jeffersonvh.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
