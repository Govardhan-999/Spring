package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public final class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	private EmployeeDAO dao;

	public EmployeeMgmtServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateGrossAndNetSalary(EmployeeDTO dto) throws Exception {

		/*
		 * Gross Salary=BasicSalary+DearAllowance(da)+HouseRentAllowance(hra)
		 * NetSalary=GrossSalary-Deductions Deductions=PF+IncomeTax
		 */
		String result = null;
		int count = 0;
		EmployeeBO bo = null;
		float gSalary = 0.0f;
		float nSalary = 0.0f;
		float da = (10 * dto.geteBasicSalary()) / 100;
		float hra = (10 * dto.geteBasicSalary()) / 100;
		float pf = (7 * dto.geteBasicSalary()) / 100;
		float it = (5 * dto.geteBasicSalary()) / 100;
		float deductions = pf + it;
		gSalary = dto.geteBasicSalary() + da + hra;
		nSalary = gSalary - deductions;
		
		bo = new EmployeeBO();
		bo.seteName(dto.geteName());
		bo.seteAdd(dto.geteAdd());
		bo.seteBasicSalary(dto.geteBasicSalary());
		bo.seteGroasssalary(gSalary);
		bo.seteNetSalary(nSalary);
		count = dao.insert(bo);
		if (count == 0) {
			
		return  result="Hii\t" + dto.geteName() +"Insertion Problem Occured in DAO"+"Your Gross salary is :\t" + gSalary + "And NetSalary is:\t" + nSalary;
		}else {
			return result="Hii\t" + dto.geteName()+"Your Gross salary is :\t" + gSalary + "And NetSalary is:\t" + nSalary;
	}

	}}
