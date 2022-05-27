package com.xworkz.camera;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.camera.bean.Camera;

public class CameraRunner {

	public static void main(String[] args) {

		String xmlFile = "resource2/cameraSpring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);

		Camera camera = applicationContext.getBean(Camera.class);
		System.out.println(camera);

		Double doubleNumber = applicationContext.getBean(Double.class);
		System.out.println(doubleNumber);

		Boolean booleanValue = applicationContext.getBean(Boolean.class);
		System.out.println(booleanValue);

		Character charvalue = applicationContext.getBean(Character.class);
		System.out.println(charvalue);

		Float floatValue = applicationContext.getBean(Float.class);
		System.out.println(floatValue);

		BigDecimal bigDecimalValue = applicationContext.getBean(BigDecimal.class);
		System.out.println(bigDecimalValue);

		StringBuffer strb1 = applicationContext.getBean("Tukaram", StringBuffer.class);
		System.out.println(strb1);

		StringBuffer strb2 = applicationContext.getBean("pdo", StringBuffer.class);
		System.out.println(strb2);

		StringBuffer strb3 = applicationContext.getBean("16", StringBuffer.class);
		System.out.println(strb3.capacity());
		
		
		ArrayList<String> cam=camera.getCameraList();
		ListIterator<String> iter=cam.listIterator();
		 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		Set<String> camSet=camera.getSet();
		System.out.println(camSet);
		
		Map<String,String> map=camera.getMap();
		System.out.println(map);
		
		Properties properties=camera.getProp();
		System.out.println(properties);
		
		
	}

}