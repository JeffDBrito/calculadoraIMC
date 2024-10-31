package calculadoraIMC.Model;

import java.text.ParseException;

public interface InterfaceConversor {
	
	public double converterString(String entrada) throws ParseException, NumberFormatException, NullPointerException;

}
