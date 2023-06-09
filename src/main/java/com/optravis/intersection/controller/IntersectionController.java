package com.optravis.intersection.controller;

import com.optravis.intersection.model.ArrayIntersection;
import com.optravis.intersection.service.ArrayIntersectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/intersection")
public class IntersectionController {

    @Autowired
    ArrayIntersectionService arrayIntersectionService;

    @GetMapping("/calculate")
    public String addView(Model model) {
        model.addAttribute("arrayIntersection", new ArrayIntersection());
        return "userInput";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public ArrayIntersection calculateIntersection(@ModelAttribute("arrayIntersection") ArrayIntersection arrayIntersection) {
        return arrayIntersectionService.calcualteArrayIntersectionCountAndTime(arrayIntersection);
    }

}
