package com.hg.demo.crud.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.demo.crud.modelo.ProductoDTO;

@Repository
public interface ProductoDAO extends MongoRepository<ProductoDTO, String>{

}
