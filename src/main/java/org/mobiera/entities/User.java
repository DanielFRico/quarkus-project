package org.mobiera.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class User {

	@Id
	public Long id_number;

	@Column(nullable = false, length = 40)
	public String name;

	@Column(nullable = false,length = 40)
	public String lastname;

	@Column(nullable = false)
	public LocalDate date_of_birth;

	@Column(nullable = false, precision = 3, scale = 2)
	public BigDecimal height;

	@Column(nullable = false)
	public String blood_type;

	@Column(nullable = false)
	public String gender;

	public Long getId_number() {
		return id_number;
	}

	public void setId_number(Long id_number) {
		this.id_number = id_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
