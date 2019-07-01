package com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.dao;
import java.util.ArrayList;
import java.util.List;

import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.domain.withdraw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WithdrawDaoImpl implements WithdrawDao {

	Db2Connection dbConnection;

	public WithdrawDaoImpl() {
		dbConnection = new Db2Connection();
	}

	public List<withdraw> findAllWidthdrawTrans() {

		List<withdraw> withdraw1 = new ArrayList<>();

		String sql1 = "SELECT * FROM WithdrawTBL";
		try (Connection conn1 = dbConnection.getConnection(); PreparedStatement ps1 = conn1.prepareStatement(sql1);) {
			ResultSet results1 = ps1.executeQuery();
			System.out.println("Came here.");
			while(results1.next()) {
				
				withdraw withdraw2 = new withdraw
						(results1.getInt("withdrawID"),
						 results1.getString("accountNumber"),
						 results1.getString("accountType"),
						 results1.getDouble("amount"),
						 results1.getDate("transDate"),
						 results1.getDouble("balance")
						);
				
				withdraw1.add(withdraw2);
				System.out.println("Account number: " + withdraw2.getAccountNumber());
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return withdraw1;
	}
}
