package calculadoraIMC.Model;

import calculadoraIMC.Exception.AlturaErradaException;
import calculadoraIMC.Exception.PesoErradoException;

public class CalculadoraIMC implements InterfaceCalculadoraIMC{

	@Override
	public double calcularIMC(double peso, double altura) throws PesoErradoException, AlturaErradaException {
		
		if(peso<0.200 || peso>595) {
			throw new PesoErradoException();
		}
		
		else if(altura<0.82 || altura>3) {
			throw new AlturaErradaException();
		}
		
		return peso/Math.pow(altura, 2);
	}

	@Override
	public TiposIMC AtribuirIMC(double imc) {
		
		if (imc<18.5) {
			return TiposIMC.BAIXOPESO;
		}
		else if (imc<25) {
			return TiposIMC.NORMAL;
		}
		else if (imc<30) {
			return TiposIMC.ACIMADOPESO;
		}
		else if (imc<35) {
			return TiposIMC.OBESIDADEGRAU1;
		}

		return TiposIMC.OBESIDADEGRAU2;
	}

	@Override
	public double calcularDiferenca(double imc) {
		if(imc<18.5) {
			return 18.5-imc;
		}
		else if (imc>24.99) {
			return imc-24.99;
		}
		return 0;
	}

}
