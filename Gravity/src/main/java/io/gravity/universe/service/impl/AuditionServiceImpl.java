package io.gravity.universe.service.impl;

import io.gravity.universe.mapper.AuditionMapper;
import io.gravity.universe.service.AuditionService;
import io.gravity.universe.vo.auditionSupportVo;

public class AuditionServiceImpl implements AuditionService{

	private AuditionMapper adtMp;
	
	
	@Override
	public int adtSupport(auditionSupportVo inVo) {
		
		int result = adtMp.insertSupportInfo(inVo);		
		
		return result;
	}

}
