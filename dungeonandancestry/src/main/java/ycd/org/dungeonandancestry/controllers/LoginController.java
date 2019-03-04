package ycd.org.dungeonandancestry.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ycd.org.dungeonandancestry.models.User;
import ycd.org.dungeonandancestry.models.data.UserDao;

	
@Controller
@RequestMapping("login")
public class LoginController 
{

	@Autowired
    private UserDao userDao;
    
    

    // Request path: /login
    @RequestMapping(value = "add")
    public String newUserForm(Model model) 
    {

        model.addAttribute("title", "Create Your Account");
        model.addAttribute(new User());
        model.addAttribute("users", userDao.findAll());

        return "login/signup";
    }
    
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processNewAccountForm(@ModelAttribute @Valid User newUser, Errors errors, Model model) 
    {
    	if (errors.hasErrors()) 
    	{
    	 model.addAttribute("title", "Create Your Account");
    	 return "login/signup";
    	}
    	userDao.save(newUser);
    	return "redirect";
    	
    }
	
}
