package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeMgmtService es;

	public MainController(EmployeeMgmtService es) {
		this.es = es;
	}

	public String processResult(EmployeeVO vo) throws Exception {
		EmployeeDTO dto = null;
		String result = null;
		dto = new EmployeeDTO();
		dto.seteName(vo.geteName());
		dto.seteAdd(vo.geteAdd());
		dto.seteBasicSalary(Float.parseFloat(vo.geteBasicSalary()));
		result = es.calculateGrossAndNetSalary(dto);

		return result;

	}
}
