package br.com.devsenior.ds_client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsenior.ds_client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
