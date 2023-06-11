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
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Equipos")
public class Equipos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

    @Column(name = "nombre_equipo")
    private String nombreEquipo;
	
    @Column(name = "fecha_inicio_equipo")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha_inicio_equipo;

    @Column(name = "fecha_fin_equipo")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha_fin_equipo;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "equipos", orphanRemoval = true)
    private Set<UsersPorEquipo> usersPorEquipo = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "equipos", orphanRemoval = true)
    private Set<Resultados> resultados = new HashSet<>();
 //constructores
    public Equipos() {
    }

 public Equipos(Integer id, String nombreEquipo, LocalDate fecha_inicio_equipo, LocalDate fecha_fin_equipo,
            Set<UsersPorEquipo> usersPorEquipo, Set<Resultados> resultados) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.fecha_inicio_equipo = fecha_inicio_equipo;
        this.fecha_fin_equipo = fecha_fin_equipo;
        this.usersPorEquipo = usersPorEquipo;
        this.resultados = resultados;
    }

    //getter y setter
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public LocalDate getFecha_inicio_equipo() {
        return fecha_inicio_equipo;
    }

    public void setFecha_inicio_equipo(LocalDate fecha_inicio_equipo) {
        this.fecha_inicio_equipo = fecha_inicio_equipo;
    }

    public LocalDate getFecha_fin_equipo() {
        return fecha_fin_equipo;
    }

    public void setFecha_fin_equipo(LocalDate fecha_fin_equipo) {
        this.fecha_fin_equipo = fecha_fin_equipo;
    }

    public Set<UsersPorEquipo> getUsersPorEquipo() {
        return usersPorEquipo;
    }

    public void setUsersPorEquipo(Set<UsersPorEquipo> usersPorEquipo) {
        this.usersPorEquipo = usersPorEquipo;
    }

    public Set<Resultados> getResultados() {
        return resultados;
    }

    public void setResultados(Set<Resultados> resultados) {
        this.resultados = resultados;
    }


    /*@Override
    public String toString() {
        return "Equipos [id=" + id + ", nombreEquipo=" + nombreEquipo + ", fecha_inicio_equipo=" + fecha_inicio_equipo
                + ", fecha_fin_equipo=" + fecha_fin_equipo + ", usersPorEquipo=" + usersPorEquipo + ", resultados="
                + resultados + "]";
    }
*/

@Override
public String toString() {
    return "Equipos [id=" + id + ", nombreEquipo=" + nombreEquipo + ", fecha_inicio_equipo=" + fecha_inicio_equipo
            + ", fecha_fin_equipo=" + fecha_fin_equipo + "]";
}


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(String.class, LocalDate.class,
                source -> LocalDate.parse(source, DateTimeFormatter.ISO_DATE));
    }
}


}