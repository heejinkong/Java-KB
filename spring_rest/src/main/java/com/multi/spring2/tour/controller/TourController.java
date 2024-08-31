package com.multi.spring2.tour.controller;

import com.multi.spring2.tour.domain.TourVO;
import com.multi.spring2.tour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/tour")
public class TourController {

    private final TourService tourService;

    @Autowired
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping
    public String tour() {
       return "tour/tour";
    }

    @GetMapping("/string")
    @ResponseBody
    public String getTour() {
        return "ok";
    }

    @GetMapping("/json1")
    @ResponseBody
    public TourVO getJson1() {
        TourVO tour = new TourVO();
        tour.setDestination("Paris");
        tour.setDuration(5);
        tour.setPrice(1200.0);
        return tour;
    }

    @GetMapping("/json2")
    @ResponseBody
    public List<TourVO> getTours() {
        return Arrays.asList(
                new TourVO("Paris", 5, 1200.0),
                new TourVO("New York", 7, 1500.0),
                new TourVO("Tokyo", 10, 2000.0)
        );
    }

    @GetMapping("/json3")
    @ResponseBody
    public List<TourVO> getTours2() {
        return tourService.all();
    }
}
