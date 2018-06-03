package com.maxxton;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.maxxton.bean.Plan;

public class CanceledPlan {
		
	public static  List<Plan>  getCancelledPeriodsForTask(List<Plan> oldPlanList, List<Plan> newPlanList)
	{
		
		
		return null;
	}
	
	public static void main(String[] args) {
		List<Plan> oldPlanList = new  ArrayList<Plan>();
		List<Plan> newPlanList = new  ArrayList<Plan>();
		List<Plan> cancelledPlanList = new  ArrayList<Plan>();
		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");

		try {
			oldPlanList.add(new Plan( dateFormat.parse("01 Nov 2016"  ),  dateFormat.parse("20 Nov 2016")));
			oldPlanList.add(new Plan( dateFormat.parse("15 Dec 2016"  ),  dateFormat.parse("25 Dec 2016")));
		
			
			newPlanList.add(new Plan( dateFormat.parse("10 Nov 2016"  ),  dateFormat.parse("25 Nov 2016")));
			newPlanList.add(new Plan( dateFormat.parse("10 Dec 2016"  ),  dateFormat.parse("15 Dec 2016")));

			cancelledPlanList.addAll(getCancelledPeriodsForTask(oldPlanList, newPlanList));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	

}
