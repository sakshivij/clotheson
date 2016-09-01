package clotheson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{

	@RequestMapping({"/","/index"})
	public ModelAndView indexpage()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/home")
	public ModelAndView homepage()
	{
		return new ModelAndView("home");
	}
	@RequestMapping("/aboutus")
	public ModelAndView aboutus()
	{
		return new ModelAndView("aboutus");
	}
	@RequestMapping("/contactus")
	public ModelAndView contactus()
	{
		return new ModelAndView("contactus");
	}
	@RequestMapping("/joinus")
	public ModelAndView joinus()
	{
		return new ModelAndView("joinus");
	}
	@RequestMapping("/location")
	public ModelAndView location()
	{
		return new ModelAndView("stores");
	}
}
