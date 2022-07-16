package com.open2000.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open2000.users.models.Alumno;
import com.open2000.users.repository.AlumnosRepository;

@RestController
@RequestMapping(path = "/alumnos")
@CrossOrigin(origins = "http://localhost")
public class AlumnosController {
    @Autowired
    private AlumnosRepository alumnosRepository;

    @PostMapping("/crear")
    public Alumno crearAlumno(@RequestBody Alumno alumno) {
        return alumnosRepository.save(alumno);
    }

    @GetMapping("/obtener")
    public Iterable<Alumno> obtenerTodos() {
        return alumnosRepository.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean eliminar(@PathVariable() Long id) {
        alumnosRepository.deleteById(id);
        return true;
    }

    @PutMapping("/actualizar")
    public Alumno editar(@RequestBody Alumno alumno) {
        return alumnosRepository.save(alumno);
    }
}