package com.teamcreator.creator.Modelo;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Equipos")
public class Equipos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
    @Column(name = "nombre_equipo")
    private String nombre_equipo;
	
    @Column(name = "fecha_inicio_equipo")
    private LocalDate fecha_inicio_equipo;

    @Column(name = "fecha_fin_equipo")
    private LocalDate fecha_fin_equipo;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UsersPorEquipo> usersPorEquipo = new ArrayList<>();

 //constructores
    public Equipos() {
    }

    
//getters and setters
    public int getId() {
        return id;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public LocalDate getFecha_inicio_equipo() {
        return fecha_inicio_equipo;
    }

    public LocalDate getFecha_fin_equipo() {
        return fecha_fin_equipo;
    }

    public List<UsersPorEquipo> getUsersPorEquipo() {
        return usersPorEquipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public void setFecha_inicio_equipo(LocalDate fecha_inicio_equipo) {
        this.fecha_inicio_equipo = fecha_inicio_equipo;
    }

    public void setFecha_fin_equipo(LocalDate fecha_fin_equipo) {
        this.fecha_fin_equipo = fecha_fin_equipo;
    }

    public void setUsersPorEquipo(List<UsersPorEquipo> usersPorEquipo) {
        this.usersPorEquipo = usersPorEquipo;
    }

    //toString
    @Override
    public String toString() {
        return "Equipos [id=" + id + ", nombre_equipo=" + nombre_equipo + ", fecha_inicio_equipo=" + fecha_inicio_equipo
                + ", fecha_fin_equipo=" + fecha_fin_equipo + ", usersPorEquipo=" + usersPorEquipo + "]";
    }
    
  
  
   
   
	
}	

    

