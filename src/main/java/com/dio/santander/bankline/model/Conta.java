package com.dio.santander.bankline.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	private Long numero;
	private Double saldo;
	
	@Column(name = "conta_numero")
	public Long getNumero() {
		return numero;
	}
	
	@Column(name = "conta_saldo")
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
