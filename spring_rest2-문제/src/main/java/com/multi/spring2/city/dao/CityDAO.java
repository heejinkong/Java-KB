package com.multi.spring2.city.dao;

import com.multi.spring2.city.domain.CityVO;
import com.multi.spring2.city.mapper.CityMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class CityDAO {

    //private static final Logger logger = LoggerFactory.getLogger(MemberDAO.class);
    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public CityDAO(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<CityVO> all() {
        return sqlSessionTemplate.getMapper(CityMapper.class).all();
    }

    public CityVO one(int id) {
        return sqlSessionTemplate.getMapper(CityMapper.class).one(id);
    }
}

