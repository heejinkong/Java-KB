package com.multi.spring2.tour.mapper;

import com.multi.spring2.tour.domain.TourVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TourMapper {
  List<TourVO> all();
}