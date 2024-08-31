package com.multi.spring2.tour.service;

import com.multi.spring2.tour.dao.TourDAO;
import com.multi.spring2.tour.domain.TourVO;
import com.multi.spring2.tour.mapper.TourMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TourService {

    private TourDAO tourDAO;

    @Autowired
    public TourService(TourDAO tourDAO) {
        this.tourDAO = tourDAO;
    }

    public List<TourVO> all(){
        log.debug("--->> ");
        return tourDAO.all();
    }
}