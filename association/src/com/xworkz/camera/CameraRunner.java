package com.xworkz.camera;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOImplimentation;
import com.xworkz.camera.dto.CameraDTO;
import com.xworkz.camera.dto.CameraType;

/*CameraDTO --> id,brand,pixel,type,cost

CameraDAO--> abstract save(CameraDTO), abstract CameraDTO findById(int id), abstract CameraDTO findByMaxCost(), abstract CameraDTO findMinCost();

Id is always unique*/

public class CameraRunner {
	public static void main(String [] args) {
		
		
		CameraDAO cameraDAO=new CameraDAOImplimentation();
		//
	
		CameraDTO dto=new CameraDTO();
		dto.setBrand("Nikon");
		dto.setCost(25000);
		dto.setId(123123);
		dto.setPixel("64Mp");
		dto.setType(CameraType.ACTION);
		
		CameraDTO dto1=new CameraDTO();
		dto1.setBrand("canon");
		dto1.setCost(30000);
		dto1.setId(321321);
		dto1.setPixel("108mp");
		dto1.setType(CameraType.COMPACT);
		
		
		CameraDTO dto2=new CameraDTO();
		dto2.setBrand("kodak");
		dto2.setCost(15000);
		dto2.setId(45464);
		dto2.setPixel("108mp");
		dto2.setType(CameraType.DSLR);
		
		
		
   	CameraDAOImplimentation impl=new CameraDAOImplimentation();
		
	
     CameraDAO castedDAO=(CameraDAOImplimentation)cameraDAO;
     impl.save(dto);
     //System.out.println("");
     impl.findDuplicate(dto);
   
	impl.findById(45464);
	impl.findByMaxCost();
	impl.findMinCost();
	castedDAO.findByMaxCost();
	castedDAO.findMinCost();
	
	}
}