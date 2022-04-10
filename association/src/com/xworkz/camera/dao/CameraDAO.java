package com.xworkz.camera.dao;

import com.xworkz.camera.dto.CameraDTO;

/*CameraDTO --> id,brand,pixel,type,cost

CameraDAO--> abstract save(CameraDTO), abstract CameraDTO findById(int id), abstract CameraDTO findByMaxCost(), abstract CameraDTO findMinCost();

Id is always unique*/



public abstract class CameraDAO {
	private CameraDTO[] cameraDTOs=new CameraDTO[3];
	
	protected CameraDAO() {
	}
	
	public CameraDTO[] getCameraDTOs() {
		return cameraDTOs;
	}
	
	public abstract boolean save(CameraDTO dto);
	public abstract boolean findDuplicate(CameraDTO cameraDTO);
	
	
	public abstract CameraDTO findById(int id);
	
	public abstract CameraDTO findByMaxCost();
	
	public abstract CameraDTO findMinCost();
	
	
	
}