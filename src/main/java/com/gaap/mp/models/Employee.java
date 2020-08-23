package com.gaap.mp.models;

import javax.persistence.*;

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

    /**
     * Instantiates a new Employee.
     */
    public Employee() {
	}


    /**
     * Instantiates a new Employee.
     *
     * @param code             the code
     * @param nameEmployee     the name employee
     * @param lastNameEmployee the last name employee
     * @param rol              the rol
     * @param mail             the mail
     */
    public Employee(String code, String nameEmployee, String lastNameEmployee, String rol, String mail) {
		super();
		this.code = code;
		this.nameEmployee = nameEmployee;
		this.lastNameEmployee = lastNameEmployee;
		this.rol = rol;
		this.mail = mail;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
		return id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
		this.id = id;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets name employee.
     *
     * @return the name employee
     */
    public String getNameEmployee() {
		return nameEmployee;
	}

    /**
     * Sets name employee.
     *
     * @param nameEmployee the name employee
     */
    public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

    /**
     * Gets last name employee.
     *
     * @return the last name employee
     */
    public String getLastNameEmployee() {
		return lastNameEmployee;
	}

    /**
     * Sets last name employee.
     *
     * @param lastNameEmployee the last name employee
     */
    public void setLastNameEmployee(String lastNameEmployee) {
		this.lastNameEmployee = lastNameEmployee;
	}

    /**
     * Gets rol.
     *
     * @return the rol
     */
    public String getRol() {
		return rol;
	}

    /**
     * Sets rol.
     *
     * @param rol the rol
     */
    public void setRol(String rol) {
		this.rol = rol;
	}

    /**
     * Gets mail.
     *
     * @return the mail
     */
    public String getMail() {
		return mail;
	}

    /**
     * Sets mail.
     *
     * @param mail the mail
     */
    public void setMail(String mail) {
		this.mail = mail;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_idUserCredentials")
	private UserCredentials userCredentials;


	@Override
	public String toString() {
		return "Employee [code=" + code + ", nameEmployee=" + nameEmployee + ", lastNameEmployee=" + lastNameEmployee
				+ ", rol=" + rol + ", mail=" + mail + "]";
	}

	

}
