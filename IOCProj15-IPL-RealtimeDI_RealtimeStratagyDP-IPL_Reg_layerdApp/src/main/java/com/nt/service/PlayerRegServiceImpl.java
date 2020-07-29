package com.nt.service;

import com.nt.bo.PlayerBO;
import com.nt.dao.PlayerDAO;
import com.nt.dto.PlayerDTO;

public final class PlayerRegServiceImpl implements PlayerRegService {
 private PlayerDAO dao;
 
	public PlayerRegServiceImpl(PlayerDAO dao) {
	 
	this.dao = dao;
}

	@Override
	public String CalculateBattingAndBowlingAvg(PlayerDTO dto) throws Exception {
Double battingAvg=0.0;
Double bowlingAvg=0.0;
PlayerBO bo=null;
int count=0;
		//calculate Batting avg
battingAvg=(double) (dto.getpRunsScored()/(dto.getpInnings()-dto.getPnoOfNotOuts()));
bowlingAvg=(double) (dto.getpRunsConceded()/dto.getPwktsTaken());
		 //prepare playerBo object having persitable data
bo=new PlayerBO();
bo.setpName( dto.getpName());
bo.setpCountry( dto.getpCountry());
bo.setpInnings( dto.getpInnings());
bo.setpBattingAvg(battingAvg);
bo.setpBowlingAvg(bowlingAvg);
count=dao.insert(bo);
if(count==0)
		return "Player Registration failed";
else
	return 
			"\nPlayer Name:::\t"+bo.getpName()+"\nPlayer Country:::\t"+bo.getpCountry()+"\nPlayer Innings:::\t"+bo.getpInnings()+
			
			"\nPlayer Registration Succeded:::Batting Avg:::"+battingAvg+"Bowling Avg::: "+bowlingAvg;

		
	}

}
