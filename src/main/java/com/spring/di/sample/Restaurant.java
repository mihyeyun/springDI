package com.spring.di.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

//������ ����
//Setter ����
//�ʵ� ���� - AutoWired


//@AllArgsConstructor	//������ ����
@Component
@Data
public class Restaurant {
	
	//@Autowired
	private Chef chef; //new Chef()
	
	public Restaurant(Chef chef) {	//�ڹ� ����� ������ �����
		this.chef = chef;
	}
}
