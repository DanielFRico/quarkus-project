package org.mobiera.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.mobiera.enums.BloodTypes;
import org.mobiera.enums.GenderTypes;
import org.mobiera.utils.PostgreSQLEnumTypeForBloodTypes;
import org.mobiera.utils.PostgreSQLEnumTypeForGender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@TypeDefs({ @TypeDef(name = "pgsql_blood_type_enum", typeClass = PostgreSQLEnumTypeForBloodTypes.class),
		@TypeDef(name = "pgsql_gender_enum", typeClass = PostgreSQLEnumTypeForGender.class) })
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

	@Type(type = "pgsql_blood_type_enum")
	@Column(nullable = false)
	public BloodTypes blood_type;

	@Type(type = "pgsql_gender_enum")
	@Column(nullable = false)
	public GenderTypes gender;

}
