package com.search.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController
{
  ModelAndView searchStudent(@RequestParam String rollNo) 

  {
	  String student="";
	  Map<String, String> tempData = new HashMap<String, String>();
	  tempData.put("1", "virat");
	  tempData.put("2", "rohit");
	  tempData.put("3", "dhoni");
	  tempData.put("4", "ganguly");
	  tempData.put("5", "raina");
	//  System.out.println("roll no"+ rollNo);
	  ModelAndView mv = new ModelAndView("data.jsp");
	  if(tempData.containsKey(rollNo))
	  {
		  student = tempData.get(rollNo);
		  mv.addObject("std", student);
	  }
	  
	return mv;
	  
  }
}
