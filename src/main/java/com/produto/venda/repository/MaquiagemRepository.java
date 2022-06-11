package com.produto.venda.repository;

import com.produto.venda.domain.Maquiagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaquiagemRepository extends JpaRepository<Maquiagem, String> {

}
