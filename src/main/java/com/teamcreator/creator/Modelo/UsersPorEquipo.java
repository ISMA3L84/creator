package com.teamcreator.creator.Modelo;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Table(name = "UsersporEquipo")
@Entity
public class UsersPorEquipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_equipo", nullable = false)
	private Equipos equipos;

	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user;
//constructores

	public UsersPorEquipo() {
	}

	public UsersPorEquipo(Integer id, Equipos equipos, User user) {
		this.id = id;
		this.equipos = equipos;
		this.user = user;
	}

//getter and setters
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//toString
	@Override
	public String toString() {
		return "UsersPorEquipo [id=" + id + ", equipos=" + equipos + ", user=" + user + "]";
	}

   
	
}	
