package com.multi.spring2.tour.dao;

import com.multi.spring2.tour.domain.TourVO;
import com.multi.spring2.tour.mapper.TourMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class TourDAO {

    //private static final Logger logger = LoggerFactory.getLogger(MemberDAO.class);
    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public TourDAO(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<TourVO> all() {
        return sqlSessionTemplate.getMapper(TourMapper.class).all();
    }
}

