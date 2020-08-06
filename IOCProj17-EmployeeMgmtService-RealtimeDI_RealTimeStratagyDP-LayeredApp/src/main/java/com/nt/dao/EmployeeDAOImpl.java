package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;;

public final class EmployeeDAOImpl implements EmployeeDAO {
	 private static final String EMP_INSERT_QUERY=
			 "INSERT INTO EMPLOYEE_SPRING1 VALUES(ENO_SEQ1.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	 // Alt+shift+s,0(con)
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps1 =null;
		int count1=0;
		con=ds.getConnection();
		ps1=con.prepareStatement(EMP_INSERT_QUERY);
		ps1.setString(1,(bo.geteName()));
		ps1.setString(2,(bo.geteAdd()));
		ps1.setFloat(3, (bo.geteBasicSalary()));
		ps1.setFloat(4,(bo.geteGroasssalary()));
		ps1.setFloat(5,(bo.geteNetSalary()));
		count1=ps1.executeUpdate();
				ps1.close();
				con.close();
		return count1;
	}

}
