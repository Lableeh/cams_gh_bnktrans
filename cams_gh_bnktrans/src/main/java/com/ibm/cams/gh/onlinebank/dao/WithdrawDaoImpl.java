package com.ibm.cams.gh.onlinebank.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ibm.cams.gh.onlinebank.domain.withdraw;

public class WithdrawDaoImpl implements Withdraw {

	Db2Connection dbConnection;

	public WithdrawDaoImpl() {
		dbConnection = new Db2Connection();
	}

	public List<withdraw> findAllWidthdrawTrans() {

		List<withdraw> withdraw1 = new ArrayList<>();

		String sql1 = "SELECT * FROM WithdrawTBL ";
		try (Connection conn1 = dbConnection.getConnection(); PreparedStatement ps1 = conn1.prepareStatement(sql1);) {
			ResultSet results1 = ps1.executeQuery();
			
			while(results1.next()) {
				withdraw withdraw1 = new withdraw
						(results1.getInt("withdrawID"),
						 results1.getString("accountNumber"),
						 results1.getString("accountType"),
						 results1.getDouble("amount"),
						 results1.getDate("transDate"),
						 results1.getDouble("balance")
						)
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
//		return
	}
}
