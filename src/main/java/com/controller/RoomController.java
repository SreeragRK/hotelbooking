package com.controller;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.HotelBean;
import com.service.HotelService;
//use appropriate annotation to configure RoomController as Controller
@Controller
public class RoomController {
	@Autowired
	private HotelService hotelService;
	@RequestMapping(value="/showpage",method=RequestMethod.GET)
	public String showPage(@ModelAttribute("hotel") HotelBean hotelBean)
	{
		return "showpage";
	}
	
	//invoke the service class - calculateTotalCost method.	
	@RequestMapping(value="/billdesk",method=RequestMethod.POST)
	public String calculateTotalCost(@Valid @ModelAttribute("hotel") HotelBean hotelBean, 
			BindingResult result,ModelMap map ) {
		if(result.hasErrors())
		{
			return "showpage";
		
		}else
		{
			double cost=hotelService.calculateTotalCost(hotelBean);
			map.put("TotalCost", cost);
			return "billdesk";
			
		}
	}
	
	@ModelAttribute(name="roomList")
	public Map<String,String> buildState()
	{
		Map<String,String> roomList=new HashMap<>();
		roomList.put("Single", "Single");
		roomList.put("Double", "Double");
		roomList.put("MiniSuite", "MiniSuite");
		roomList.put("ExecutiveSuite", "ExecutiveSuite");
		roomList.put("PresidentialSuite", "PresidentialSuite");
		return roomList;
	}
	
	
	
	
}