/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabiandeita.controlescolar.model;

import javax.persistence.*;

/**
 *
 * @author fdeitaze
 */
@Entity
@Table( name = "Estudiante" )
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="estudiante_id")
    private long estudianteId;
    
    @Column(name="nombre")
    private String nombre;

    public Estudiante(String nombre){
        this.nombre = nombre;
    }

    /**
     * @return the estudianteId
     */
    public long getEstudianteId() {
        return estudianteId;
    }

    /**
     * @param estudianteId the estudianteId to set
     */
    public void setEstudianteId(long estudianteId) {
        this.estudianteId = estudianteId;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
