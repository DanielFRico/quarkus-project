package org.mobiera.enums;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

public class CustomPostgreSQLEnumType extends PostgreSQLEnumType{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3706113547822714621L;
	
	@Override
	public void nullSafeSet(
            PreparedStatement st,
            Object value,
            int index,
            SharedSessionContractImplementor session)
            throws HibernateException, SQLException {
        st.setObject(index, value != null ? ((Enum) value).toString() : null, Types.OTHER);
    }

}
