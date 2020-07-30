package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements CustomerMgmtService {
	private CustomerDAO dao;

	// Alt+shift+s,0(con)
	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateIntrestAmount(CustomerDTO dto) throws Exception {
		// calculate intrest Amount
		float intrAmt = 0.0f;
		CustomerBO bo = null;
		int count = 0;
		intrAmt = (dto.getPamt() * dto.getRate() * dto.getTime()) / 100.0f;
		// prepare CustomerBO obj having persistable data....
		bo = new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setIntrstAmt(intrAmt);
		// use dao
		count = dao.insert(bo);
		// process result
		if (count == 0)
			return "Customer Registration failed:: Amt::" + dto.getPamt() + "Intrest::" + intrAmt;
		else

			return "Customer Registration succeded:: Amt::" + dto.getPamt() + "\tIntrest::" + intrAmt;
	}

}
