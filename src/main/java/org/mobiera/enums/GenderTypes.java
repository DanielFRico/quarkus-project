package org.mobiera.enums;

public enum GenderTypes {
	MALE,FEMALE,ND;	
	
	public static GenderTypes fromValue(String value) {
		switch (value) {
		case "MALE":
			return GenderTypes.MALE;
		case "FEMALE":
			return GenderTypes.FEMALE;
		case "ND":
			return GenderTypes.ND;
		default:
			throw new IllegalArgumentException("ShortName [" + value + "] not supported.");
		}
	}
}
