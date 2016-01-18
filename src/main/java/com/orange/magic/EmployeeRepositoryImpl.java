package com.orange.magic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Map<String, String> getEmpDetail(String id) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Id", id);
		map.put("Name", "Arvind Rai");
		map.put("Location", "Varanasi");
		return map;
	}

}
