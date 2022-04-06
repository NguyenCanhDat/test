package demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.entity.Books;

@Controller
public class DemoController {
	@RequestMapping(value = {"/home","/"})
	public String home(Model model) {
		model.addAttribute("chao", "Hello, this is the first app with spring web mvc");
		return "home";
	}
	
	@RequestMapping("/initInsertBook")
	public String initInsertStudent(Model model) {
		Books b = new Books();
		model.addAttribute("b", b);
		return "insertBook";
	}
	
	@RequestMapping("/insertBook")
	public String insertStudent(@Valid @ModelAttribute("b")Books bo,BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("b", bo);
			return "insertBook";
		}else {
			model.addAttribute("b",bo );
			return "viewBook";
		}
	}
}
