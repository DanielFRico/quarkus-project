package org.mobiera.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.mobiera.enums.Gender;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
@TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class)
public class User {

	@Id
	public Long id_number;

	@Column(nullable = false, length = 40)
	public String name;

	@Column(nullable = false, length = 40)
	public String last_name;

	@Column(nullable = false)
	public LocalDate date_of_birth;

	@Column(nullable = false, precision = 3, scale = 2)
	public BigDecimal height;

	@Column(nullable = false)
	public String blood_type;

	@Enumerated(EnumType.STRING)
	@Type(type = "pgsql_enum")
	@Column(nullable = false)
	public Gender gender;

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
		return last_name;
	}

	public void setLastname(String lastname) {
		this.last_name = lastname;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
