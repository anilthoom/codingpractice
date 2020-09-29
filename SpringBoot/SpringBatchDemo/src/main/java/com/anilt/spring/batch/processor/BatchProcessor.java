package com.anilt.spring.batch.processor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.anilt.spring.batch.model.User;

@Component
public class BatchProcessor implements ItemProcessor<User, User> {

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();
	public BatchProcessor() {
		DEPT_NAMES.put("001", "Technology");
		DEPT_NAMES.put("002", "Operations");
		DEPT_NAMES.put("003", "Accounts");
	}
	@Override
	public User process(User user) throws Exception {
		user.getDept();
		return null;
	}
	
}
