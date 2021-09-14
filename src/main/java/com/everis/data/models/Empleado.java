package com.everis.data.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity//Representación de entidad modelo
@Table(name="empleados")//La tabla debe tener un nombre en plural y minuscula

public class Empleado {
    //id
	@Id //Clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto incrementar
	private Long id;
	private String rut;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String profesion;
	private String cargo;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt; //Fecha en que se ingresa al empleado
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt; 
	
	
	public Empleado() {
		super();
	}


	public Empleado(String rut, String nombre, String apellido, Integer edad, String profesion, String cargo){
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.profesion = profesion;
		this.cargo = cargo;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	@PrePersist //Se ejecuta antes de que sea insertado el objeto 
	protected void onCreate(){
	this.createdAt = new Date();
	}
	@PreUpdate //Se ejecuta antes de que sea actualizado el objeto
	protected void onUpdate(){
	this.updatedAt = new Date();
	}
	
	
	

}
