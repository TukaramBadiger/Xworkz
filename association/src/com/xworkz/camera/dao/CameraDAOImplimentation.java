package com.xworkz.camera.dao;

import com.xworkz.camera.dto.CameraDTO;
import com.xworkz.expenditure.dto.ExpenditureDTO;

public class CameraDAOImplimentation extends CameraDAO {

	 CameraDTO[] cameraDTO=super.getCameraDTOs();
	 int num=0;
	
	public CameraDAOImplimentation() {
		System.out.println("created"+this.getClass().getName());
		
	}
	@Override
	public CameraDTO findById(int id) {
		if(id<=0) {
			System.err.println("the id is null cannot be found");
			return null;
		}
		for(int index=0;index<cameraDTO.length;index++) {
			if(cameraDTO[index]!=null && cameraDTO[index].getId()==id) {
				System.out.println("dto is found");
				return cameraDTO[index];
			}
		}
		return null;
	}


	@Override
	public boolean save(CameraDTO cameraDTO) {
		if(cameraDTO==null) {
			System.out.println("dto is null");
			return false;
		}
		boolean found= findDuplicate(cameraDTO);
		if(found) {
			System.err.println("dto is already present");
			return false;
			}
		if(this.num<super.getCameraDTOs().length) {
			this.cameraDTO[num]=cameraDTO;
			System.err.println("dto added "+cameraDTO);
			this.num++;
			return true;
		}
		else {
			System.out.println("dto i not added");
		}
		return false;
	}

	@Override
	public CameraDTO findByMaxCost() {
		double maxCost=0;
		int maxCostIndex=0;
		
		for(int i=0;i<cameraDTO.length;i++) {
			if(cameraDTO[i]!=null) {
				double cost=cameraDTO[i].getCost();
				if(cost>maxCost) {
					maxCost=cost;
				maxCostIndex=i;
			}
			}
		}
		System.out.println("the max cost of camera is"+maxCost+"& found index at"+maxCostIndex);
		return cameraDTO[maxCostIndex];	
	}

	@Override
	public CameraDTO findMinCost() {
		double minCost=cameraDTO[0].getCost();
		int minCostIndex=0;
		for(int i=0;i<cameraDTO.length;i++) {
			if(cameraDTO[i]!=null) {
				double cost= cameraDTO[i].getCost();
				if(cost<minCost) {
					minCost=cost;
					minCostIndex=i;
				}
			}
		}
		System.out.println("the min cost of camera is"+minCost+"& found index at"+minCostIndex);
		return cameraDTO[minCostIndex];	
		}

	@Override
	public boolean findDuplicate(CameraDTO cameraDTO) {
		if(cameraDTO==null) {
			System.out.println("dto null already present");
			}
		for(int index=0;index<this.cameraDTO.length;index++)
		if(this.cameraDTO[index]!=null && this.cameraDTO[index].equals(cameraDTO)) {
			
			System.out.println("dto added "+index++);
			
			return true;
		}
		return false;
	}
	
	
		
	}
	
	
	


