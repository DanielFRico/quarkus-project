package org.mobiera.enums;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BloodTypeConverter implements AttributeConverter<BloodTypes,String>{

	@Override
	public String convertToDatabaseColumn(BloodTypes attribute) {
		return "A+";
	}

	@Override
	public BloodTypes convertToEntityAttribute(String dbData) {
		return BloodTypes.A_PLUS;
	}

}
