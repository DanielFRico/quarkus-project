package org.mobiera.enums;

public enum BloodTypes {

	/*
	 * Enums The serialization of an enum value calls the name() method to return a
	 * String representation of the enum constant. This is especially important
	 * because the deserialization operation calls the valueOf() method and passes
	 * it the property value. Roundtrip equivalence is respected for enums.
	 */
	A_PLUS("A+");

	String value;

	BloodTypes(String string) {
		this.value = string;
	}

	@Override
	public String toString() {
		return value;
	}

}
