package com.service;

import org.springframework.stereotype.Service;
import com.model.HotelBean;
import java.util.Map;
import java.util.HashMap;

//use appropriate annotation to configure ParcelService as a Service
@Service
public class HotelService {
	
	public Map<String,Double> roomMap=new HashMap<>();
	
	public HotelService()
	{
		roomMap.put("Single", 700.0);
		roomMap.put("Double", 1000.0);
		roomMap.put("MiniSuite", 2000.0);
		roomMap.put("ExecutiveSuite", 5000.0);
		roomMap.put("PresidentialSuite", 10000.0);
	}
	public double calculateTotalCost(HotelBean hotelBean)
	{	//double cost=0.0;
//		if(hotelBean.getRoomType()=="Single")
//		{
//			cost=700.0;
//		}
//		hotelBean.setRoomCost(cost);
//		
		
		String roomtype=hotelBean.getRoomType();
		double rc=roomMap.get(roomtype);
		int n=hotelBean.getNoOfDays();
		//return hotelBean.getNoOfDays()*roomMap.get(roomtype);
		return n*rc;
	}

}    	      	 	