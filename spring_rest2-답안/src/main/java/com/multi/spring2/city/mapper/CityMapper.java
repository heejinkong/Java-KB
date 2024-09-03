package com.multi.spring2.city.mapper;

import com.multi.spring2.city.domain.CityVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CityMapper {
  List<CityVO> all();

  CityVO one(int id);
}