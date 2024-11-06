package calculadoraIMC.Model;

import java.text.ParseException;
/***
 * Interface responsavel por garantir a implementacao de metodos necessarios para o Conversor de entrada funcionar corretamente.
 */
public interface InterfaceConversor {
	/***
	 * Metodo responsavel por converter entradas em String para double.
	 * @param entrada Parametro do tipo String que se refere a uma entrada do usuario.
	 * @return Retorna um double que representa a entrada do usuario convertida para um formato double valido.
	 * @throws ParseException Lanca um erro dependendo do sucesso da conversao.
	 * @throws NumberFormatException Lanca um erro dependendo do sucesso da conversao.
	 * @throws NullPointerException Lanca um erro dependendo do sucesso da conversao.
	 */
	public double converterString(String entrada) throws ParseException, NumberFormatException, NullPointerException;

}
