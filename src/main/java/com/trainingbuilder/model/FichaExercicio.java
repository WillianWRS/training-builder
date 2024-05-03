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
public class FichaExercicio {
	
	private Long id;
	
	private Ficha ficha;
	
	private Exercicio exercicio;
	
	private String descricao;
	
	private LocalDate dataCriacao;

}
