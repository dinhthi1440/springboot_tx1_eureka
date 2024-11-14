package com.example.employeeaccessservice.responsitory;

import com.example.employeeaccessservice.bean.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepositoryAccessImpl implements EmployeeRepositoryAccess{

	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public EmployeeRepositoryAccessImpl(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	@Override
	public List<EmployeeBean> getAllProfiles() {
		EmployeeBean[] profiles = restTemplate.getForObject(serviceUrl+"/profiles", EmployeeBean[].class);
		return Arrays.asList(profiles);
	}

	@Override
	public EmployeeBean getProfile(String userId) {
		return restTemplate.getForObject(serviceUrl + "/profiles/{id}",
				EmployeeBean.class, userId);
	}
}
