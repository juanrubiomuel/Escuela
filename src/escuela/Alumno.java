/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escuela;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Alumno")
public class Alumno implements Serializable {
    
    @Id
    @Column(name="Id")
    private int id;
    
    @Column(name="Nombre")
    private String nombre;
    
    @Column(name="Edad")
    private int edad;
    
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Direccion direccion;

    public Alumno(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Alumno(int id, String nombre, int edad, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
}
