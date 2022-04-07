CREATE TYPE blood_types AS ENUM ('A+', 'A-', 'B+','B-','O+','O-','AB+','AB-');
CREATE TYPE gender_types AS ENUM('MALE', 'FEMALE', 'ND');
CREATE TABLE users (
	id_number int8 NOT NULL,
	name varchar NOT NULL,
	last_name varchar NOT NULL,
	date_of_birth date NOT NULL,
	height numeric(3, 2) NOT NULL,
	blood_type blood_types NOT NULL,
	gender gender_types NOT NULL,
	CONSTRAINT users_pk PRIMARY KEY (id_number)
);