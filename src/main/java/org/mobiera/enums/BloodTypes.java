package org.mobiera.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BloodTypes {

	@JsonProperty("A+")
	A_PLUS("A+"),

	@JsonProperty("A-")
	A_MINUS("A-"),

	@JsonProperty("B+")
	B_PLUS("B+"),

	@JsonProperty("B-")
	B_MINUS("B-"),

	@JsonProperty("O+")
	O_PLUS("O-"),

	@JsonProperty("O-")
	O_MINUS("O-"),

	@JsonProperty("AB+")
	AB_PLUS("AB+"),

	@JsonProperty("AB-")
	AB_MINUS("AB-");

	String value;

	BloodTypes(String string) {
		this.value = string;
	}

	@Override
	public String toString() {
		return value;
	}

	public static BloodTypes fromValue(String value) {
		switch (value) {
		case "A+":
			return BloodTypes.A_PLUS;
		case "A-":
			return BloodTypes.A_MINUS;
		case "B+":
			return BloodTypes.B_PLUS;
		case "B-":
			return BloodTypes.B_MINUS;
		case "O+":
			return BloodTypes.O_PLUS;
		case "O-":
			return BloodTypes.O_MINUS;
		case "AB+":
			return BloodTypes.AB_PLUS;
		case "AB-":
			return BloodTypes.AB_MINUS;
		default:
			throw new IllegalArgumentException("ShortName [" + value + "] not supported.");
		}
	}

}
