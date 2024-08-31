package com.multi.spring2.tour.controller;

import com.multi.spring2.tour.domain.TourVO;
import com.multi.spring2.tour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tour2")
public class TourController2 {

    private final TourService tourService;

    @Autowired
    public TourController2(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping
    public ModelAndView tour() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("tour2/tour2");
        return mav;
    }

    @GetMapping("/string")
    public String getTour() {
        return "ok";
    }

    @GetMapping("/json1")
    public TourVO getJson1() {
        TourVO tour = new TourVO();
        tour.setDestination("Paris");
        tour.setDuration(5);
        tour.setPrice(1200.0);
        return tour;
    }

    @GetMapping("/json2")
    public List<TourVO> getTours() {
        return Arrays.asList(
                new TourVO("Paris", 5, 1200.0),
                new TourVO("New York", 7, 1500.0),
                new TourVO("Tokyo", 10, 2000.0)
        );
    }

    @GetMapping("/json3")
     public List<TourVO> getTours2() {
        return tourService.all();
    }
}


