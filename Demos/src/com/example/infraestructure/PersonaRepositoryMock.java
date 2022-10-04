/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.infraestructure;

import com.example.contracts.PersonaRepository;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;
import com.example.tipos.Alumno;
import com.example.tipos.Persona;
import com.example.tipos.Profesor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Javier
 */
public class PersonaRepositoryMock implements PersonaRepository {

    private static Map<Integer, Persona> store;

    static {
        store = new HashMap<>();
        store.put(1, new Profesor(1, "Profe 1", "1995-05-01", 2000));
        store.put(99, new Profesor(99, "Profe 2", "1991-01-01", 1700));
        store.put(5, new Alumno(5, "Pedrito", "1999-01-01", 7.0, 6.0, 5.0));
        store.put(3, new Alumno(3, "Pepito", "1990-01-01", 5.0, 6.0, 7.0));
        store.put(4, new Alumno(4, "Maria del Carmen", "2001-07-16", 7.0));
        store.put(6, new Alumno(6, "Pedrito", "2006-12-31", 5.0, 5.0));
        store.put(2, new Profesor(2, "Suplente", "1990-05-17", 1100));        
        store.put(7, new Alumno(7, "Maripili", "1994-10-12", 6.0, 6.0, 8.0));
    }

    @Override
    public List<Persona> getAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Persona> getOne(Integer id) {
        if (store.containsKey(id)) {
            return Optional.of(store.get(id));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Persona add(Persona item) throws DuplicateKeyException, InvalidDataException {
        if (item == null) {
            throw new InvalidDataException();
        }
        if (store.containsKey(item.getId())) {
            throw new DuplicateKeyException();
        }
        store.put(item.getId(), item);
        return item;
    }

    @Override
    public Persona modify(Persona item) throws NotFoundException, InvalidDataException {
        if (item == null) {
            throw new InvalidDataException();
        }
        if (!store.containsKey(item.getId())) {
            throw new NotFoundException();
        }
        store.put(item.getId(), item);
        return item;
    }

    @Override
    public void delete(Persona item) throws NotFoundException, InvalidDataException {
        if (item == null) {
            throw new InvalidDataException();
        }
        deleteById(item.getId());
    }

    @Override
    public void deleteById(Integer id) throws NotFoundException {
        if (!store.containsKey(id)) {
            throw new NotFoundException();
        }
        store.remove(id);
    }
}
