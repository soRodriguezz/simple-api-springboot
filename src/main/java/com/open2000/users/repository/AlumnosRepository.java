package com.open2000.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.open2000.users.models.Alumno;

public interface AlumnosRepository extends CrudRepository<Alumno, Long> {
}
