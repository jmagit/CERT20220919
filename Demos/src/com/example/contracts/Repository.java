/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.contracts;

import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;
import java.util.List;
import java.util.Optional;

/**
 * Contrato de los repositorios a bases de datos
 * @author Javier
 * @param <E> Tipo de la entidad
 * @param <K> Tipo de la clave primaria
 */
public interface Repository<E, K> {

    List<E> getAll();

    Optional<E> getOne(K id);

    E add(E item) throws DuplicateKeyException, InvalidDataException;

    E modify(E item) throws NotFoundException, InvalidDataException;

    void delete(E item) throws NotFoundException, InvalidDataException;

    void deleteById(K id) throws NotFoundException;

}
