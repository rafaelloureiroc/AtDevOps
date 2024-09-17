package com.tp1Pedido.Repository;

import com.tp1Pedido.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}