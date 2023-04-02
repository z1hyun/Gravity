package io.gravity.universe.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.gravity.universe.service.AuditionService;
import io.gravity.universe.vo.auditionSupportVo;

@Controller
@RequestMapping("/adt/*")
public class AuditionRestController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private AuditionService adtService;
	
	@RequestMapping(value = "/adtSupport.do", method = RequestMethod.POST)
	public String adtSupport(auditionSupportVo inVo) {

		logger.info("adtSupport.do ===========");

		logger.info("오디션 지원자 정보=========");
		
		logger.info(inVo.toString());
		
		int supportResult = adtService.adtSupport(inVo);
		
		return "adt/audition";
	}
}
