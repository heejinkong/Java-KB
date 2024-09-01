package com.multi.spring2.aop.mapper;

import com.multi.spring2.aop.domain.BoardVO;
import com.multi.spring2.aop.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AOPMapper {

  int insertMember(MemberVO memberVO);
  int insertBoard(BoardVO boardVO);

}