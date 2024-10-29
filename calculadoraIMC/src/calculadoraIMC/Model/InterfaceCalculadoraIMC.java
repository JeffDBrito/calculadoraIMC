package calculadoraIMC.Model;

import calculadoraIMC.Exception.AlturaErradaException;
import calculadoraIMC.Exception.PesoErradoException;

public interface InterfaceCalculadoraIMC {
	
	public double calcularIMC(double peso, double altura) throws PesoErradoException, AlturaErradaException;
	

	public TiposIMC AtribuirIMC(double imc);
	
	public double calcularDiferenca(double imc);
}
