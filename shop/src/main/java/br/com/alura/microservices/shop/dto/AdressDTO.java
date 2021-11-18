package br.com.alura.microservices.shop.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdressDTO {

	private String road;
	private String number;
	private String state;
	
}
