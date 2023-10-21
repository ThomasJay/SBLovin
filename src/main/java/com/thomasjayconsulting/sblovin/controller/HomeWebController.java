package com.thomasjayconsulting.sblovin.controller;

import com.thomasjayconsulting.sblovin.model.PriceItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class HomeWebController {

    @GetMapping({"/", "/index.html"})
    public String showHome(Model model) {

        model.addAttribute("welcome", "Hello There, how are you");

        PriceItem priceItem1 = new PriceItem("100", "Big Item", 14.99);
        PriceItem priceItem2 = new PriceItem("200", "Little Item", 6.99);
        PriceItem priceItem3 = new PriceItem("300", "Medium Item", 7.50);

        model.addAttribute("prices", List.of(priceItem1, priceItem2, priceItem3));


        return "index";
    }

    @GetMapping({"/features"})
    public String showFeatures(Model model) {
        log.info("getFeatures Started");

        model.addAttribute("features", List.of("Big", "Round", "Purple"));


        return "features";
    }

    @GetMapping({"/pricing"})
    public String showPricing(Model model) {

        PriceItem priceItem1 = new PriceItem("100", "Big Item", 14.99);
        PriceItem priceItem2 = new PriceItem("200", "Little Item", 6.99);
        PriceItem priceItem3 = new PriceItem("300", "Medium Item", 7.50);

        model.addAttribute("prices", List.of(priceItem1, priceItem2, priceItem3));

        return "pricing";
    }

}
