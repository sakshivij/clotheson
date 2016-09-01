package clotheson.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import clotheson.dao.UserDao;
import clotheson.model.EndUser;
import clotheson.model.UserRegister;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;
	@RequestMapping("/loginpage")
	public String loginpage(Model model)
	{
	//	EndUser u=new EndUser();
		//model.addAttribute("endUser", u);
		return "Login";
	}
	@RequestMapping("/userloginpage")
	public ModelAndView userloginpage(Model model)
	{
		EndUser u=new EndUser();
		model.addAttribute("endUser", u);
		return new ModelAndView("userlogin");
	}
	
	@RequestMapping(value="/registerhere")
	public ModelAndView registerhere(Model model)
	{
		UserRegister u=new UserRegister();
		model.addAttribute("userRegister",u);
		return new ModelAndView("register");
	}

	@RequestMapping("/register")
	public ModelAndView insertUser(@Valid @ModelAttribute("userRegister") UserRegister u,BindingResult result,@RequestParam("username")String username,@RequestParam("password")String password)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("register");
		}
		this.userDao.saveOrUpdateUserRegister(u);
		EndUser e=new EndUser();
		e.setUsername(username);
		e.setPassword(password);
		e.setHasrole("Role_User");
		this.userDao.saveOrUpdateUser(e);
		return new ModelAndView("index");
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute("endUser")EndUser endUser,BindingResult result,@RequestParam("username")String username,@RequestParam("password")String password)
	{
		
		//	boolean validuser=userDao.validUser(username, password);
			//if(validuser)
				return "index";
			//return "redirect:/loginpage";
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public ModelAndView logoutPage (HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("/index");
		session.invalidate();
		session = request.getSession(true);
		    return mv;
	}
	@RequestMapping("/userlogin")
	public ModelAndView login(@ModelAttribute("endUser") EndUser endUser,@RequestParam("username")String username,@RequestParam("password")String password )
	{   boolean validuser=userDao.validUser(username, password);
		if(validuser)
		{  ModelAndView m=new ModelAndView("viewproduct");
			m.addObject("username",username);
			
			return m;
		}
		return new ModelAndView("login");
	}
	@RequestMapping("/admin")
	public ModelAndView getadmin()
	{
		
		return new ModelAndView("adminhome");
	}

}
