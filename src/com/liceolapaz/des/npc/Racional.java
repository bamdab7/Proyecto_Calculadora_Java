package com.liceolapaz.des.npc;

public class Racional implements Numero {
	
	private int numerador;
	private int denominador;
	
	public Racional(int numerador,int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	// Source- Generate  Getters and Setters
	//Solo seleccionamos métodos GET 	
	public int getNumerador() {
		return numerador;
	}


	public int getDenominador() {
		return denominador;
	}


	@Override
	public Numero suma(Numero operando) {
		if(operando instanceof Racional) {
			int a = this.numerador;
			int b = this.denominador;
			int c = ((Racional)operando).getNumerador();
			int d = ((Racional) operando).getDenominador(); //operando.denominador y autocompletar
			int nuevoNumerador;
			int nuevoDenominador;
			nuevoNumerador = a * d + b * c;
			nuevoDenominador = b * d;
			Racional resultado =
					new Racional(nuevoNumerador, nuevoDenominador);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero resta(Numero operando) {
		if(operando instanceof Racional) {
			int a = this.numerador;
			int b = this.denominador;
			int c = ((Racional)operando).getNumerador();
			int d = ((Racional) operando).getDenominador(); 
			int nuevoNumerador;
			int nuevoDenominador;
			nuevoNumerador = a *d - b *c;
			nuevoDenominador = b* d;
			Racional resultado =
					new Racional(nuevoNumerador, nuevoDenominador);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero producto(Numero operando) {
		if(operando instanceof Racional) {
			int a = this.numerador;
			int b = this.denominador;
			int c = ((Racional)operando).getNumerador();
			int d = ((Racional) operando).getDenominador(); 
			int nuevoNumerador;
			int nuevoDenominador;
			nuevoNumerador = a * c;
			nuevoDenominador = b * d;
			Racional resultado =
					new Racional(nuevoNumerador, nuevoDenominador);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero division(Numero operando) {
		if(operando instanceof Racional) {
			int a = this.numerador;
			int b = this.denominador;
			int c = ((Racional)operando).getNumerador();
			int d = ((Racional) operando).getDenominador(); //operando.denominador y autocompletar
			int nuevoNumerador;
			int nuevoDenominador;
			nuevoNumerador = a * d;
			nuevoDenominador = b *c;
			Racional resultado =
					new Racional(nuevoNumerador, nuevoDenominador);
			return resultado;
		}
		return null;
	}

	@Override
	public String mostrar() {
		return this.numerador + "/" + this.denominador;	
	}

}
