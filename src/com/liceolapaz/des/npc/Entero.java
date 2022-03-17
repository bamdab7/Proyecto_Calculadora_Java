package com.liceolapaz.des.npc;

public class Entero implements Numero {
	
	private int valor;
	
	public Entero(int valor) {
		this.valor = valor;
		
	}

	public int getValor() {
		return valor;
	}


	@Override
	public Numero suma(Numero operando) {
		if (operando instanceof Entero){
			Entero resultado;
			int nuevoValor =this.valor + ((Entero) operando).getValor();
			resultado = new Entero (nuevoValor);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero resta(Numero operando) {
		if (operando instanceof Entero) {
			Entero resultado ;
			int nuevoValor = this.valor - ((Entero) operando).getValor();
			resultado = new Entero(nuevoValor);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero producto(Numero operando) {
		if (operando instanceof Entero) {
			Entero resultado ;
			int nuevoValor = this.valor * ((Entero) operando).getValor();
			resultado = new Entero(nuevoValor);
			return resultado;	
		}
		return null;
	}

	@Override
	public Numero division(Numero operando) {
		if (operando instanceof Entero) {
			Entero resultado ;
			int valorOperando =((Entero) operando).getValor();
			if (valorOperando ==0) {
				System.out.println ("ERROR: División entre cero");
				return null;
			}
			int nuevoValor = this.valor / ((Entero) operando).getValor();
			resultado = new Entero(nuevoValor);
			return resultado;
		}
		return null;
	}
	
	@Override
	public String mostrar() {
		return "" + this.valor;
	}
}
