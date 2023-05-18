package com.teamcreator.creator.Modelo;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "Resultados")
@Entity
public class Resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_equipo", nullable = false)
    private Equipos equipos;

    @ManyToOne
    @JoinColumn(name = "id_pruebas", nullable = false)
    private Pruebas pruebas;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "puntos_conseguidos")
    private int puntos_conseguidos;

    @Column(name = "posicion")
    private int posicion;



    //constructor
    public Resultados(int id, Equipos equipos, Pruebas pruebas, Date fecha, int puntos_conseguidos, int posicion) {
        this.id = id;
        this.equipos = equipos;
        this.pruebas = pruebas;
        this.fecha = fecha;
        this.puntos_conseguidos = puntos_conseguidos;
        this.posicion = posicion;
    }

    public Resultados() {
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public Pruebas getPruebas() {
        return pruebas;
    }

    public void setPruebas(Pruebas pruebas) {
        this.pruebas = pruebas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPuntos_conseguidos() {
        return puntos_conseguidos;
    }

    public void setPuntos_conseguidos(int puntos_conseguidos) {
        this.puntos_conseguidos = puntos_conseguidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }


    //toString
    @Override
    public String toString() {
        return "Resultados [id=" + id + ", equipos=" + equipos + ", pruebas=" + pruebas + ", fecha=" + fecha
                + ", puntos_conseguidos=" + puntos_conseguidos + ", posicion=" + posicion + "]";
    }

    
    

    

}
