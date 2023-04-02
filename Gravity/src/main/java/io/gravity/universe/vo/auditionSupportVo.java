package io.gravity.universe.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class auditionSupportVo {

	/* 지원제목 */
	private String supportTitle;
	
	/* 지원자 이름 */
	private String cnddNm;
	
	/* 생년월일 */
	private String brth;
	
	/* 휴대폰번호 */
	private String mblTelno;
	
	/* 우편번호 */
	private String zipCode;
	
	/* 주소 */
	private String address;
	
	/* 상세주소 */
	private String detailAddress;
	
	/* 이메일주소 */
	private String email;
	
	/* 국적 */
	private String nationality;
	
	/* 성별 */
	private String genderCode;
	
	/* 학교이름 */
	private String schoolNm;
	
	/* 지원분야 */
	private String supportAreas;
	
	
}
