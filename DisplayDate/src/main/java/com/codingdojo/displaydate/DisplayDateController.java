package com.codingdojo.displaydate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DisplayDateController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/date")
	public String displayDate(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("EEEEE, dd MMMMM, yyyy");
		Date date = new Date();
		model.addAttribute("date",dateFormat.format(date));
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String DisplayTime(Model model) {
		DateFormat timeFormat = new SimpleDateFormat("HH:mm a");
		Date date = new Date();
		model.addAttribute("time", timeFormat.format(date));
		return "time.jsp";
	}

}
