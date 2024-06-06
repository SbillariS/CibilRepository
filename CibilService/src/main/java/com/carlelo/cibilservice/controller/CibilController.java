package com.carlelo.cibilservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlelo.cibilservice.model.CibilDetails;
import com.carlelo.cibilservice.servicei.CibilServiceI;

@RestController
public class CibilController 
{
	@Autowired
	CibilServiceI csi;
	
   @GetMapping("/getcibilDetails")
   public ResponseEntity<CibilDetails> getcibilDetails()
   {
	   CibilDetails cd= csi.getcibilDetails();
	    return new ResponseEntity<CibilDetails>(cd,HttpStatus.OK);   
   }
}
