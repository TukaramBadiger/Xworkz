package com.xworkz.commerce;

import com.xworkz.commerce.constants.CustomerType;
import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.commerce.dao.CustomerDAOImpl;
import com.xworkz.commerce.dto.AddressDTO;
import com.xworkz.commerce.dto.CustomerDTO;
import com.xworkz.commerce.dto.StateDTO;
import com.xworkz.commerce.service.CustomerService;
import com.xworkz.commerce.service.CustomerServiceImpl;


public class CustomerRunner {                                                                          
	                                                                                               
	public static void main(String[] args) {
	
				StateDTO stateDTO=new StateDTO();
				stateDTO.setId(01);
				stateDTO.setName("Goa");
				stateDTO.setNoOfDistricts(4);
				
				
				StateDTO stateDTO1=new StateDTO();
				stateDTO1.setId(02);
				stateDTO1.setName("AndraPradesh");
				stateDTO1.setNoOfDistricts(11);
				
				StateDTO stateDTO2=new StateDTO();
				stateDTO2.setId(03);
				stateDTO2.setName("Kerala");
				stateDTO2.setNoOfDistricts(14);
						
				System.out.println("================================================");		
				
				AddressDTO addressDTO=new AddressDTO();
				addressDTO.setId(04);
				addressDTO.setStreet("Belagavi");
				addressDTO.setDoorNo("svpc1");
				addressDTO.setPincode(590001);
				addressDTO.setStateDTO(stateDTO1);
				
				AddressDTO addressDTO1=new AddressDTO();
				addressDTO1.setId(05);
				addressDTO1.setStreet("Hubli");
				addressDTO1.setDoorNo("svpc2");
				addressDTO1.setPincode(580020);
				addressDTO1.setStateDTO(stateDTO2);
				
				AddressDTO addressDTO2=new AddressDTO();
				addressDTO2.setId(06);
				addressDTO2.setStreet("Vijaypur");
				addressDTO2.setDoorNo("BH27");
				addressDTO2.setPincode(586101);
				addressDTO2.setStateDTO(stateDTO);
				
				System.out.println("=======================================================");
				
				CustomerDTO Customerdto=new CustomerDTO();
				Customerdto.setId(006);
				Customerdto.setName("Shyam");
				Customerdto.setCustomerId(005);
				Customerdto.setMobile(9656845621l);
				Customerdto.setAlternativeMobile(8585868452l);
				Customerdto.setEmail("shyamp@gmail.com");
				Customerdto.setCustomerType(CustomerType.SILVER);
				Customerdto.setAlternativeEmail("shyampt@gmail");
				Customerdto.setAddressDTO(addressDTO);
				
				
				
				CustomerDTO Customerdto1=new CustomerDTO();
				Customerdto1.setId(004);
				Customerdto1.setName("anand");
				Customerdto1.setCustomerId(005);
				Customerdto1.setMobile(9192939495l);
				Customerdto1.setAlternativeMobile(9496929595l);
				Customerdto1.setEmail("anandlk@gmail.com");
				Customerdto1.setCustomerType(CustomerType.GOLD);
				Customerdto1.setAlternativeEmail("anand026@gmail");
				Customerdto1.setAddressDTO(addressDTO1);
				
				
				
				CustomerDTO Customerdto2=new CustomerDTO();
				Customerdto2.setId(005);
				Customerdto2.setName("Adya");
				Customerdto2.setCustomerId(007);
				Customerdto2.setMobile(9448023654l);
				Customerdto2.setAlternativeMobile(8050167475l);
				Customerdto2.setEmail("Adya995@gmail.com");
				Customerdto2.setCustomerType(CustomerType.PREMIUM);
				Customerdto2.setAlternativeEmail("Adya665@gmail");
				Customerdto2.setAddressDTO(addressDTO2);
				
				
				
				CustomerDAO customerdao=new CustomerDAOImpl();  
				
			  //  CustomerService customerService=new CustomerServiceImpl(customerdao);
			    
				//customerService.validateAndSave(Customerdto);
				
				System.out.println("validate");
				
				 CustomerService customerService=new CustomerServiceImpl(customerdao);
							    customerService.validateAndSave(Customerdto);
							    customerService.validateAndSave(Customerdto1);
							    customerService.validateAndSave(Customerdto2);
							    

							    
							    customerService.findByName("Aditi");
			}


	}