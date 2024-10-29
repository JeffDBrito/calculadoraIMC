package calculadoraIMC.Model;

import calculadoraIMC.Exception.AlturaErradaException;
import calculadoraIMC.Exception.PesoErradoException;

public class CalculadoraIMC implements InterfaceCalculadoraIMC{

	@Override
	public double calcularIMC(double peso, double altura) throws PesoErradoException, AlturaErradaException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TiposIMC AtribuirIMC(double imc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcularDiferenca(double imc) {
		// TODO Auto-generated method stub
		return 0;
	}

}
