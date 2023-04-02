package io.gravity.universe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("notice")
public class NoticeContorller {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "notice.do", method = RequestMethod.POST)
	public String noticeView();

}
