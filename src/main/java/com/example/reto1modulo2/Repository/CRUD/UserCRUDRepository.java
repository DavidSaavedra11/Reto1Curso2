package com.example.reto1modulo2.Repository.CRUD;

import com.example.reto1modulo2.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCRUDRepository extends CrudRepository<User, Integer> {

    // La siguiente linea es como hacer una sentencia sql igual a la siguiente:
    // SELECT * FROM USUARIOS WHERE EMAIL = emailRecibido
    public Optional<User> findByEmail(String email);

    public Optional<User> findAllByEmailAndPassword(String email, String password);

}
