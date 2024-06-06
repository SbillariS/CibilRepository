package com.carlelo.cibilservice.serviceimpl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.carlelo.cibilservice.model.CibilDetails;
import com.carlelo.cibilservice.servicei.CibilServiceI;
@Service
public class CibilServiceImpl implements CibilServiceI
{
    //id
   private static String x="carlelo";
    
    public static String id() {
  	
  	  Random r= new Random();
  	  int i=r.nextInt(100, 300);
  	  
  	  String id1=x+i;
  	  return id1;  
    }
    private String getRemarkForScore(int score)
    {
  	  if(score >=750) {
  		  return "Good";
  	  }else if (score >=600) {
  		  return "average";
  	  }else {
  		  return "Bad";
  	  }  
  	  
    }
    public String applicable(int score)
 	  {
  			if (score <= 600)
  			{
  				return "NO";
  			}
  			else 
  			{
  				return "YES"; 
  			}
     }
	@Override
	public CibilDetails getcibilDetails() 
	{
		  Random random=new Random();
	  	  int score=random.nextInt(300, 900);
	  	  CibilDetails details=new CibilDetails();
	  	  details.setCibilId(id());
	  	  details.setCibilScore(score);
	  	  details.setRemark(getRemarkForScore(score));
	  	  details.setIsApplicable(applicable(score));
	  	  details.setFromDate("02-06-2024");
	  	  details.setToDate("16-06-2024");
		  return details;  
	}
}
