package com.example.cricketAPI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LaunchCricketController {

    @GetMapping("/launchCricket")
    public String LaunchCricketForm(Model model) {
        model.addAttribute("launchCricket", new LaunchCricket());
        return "launchCricket";
    }

    @PostMapping("/launchCricket")
    public String LaunchCricketSubmit(@ModelAttribute LaunchCricket launchCricket) {
        return "result";
    }






}