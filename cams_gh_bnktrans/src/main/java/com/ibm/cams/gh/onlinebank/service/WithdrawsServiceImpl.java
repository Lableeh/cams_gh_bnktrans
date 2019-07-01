package com.ibm.cams.gh.onlinebank.service;
import java.util.List;

import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.dao.WithdrawDao;
import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.dao.WithdrawDaoImpl;
import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.domain.withdraw;

public class WithdrawsServiceImpl implements withdrawsService {
	WithdrawDao withdrawDao;
	
	public WithdrawsServiceImpl() {
		withdrawDao = new WithdrawDaoImpl();
	}
	
	@Override
	public List<withdraw> findAllWidthdrawTrans(){
		return withdrawDao.findAllWidthdrawTrans();
	}
}
