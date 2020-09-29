package com.anilt.spring.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import com.anilt.spring.batch.model.User;

@Configuration
public class SpringBatchConfig {
	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, 
			StepBuilderFactory stepBuilderFactory,
			ItemReader<User> itemReader,
			ItemProcessor<User, User> itemProcessor,
			ItemWriter<User> itemWriter
			) {
		
		Step step = stepBuilderFactory.get("ETL-file-load")
				.<User,User>chunk(100)
				.reader(itemReader)
				.processor(itemProcessor)
				.writer(itemWriter)
				.build();

		return jobBuilderFactory.get("ETL-Load")
			.incrementer(new RunIdIncrementer())
			.start(step)// incase of multiple steps, use flow(step).next(step)....
			.build();
	}
	
	@Bean
	public FlatFileItemReader<User> fileItemReader(@Value("${input}") Resource resource){
		FlatFileItemReader<User> flatFileItemReader = new FlatFileItemReader<>();
		flatFileItemReader.setResource(resource);
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
