package com.gaap.mp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <div style="font-siza: 130%;">Employee model<div/>
 * <ul>
 * <li>Class model for Employee</li>
 * </ul>
 */

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String code;
	private String nameEmployee;
	private String lastNameEmployee;
	private String rol;
	private String mail;
	public Employee() {
	}	
	
	
	public Employee(String code, String nameEmployee, String lastNameEmployee, String rol, String mail) {
		super();
		this.code = code;
		this.nameEmployee = nameEmployee;
		this.lastNameEmployee = lastNameEmployee;
		this.rol = rol;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getLastNameEmployee() {
		return lastNameEmployee;
	}
	public void setLastNameEmployee(String lastNameEmployee) {
		this.lastNameEmployee = lastNameEmployee;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Employee [code=" + code + ", nameEmployee=" + nameEmployee + ", lastNameEmployee=" + lastNameEmployee
				+ ", rol=" + rol + ", mail=" + mail + "]";
	}
	

}
