package com.invoice.system.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

//=================================================================================================
@Configuration
public class ObjectMapperConfiguration {

	//---------------------------------------------------------------------------------------------
	@Autowired
	public ObjectMapperConfiguration(ObjectMapper objectMapper) {

		// configures jackson JSON serializer to print its output in a more readable form
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	//---------------------------------------------------------------------------------------------
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}