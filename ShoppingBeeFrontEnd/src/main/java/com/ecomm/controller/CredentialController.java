package com.ecomm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CredentialController {
	@RequestMapping(value="/signIn")
	public String showLogin()
	{
		return "SignIn";
	
}
	@RequestMapping(value="/signUp")
	public String showRegister()
	{
		return "SignUp";  
	}

	@RequestMapping(value="/aboutus")
	public String showAboutus()
	{
		return "AboutUs";
	}
	@RequestMapping(value="/contactus")
	public String showcontactus()
	{
		return "ContactUs";
	}
	@RequestMapping(value="/showcategory")
	public String category()
	{
		return "category";
	}
	
	
	@RequestMapping(value="/showproduct")
	public String product()
	{
		return "product";
	}

	@RequestMapping(value="/showsupplier")
	public String supplier()
	{
		return "supplier";
	}
	
}
