package org.mobiera.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.mobiera.enums.BloodTypes;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

@SuppressWarnings("serial")
public class PostgreSQLEnumTypeForBloodTypes extends PostgreSQLEnumType {

	@Override
	public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner)
			throws HibernateException, SQLException {
		String bloodTypeValue = rs.getString(names[0]);
		return BloodTypes.fromValue(bloodTypeValue);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		st.setObject(index, value != null ? ((Enum) value).toString() : null, Types.OTHER);
	}

}
