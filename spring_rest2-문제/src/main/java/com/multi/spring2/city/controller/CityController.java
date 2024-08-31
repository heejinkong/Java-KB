package com.multi.spring2.city.controller;

import com.multi.spring2.city.domain.CityVO;
import com.multi.spring2.city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public ModelAndView tour() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("city/city");
        return mav;
    }

    @GetMapping("/json3")
    @ResponseBody
    public List<CityVO> getList() {
        return cityService.all();
    }

    @GetMapping("/json4")
    @ResponseBody
    public CityVO getOne(@RequestParam int id) {
        return cityService.one(id);
    }
}


