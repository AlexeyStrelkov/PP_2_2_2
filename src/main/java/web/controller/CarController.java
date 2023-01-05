package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String carsResp(@RequestParam(defaultValue = "5") Integer count, Model model) {
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
