package com.example.employeeaccessservice.responsitory;


import com.example.employeeaccessservice.bean.EmployeeBean;

import java.util.List;

public interface EmployeeRepositoryAccess {
	
	List<EmployeeBean> getAllProfiles();
	EmployeeBean getProfile(String userId);

}
