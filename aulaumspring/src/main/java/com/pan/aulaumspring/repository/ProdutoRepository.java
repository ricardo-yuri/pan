package com.pan.aulaumspring.repository;

import com.pan.aulaumspring.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
