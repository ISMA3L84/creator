package com.teamcreator.creator.Modelo;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;



@Entity
@Table(name = "Pruebas")
public class Pruebas{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pruebas", orphanRemoval = true)
    private Set<Resultados> resultados = new HashSet<>();

    /*@OneToMany(mappedBy = "pruebas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Resultados> resultados = new ArrayList<>();
    */
    @Column(name = "nombre_prueba")
    private String nombre_prueba;

    @Column(name = "descripcion_prueba")
    private String descripcion_prueba;

    @Column(name = "puntos")
    private Integer puntos;

    @Column(name = "equipamiento_especial_obligatorio")
    private String equipamiento_especial_obligatorio;

    @Column(name = "advertencias")
    private String advertencias;

    @Column(name = "edad_minima_recomendada")
    private Integer edad_minima_recomendada;

    @Column(name = "duracion_estimada_aprox")
    private LocalTime duracion_estimada_aprox;

    //constructor
    public Pruebas() {
        
    }
    



    public Pruebas(Integer id, Set<Resultados> resultados, String nombre_prueba, String descripcion_prueba,
            Integer puntos, String equipamiento_especial_obligatorio, String advertencias,
            Integer edad_minima_recomendada, LocalTime duracion_estimada_aprox) {
        this.id = id;
        this.resultados = resultados;
        this.nombre_prueba = nombre_prueba;
        this.descripcion_prueba = descripcion_prueba;
        this.puntos = puntos;
        this.equipamiento_especial_obligatorio = equipamiento_especial_obligatorio;
        this.advertencias = advertencias;
        this.edad_minima_recomendada = edad_minima_recomendada;
        this.duracion_estimada_aprox = duracion_estimada_aprox;
    }




    //getters and setters
   
    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
    }




    public Set<Resultados> getResultados() {
        return resultados;
    }




    public void setResultados(Set<Resultados> resultados) {
        this.resultados = resultados;
    }




    public String getNombre_prueba() {
        return nombre_prueba;
    }




    public void setNombre_prueba(String nombre_prueba) {
        this.nombre_prueba = nombre_prueba;
    }




    public String getDescripcion_prueba() {
        return descripcion_prueba;
    }




    public void setDescripcion_prueba(String descripcion_prueba) {
        this.descripcion_prueba = descripcion_prueba;
    }




    public Integer getPuntos() {
        return puntos;
    }




    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }




    public String getEquipamiento_especial_obligatorio() {
        return equipamiento_especial_obligatorio;
    }




    public void setEquipamiento_especial_obligatorio(String equipamiento_especial_obligatorio) {
        this.equipamiento_especial_obligatorio = equipamiento_especial_obligatorio;
    }




    public String getAdvertencias() {
        return advertencias;
    }




    public void setAdvertencias(String advertencias) {
        this.advertencias = advertencias;
    }




    public Integer getEdad_minima_recomendada() {
        return edad_minima_recomendada;
    }




    public void setEdad_minima_recomendada(Integer edad_minima_recomendada) {
        this.edad_minima_recomendada = edad_minima_recomendada;
    }




    public LocalTime getDuracion_estimada_aprox() {
        return duracion_estimada_aprox;
    }




    public void setDuracion_estimada_aprox(LocalTime duracion_estimada_aprox) {
        this.duracion_estimada_aprox = duracion_estimada_aprox;
    }


    //toString
   /*  @Override
    public String toString() {
        return "Pruebas [id=" + id + ", resultados=" + resultados + ", nombre_prueba=" + nombre_prueba
                + ", descripcion_prueba=" + descripcion_prueba + ", puntos=" + puntos
                + ", equipamiento_especial_obligatorio=" + equipamiento_especial_obligatorio + ", advertencias="
                + advertencias + ", edad_minima_recomendada=" + edad_minima_recomendada + ", duracion_estimada_aprox="
                + duracion_estimada_aprox + "]";
    }
*/

@Override
public String toString() {
    return "Pruebas [id=" + id + ", nombre_prueba=" + nombre_prueba
            + ", descripcion_prueba=" + descripcion_prueba + ", puntos=" + puntos
            + ", equipamiento_especial_obligatorio=" + equipamiento_especial_obligatorio + ", advertencias="
            + advertencias + ", edad_minima_recomendada=" + edad_minima_recomendada + ", duracion_estimada_aprox="
            + duracion_estimada_aprox + "]";
}



   
    
    

    
    
    
}
