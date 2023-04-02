package io.gravity.universe.mapper;

import org.apache.ibatis.annotations.Mapper;

import io.gravity.universe.vo.auditionSupportVo;

@Mapper
public interface AuditionMapper {

	int insertSupportInfo(auditionSupportVo inVo);

}
