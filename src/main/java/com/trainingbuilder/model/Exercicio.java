package com.trainingbuilder.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exercicio {
	
	private Long id;
	
	private String nome;
	
	private LocalDate dataCriacao;

}
