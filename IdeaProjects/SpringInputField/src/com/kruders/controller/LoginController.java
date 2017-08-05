package com.kruders.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.kruders.domain.Login;

public class LoginController extends SimpleFormController{
	public LoginController(){
		setCommandClass(Login.class);
		setCommandName("loginForm");
	}
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		Login login = (Login) command;
		return new ModelAndView("loginSuccess","login",login);
	}
}
