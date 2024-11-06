package calculadoraIMC.Model;

import calculadoraIMC.Exception.AlturaErradaException;
import calculadoraIMC.Exception.PesoErradoException;
/***
 * Interface responsavel por garantir a implementacao de metodos necessarios para a calculadora de IMC funcionar corretamente.
 */

public interface InterfaceCalculadoraIMC {
	
	/***
	 * Metodo responsavel por calcular o IMC de um usuario, recebendo como parametros o peso e a altura do usuario.
	 * @param peso Parametro do tipo double que se refere ao peso do usuario.
	 * @param altura Parametro do tipo double que se refere a altura do usuario.
	 * @return Retorno um valor do tipo double que representa o valor do IMC do usuario.
	 * @throws PesoErradoException Lanca um erro dependendo do peso fornecido.
	 * @throws AlturaErradaException  Lanca um erro dependendo da altura fornecida.
	 */
	public double calcularIMC(double peso, double altura) throws PesoErradoException, AlturaErradaException;
	
	/***
	 * Metodo responsavel por informar o tipo de IMC que representa Indice de massa corporal do usuario, para isso recebe como parametro o IMC do usuario ja calculado.
	 * @param imc Parametro do tipo double que representa o IMC do usuario ja calculado.
	 * @return Retorna um Valor do tipo TiposIMC que representa o tipo do IMC do usuario.
	 */
	public TiposIMC AtribuirIMC(double imc);
	
	/***
	 * Metodo responsavel por informar a dferenca de valor necessario para o usuario alcancar o peso ideal.
	 * @param imc Parametro do tipo double que representa o IMC do usuario ja calculado.
	 * @return Retorna um valor do tipo double que representa a diferenca entre o IMC fonecido pelo usuario e o peso ideal.
	 */
	public double calcularDiferenca(double imc);
}
