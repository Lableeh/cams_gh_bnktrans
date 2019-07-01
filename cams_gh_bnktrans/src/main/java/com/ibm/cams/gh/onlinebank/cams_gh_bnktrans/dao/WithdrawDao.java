package com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.dao;

import java.util.List;

import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.domain.withdraw;


public interface WithdrawDao {
	
	public List<withdraw> findAllWidthdrawTrans();
	
}