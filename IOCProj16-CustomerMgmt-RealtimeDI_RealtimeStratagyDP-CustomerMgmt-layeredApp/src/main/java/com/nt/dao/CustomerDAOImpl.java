package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerDAOImpl implements CustomerDAO {
	 private static final String CUSTOMER_INSERT_QUERY=
			 "INSERT INTO SPRING_CUSTOMER VALUES(CNO_SEQ1.NEXTVAL,?,?,?,?)";
	private DataSource ds;
	 // Alt+shift+s,0(con)
	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps =null;
		int count=0;
		con=ds.getConnection();
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		ps.setString(1,bo.getCname());
		ps.setString(2,bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(4, bo.getIntrstAmt());
		count=ps.executeUpdate();
				ps.close();
				con.close();
		return count;
	}

}
