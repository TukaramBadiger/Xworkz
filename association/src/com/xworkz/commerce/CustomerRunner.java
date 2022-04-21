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
				stateDTO.setId(21);
				stateDTO.setName("Goa");
				stateDTO.setNoOfDistricts(4);
				
				
				StateDTO stateDTO1=new StateDTO();
				stateDTO1.setId(22);
				stateDTO1.setName("Karnataka");
				stateDTO1.setNoOfDistricts(28);
				
				StateDTO stateDTO2=new StateDTO();
				stateDTO2.setId(23);
				stateDTO2.setName("Gujarat");
				stateDTO2.setNoOfDistricts(5);
						
				System.out.println("================================================");		
				
				AddressDTO addressDTO=new AddressDTO();
				addressDTO.setId(001);
				addressDTO.setStreet("bagalkot");
				addressDTO.setDoorNo("BH27");
				addressDTO.setPincode(587101);
				addressDTO.setStateDTO(stateDTO1);
				
				AddressDTO addressDTO1=new AddressDTO();
				addressDTO1.setId(002);
				addressDTO1.setStreet("Dharwad");
				addressDTO1.setDoorNo("BH276");
				addressDTO1.setPincode(5875333);
				addressDTO1.setStateDTO(stateDTO2);
				
				AddressDTO addressDTO2=new AddressDTO();
				addressDTO2.setId(003);
				addressDTO2.setStreet("bagalkot");
				addressDTO2.setDoorNo("BH27");
				addressDTO2.setPincode(587101);
				addressDTO2.setStateDTO(stateDTO);
				
				System.out.println("=======================================================");
				
				CustomerDTO Customerdto=new CustomerDTO();
				Customerdto.setId(1001);
				Customerdto.setName("Amit");
				Customerdto.setCustomerId(005);
				Customerdto.setMobile(9954729223l);
				Customerdto.setAlternativeMobile(9845743205l);
				Customerdto.setEmail("amitpatil@gmail.com");
				Customerdto.setCustomerType(CustomerType.SILVER);
				Customerdto.setAlternativeEmail("amit123@gmail");
				Customerdto.setAddressDTO(addressDTO);
				
				
				
				CustomerDTO Customerdto1=new CustomerDTO();
				Customerdto1.setId(1002);
				Customerdto1.setName("raju");
				Customerdto1.setCustomerId(005);
				Customerdto1.setMobile(9923729223l);
				Customerdto1.setAlternativeMobile(9845743205l);
				Customerdto1.setEmail("raju@gmail.com");
				Customerdto1.setCustomerType(CustomerType.GOLD);
				Customerdto1.setAlternativeEmail("raju123@gmail");
				Customerdto1.setAddressDTO(addressDTO1);
				
				
				
				CustomerDTO Customerdto2=new CustomerDTO();
				Customerdto2.setId(1003);
				Customerdto2.setName("Aditi");
				Customerdto2.setCustomerId(007);
				Customerdto2.setMobile(9954747562l);
				Customerdto2.setAlternativeMobile(9985743205l);
				Customerdto2.setEmail("Aditi@gmail.com");
				Customerdto2.setCustomerType(CustomerType.PREMIUM);
				Customerdto2.setAlternativeEmail("Aditi342@gmail");
				Customerdto2.setAddressDTO(addressDTO2);
				
				
				
				CustomerDAO customerdao=new CustomerDAOImpl();  
				
			    CustomerService customerService=new CustomerServiceImpl(customerdao);
			    
				customerService.validateAndSave(Customerdto);
				

			}


	}