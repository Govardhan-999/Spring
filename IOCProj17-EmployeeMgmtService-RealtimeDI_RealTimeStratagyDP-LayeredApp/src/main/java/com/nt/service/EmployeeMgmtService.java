package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	
	public String calculateGrossAndNetSalary(EmployeeDTO dto)throws Exception;

}
