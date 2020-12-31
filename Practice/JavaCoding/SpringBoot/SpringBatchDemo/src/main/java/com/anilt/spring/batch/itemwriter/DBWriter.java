package com.anilt.spring.batch.itemwriter;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anilt.spring.batch.model.User;
import com.anilt.spring.batch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepos;

	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Data Saved for Users: "+users);
		userRepos.saveAll(users);
	}
	
	
}
