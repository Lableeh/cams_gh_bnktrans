package com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.controller;

import java.sql.Date;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.boot.web.server.WebServerException;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.devs.rest.devsrest.domain.Developer;
//import com.devs.rest.devsrest.exceptions.NoListFoundException;
//import com.devs.rest.devsrest.service.DeveloperService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.dao.WithdrawDaoImpl;
import com.ibm.cams.gh.onlinebank.cams_gh_bnktrans.domain.withdraw;
import com.ibm.cams.gh.onlinebank.service.WithdrawsServiceImpl;
import com.ibm.cams.gh.onlinebank.service.withdrawsService;

@RestController
@RequestMapping("/rest/withdraw")
@EnableDiscoveryClient


public class TransactionController {
	private withdrawsService WithdrawsService;
	
	public TransactionController() {
		WithdrawsService = new WithdrawsServiceImpl();
	}

//	@GET
//	@Path("/withdraw")
//	@RequestMapping(method=RequestMethod.GET, value="/withdraw")
	@GetMapping
	public @ResponseBody List<withdraw> getwithdrawFilter(){

		try {
			List<withdraw> withdraws;

			withdraws = WithdrawsService.findAllWidthdrawTrans();

			return withdraws;
		}catch(Exception e) {
			throw new WebApplicationException(e);
		}
} 
}
