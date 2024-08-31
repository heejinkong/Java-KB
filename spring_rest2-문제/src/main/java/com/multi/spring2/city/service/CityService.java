package com.multi.spring2.city.service;

import com.multi.spring2.city.dao.CityDAO;
import com.multi.spring2.city.domain.CityVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CityService {

    private CityDAO cityDAO;

    @Autowired
    public CityService(CityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }

    public List<CityVO> all(){
        log.debug("--->> ");
        return cityDAO.all();
    }

    public CityVO one(int id) {
        log.debug("--->> ");
        return cityDAO.one(id);
    }
}