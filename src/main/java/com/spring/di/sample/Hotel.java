package com.spring.di.sample;

import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Hotel {
	
	private Chef chef;
	
	public Hotel(Chef chef) {
		this.chef = chef;
	}
}
