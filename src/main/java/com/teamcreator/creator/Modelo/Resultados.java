package com.teamcreator.creator.Modelo;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;



@Table(name = "Resultados")
@Entity
public class Resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_equipo", nullable = false)
    private Equipos equipos;

    @ManyToOne
    @JoinColumn(name = "id_pruebas", nullable = false)
    private Pruebas pruebas;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha")
    private java.util.Date fecha;
    
    @Column(name = "puntos_conseguidos")
    private int puntos_conseguidos;

    @Column(name = "posicion")
    private Integer posicion;



    //constructor
    public Resultados(Integer id, Equipos equipos, Pruebas pruebas, Date fecha, Integer puntos_conseguidos, Integer posicion) {
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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getPuntos_conseguidos() {
        return puntos_conseguidos;
    }

    public void setPuntos_conseguidos(Integer puntos_conseguidos) {
        this.puntos_conseguidos = puntos_conseguidos;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }


    //toString
    /*@Override
    public String toString() {
        return "Resultados [id=" + id + ", equipos=" + equipos + ", pruebas=" + pruebas + ", fecha=" + fecha
                + ", puntos_conseguidos=" + puntos_conseguidos + ", posicion=" + posicion + "]";
    }
*/
  
@Override
public String toString() {
    return "Resultados [id=" + id + ", equiposId=" + (equipos != null ? equipos.getId() : null)
            + ", pruebasId=" + (pruebas != null ? pruebas.getId() : null) + ", fecha=" + fecha
            + ", puntos_conseguidos=" + puntos_conseguidos + ", posicion=" + posicion + "]";
}

    

    

}
