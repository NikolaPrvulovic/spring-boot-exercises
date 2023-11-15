package com.dentech.springboot.prosthetistdemo.controller;

import com.dentech.springboot.prosthetistdemo.entity.Prosthetist;
import com.dentech.springboot.prosthetistdemo.service.ProsthetistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/prosthetists")
public class ProsthetistController {

    private ProsthetistService prosthetistService;

    // as we have only 1 constructor @Autowired is optional for DI
    public ProsthetistController(ProsthetistService theProsthetistService){
        prosthetistService = theProsthetistService;
    }

    // add mapping for "/list"
    @GetMapping("/list")
    public String listProsthetists(Model theModel){

        // get the prosthetists from db
        List<Prosthetist> theProsthetists = prosthetistService.findAll();

        // add to the spring model
        theModel.addAttribute("prosthetists", theProsthetists);

        return "prosthetists/list-prosthetists";
    }

    // add mapping for "/showFormForAdd
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        // create model attribute to bind form data
        theModel.addAttribute("prosthetist", new Prosthetist());

        return "prosthetists/prosthetist-form";
    }

    @PostMapping("/save")
    public String saveProsthetist(@ModelAttribute ("prosthetist") Prosthetist theProsthetist, Model theModel){

        // save prosthetist
        prosthetistService.save(theProsthetist);

        // use a redirect to prevent duplicate submissions
        return "redirect:/prosthetists/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam ("prosthetistId") int theId, Model theModel){

        // get the prosthetist from the service
        // set prosthetist in the model to prepopulate the form
        theModel.addAttribute("prosthetist", prosthetistService.findById(theId));

        // send over to our form
        return "prosthetists/prosthetist-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("prosthetistId") int theId){

        // delete the prosthetist
        prosthetistService.deleteById(theId);

        // redirect to the /prosthetists/list
        return "redirect:/prosthetists/list";
    }
}
