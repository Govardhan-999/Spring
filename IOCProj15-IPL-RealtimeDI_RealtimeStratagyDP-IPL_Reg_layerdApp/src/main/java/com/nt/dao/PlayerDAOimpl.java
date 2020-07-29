package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PlayerBO;

public final class PlayerDAOimpl implements PlayerDAO {
private static final String PLAYER_INSERT_QUERY="INSERT INTO  SPRING_PLAYERS VALUES(PNO_SEQ1.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	 
public PlayerDAOimpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public int insert(PlayerBO bo) throws Exception {
		Connection con=null; 
		PreparedStatement ps=null;
		int count=0;
		con=ds.getConnection();
		ps=con.prepareStatement(PLAYER_INSERT_QUERY);
		ps.setString(1,bo.getpName());
		ps.setString(2,bo.getpCountry());
		ps.setInt( 3, bo.getpInnings());
		ps.setDouble( 4, bo.getpBattingAvg());
		ps.setDouble( 5, bo.getpBowlingAvg());
		count=ps.executeUpdate();  
		ps.close();
	   con.close();
		return count;
	}
 
}
