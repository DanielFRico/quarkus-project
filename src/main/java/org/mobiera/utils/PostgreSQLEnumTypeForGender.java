package org.mobiera.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.mobiera.enums.GenderTypes;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

@SuppressWarnings("serial")
public class PostgreSQLEnumTypeForGender extends PostgreSQLEnumType {

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		String genderValue = rs.getString(names[0]);
		return GenderTypes.fromValue(genderValue);
	}

}
