package com.ibm.cams.gh.onlinebank.service;

import java.util.List;

import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.domain.withdraw;

public interface withdrawsService {
	public List<withdraw> findAllWidthdrawTrans();
	
}
