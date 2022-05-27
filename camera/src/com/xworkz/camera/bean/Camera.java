package com.xworkz.camera.bean;

import java.util.*;

import lombok.Data;
import lombok.NonNull;

@Data
public class Camera {
	
	

		public Camera() {
		System.out.println("Default Const"+this.getClass().getSimpleName());
	}
		/*
		 * Camera-> add 6 properties, init 3 using single const and 3 using setter
		 * Double,Boolean,Character,Float,BigDecimal StringBuffer --> create three
		 * beans/instances using different constructors
		 */

		@NonNull
		private String company;
		
		@NonNull
		private String quality;
		
		@NonNull
		private Double Prize;
		
		
		private Integer warranty;
		
		private Integer pixel;
		
		private Integer  storageCapacity;
		
		private ArrayList<String> CameraList;
		private Set<String> set;
		private Map<String,String> map;
		private Properties prop;

	}



