package com.open2000.users.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumno {
	@Id
    public Long id;

    public String nombre;
}
