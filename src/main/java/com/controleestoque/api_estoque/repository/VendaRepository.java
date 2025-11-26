package com.controleestoque.api_estoque.repository;

import com.controleestoque.api_estoque.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    @Query("SELECT v FROM Venda v JOIN FETCH v.cliente")
    List<Venda> findAllWithCliente();
}