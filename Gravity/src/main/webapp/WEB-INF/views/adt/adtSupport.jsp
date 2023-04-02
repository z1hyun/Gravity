<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/adt/adtSupport.do" method="post">
	
		<input type="text" name="supportTitle" placeholder="'오디션 지원합니다'로 입력해주세요">
		<input type="text" name="cnddNm" placeholder="이름">
		<input type="text" name="brth" placeholder="생년월일(예:901111)">
		<input type="text" name="mblTelno" placeholder="휴대폰번호">
		<input type="text" name="zipCode" placeholder="우편번호">
		<input type="text" name="address" placeholder="주소">
		<input type="text" name="detailAddress" placeholder="상세주소">
		<input type="email" name="email" placeholder="이메일">
		<input type="text" name="nationality" placeholder="특기/경력사항">
		<input type="text" name="schoolNm" placeholder="학교">
		
		<input type="radio" name="genderCode" id="genderMan">
		<label for="genderMan">남</label>
		<label for="genderWoman">여</label>
		<input type="radio" name="genderCode" id="genderWoman">
		
		
		<input type="radio" name="supportAreas" id="sptVocal">
		<label for="sptVocal">보컬</label>
		<input type="radio" name="supportAreas" id="sptRap">
		<label for="sptRap">랩</label>
		<input type="radio" name="supportAreas" id="sptDance">
		<label for="sptDance">댄스</label>
		<input type="radio" name="supportAreas" id="sptVisual">
		<label for="sptVisual">비주얼</label>
		
		
		<input type="file" placeholder="동영상1" name="adtVideo1">
		<input type="file" placeholder="동영상2" name="adtVideo2">
	
		<input type="submit"> 지원하기 
	</form>
</body>
</html>