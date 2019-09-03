package com.springboot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for holding user's basic information
 * @author adharsh.moorthy
 *
 */
@Entity
@Table(name="UserInfo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable{

	/**
	 * The default serializable versioning
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	@NotNull(message = "Id is required")
	private String id;
	
	@Column(name="fName")
	@NotNull(message = "First name is required")
	private String fName;
	
	@Column(name="lName")
	@NotNull(message = "Last name is required")
	private String lName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pinCode")
	private int pinCode;
	
	@Column(name="date")
	private Date date;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
