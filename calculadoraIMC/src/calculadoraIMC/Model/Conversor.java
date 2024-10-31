package calculadoraIMC.Model;

import java.text.ParseException;

public class Conversor implements InterfaceConversor{

	@Override
	public double converterString(String entrada) throws ParseException, NumberFormatException, NullPointerException {
		Double numeroDouble;
		
		if (entrada.contains(",")) {
			numeroDouble = Double.parseDouble(entrada.replace(",", "."));
		}
		
		numeroDouble = Double.parseDouble(entrada);
		
		return numeroDouble;
	}

}
