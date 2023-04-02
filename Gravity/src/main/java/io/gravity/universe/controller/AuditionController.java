package io.gravity.universe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/adt/*")
public class AuditionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/audition.do", method = RequestMethod.GET)
	public String AuditionMainView() {

		logger.info("===================");

		return "adt/audition";
	}
	
	@RequestMapping(value = "/adtSupport.do", method = RequestMethod.GET)
	public String adtSupport() {

		logger.info("===================");

		return "adt/adtSupport";
	}
}
