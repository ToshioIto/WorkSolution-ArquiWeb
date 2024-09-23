package upc.edu.pe.worksolutionapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roles")//la tabla en postgres se llamará roles
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //es el id de los roles y se generaran de manera automatica

    @Column(unique = true, nullable = false)
    private String name;//el nombre del rol y debe ser única para evitar duplicidad de datos

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long micId) {
        this.id = micId;
    }

    public String getName() {
        return name;
    }

    public void setName(String micName) {
        this.name = micName;
    }
}

