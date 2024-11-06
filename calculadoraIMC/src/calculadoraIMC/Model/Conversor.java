package calculadoraIMC.Model;

import java.text.ParseException;
/***
 * Classe responsavel por implementar a InterfaceConversor e seus metodos, assim atribuindo as determinadas regras de negocio para esses metodos.
 */
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
