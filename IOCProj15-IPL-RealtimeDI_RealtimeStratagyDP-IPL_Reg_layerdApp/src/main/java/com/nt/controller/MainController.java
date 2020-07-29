package com.nt.controller;

import com.nt.dto.PlayerDTO;
import com.nt.service.PlayerRegService;
import com.nt.vo.PlayerVO;

public final class MainController {
private PlayerRegService service;

public MainController(PlayerRegService service) {
	this.service = service;
}
public String processPlayer(PlayerVO vo)throws Exception{
PlayerDTO dto=null;
String result=null;
	// convert vo to dto
 dto=new PlayerDTO();
 dto.setpName(vo.getpName());
 dto.setpCountry( vo.getpCountry());
 dto.setpInnings(Integer.parseInt(vo.getpInnings()));
 dto.setpRunsScored(Integer.parseInt(vo.getpRunsScored()));
 dto.setpRunsConceded(Integer.parseInt(vo.getpRunsConceded()));
 dto.setPnoOfNotOuts(Integer.parseInt(vo.getPnoOfNotOuts()));
 dto.setPwktsTaken(Integer.parseInt(vo.getPwktsTaken()));
 //use service
 result=service.CalculateBattingAndBowlingAvg(dto);
 return result;
}
} 