package com.organization.mvcproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.organization.mvcproject.model.GameImpl;
import com.organization.mvcproject.model.ReviewImpl;
import org.springframework.ui.ModelMap;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home() {
		return "index";
	}

	@PostMapping(value = "/addReview")
	public ModelAndView addReview(ReviewImpl review, ModelMap model) {
		if(review.getAuthor().equals("")) {
			review.setAuthor("anonymous");
		}

		return new ModelAndView("reviewDetailPage", "submittedReview", review);
	}
	
	@GetMapping(value = "/review")
	public ModelAndView review() {
		
		return new ModelAndView("reviewCreatePage", "command", new ReviewImpl());
	}
	
	@GetMapping(value = "/games")
	public ModelAndView game() {
		return new ModelAndView("games", "command", new GameImpl());
	}
	
	@RequestMapping(value="/hello")
    public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
        ModelAndView ret = new ModelAndView("home");
        // Adds an object to be used in home.jsp
        ret.addObject("name", testingMethod());
        
        //logs to console 
        practiceLoop();
        
        return ret;
    }
   
	
	private String testingMethod() {
        return "testing Method";
    }
    private String practiceLoop() {
        String testString = "";
        for(int i=0; i<=10; i++) {
            System.out.println("i: "+i);
            testString += i;
            System.out.println("testString: " + testString);
        }
        return testString;
    }
}