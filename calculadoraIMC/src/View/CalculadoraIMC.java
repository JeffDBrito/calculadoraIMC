package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import calculadoraIMC.Exception.AlturaErradaException;
import calculadoraIMC.Exception.PesoErradoException;
import calculadoraIMC.Model.TiposIMC;

public class CalculadoraIMC extends JanelaPadrao{
	
	private JTextField campoAltura;
	private JTextField campoPeso;

	public CalculadoraIMC() {
		
		JanelaFacade.criarTexto(this, 0, 40, 550, 30, "Calculadora IMC", new java.awt.Font("Arial", java.awt.Font.BOLD, 20), JLabel.CENTER, Color.WHITE);
		
		JanelaFacade.criarTexto(this, 60, 55, 450, 120, "Pode-se calcular os valores abaixo para ", new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		JanelaFacade.criarTexto(this, 60, 85, 450, 120, "verificar o índice de massa corporal que possui.", new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		
		JanelaFacade.criarTexto(this, 135, 185, 450, 120, "Altura:", new Font("TimesRoman", Font.PLAIN, 17), JLabel.LEFT, Color.WHITE);
		this.campoAltura = JanelaFacade.criarCampoTextoComum(this, 135, 265, 300, 25, new LineBorder(Color.BLACK, 2));
		
		JanelaFacade.criarTexto(this, 135, 320, 450, 120, "Peso:", new Font("TimesRoman", Font.PLAIN, 17), JLabel.LEFT, Color.WHITE);
		this.campoPeso = JanelaFacade.criarCampoTextoComum(this, 135, 400, 300, 25, new LineBorder(Color.BLACK, 2));
		
		JanelaFacade.criarBotao(this, ouvinteBotaoCalcular(), "Calcular", new Font("TimesRoman", Font.PLAIN, 17), Color.BLACK, 220, 505, 120, 30, new Color(174, 55, 255), new LineBorder(Color.WHITE, 2), null, 0, 0);
		
		
		setVisible(true);
	}
	
	public ActionListener ouvinteBotaoCalcular() {
		return new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				calculadoraIMC.Model.CalculadoraIMC calculadora = new calculadoraIMC.Model.CalculadoraIMC();
				try {
					double imc = calculadora.calcularIMC(Double.parseDouble(campoPeso.getText()), Double.parseDouble(campoAltura.getText()));
					TiposIMC tipo = calculadora.AtribuirIMC(imc);
					String categoria = "";	
					
					switch(tipo) {
					
					case BAIXOPESO:
						categoria = "Abaixo do Peso";
						break;
					case NORMAL:
						categoria = "Peso Normal";
						break;
					case ACIMADOPESO:
						categoria = "Acima do peso";
						break;
					case OBESIDADEGRAU1:
						categoria = "Obesidade Grau 1";
						break;
					case OBESIDADEGRAU2:
						categoria = "obesidade grau 2";
						break;
					default:
						categoria = "Não definido";
						break;						
					}
					
					double sugerido = calculadora.calcularDiferenca(imc);
					
					dispose();
					new ResultadoIMC(imc, categoria, sugerido);
				
				}catch(PesoErradoException erro) {
					JOptionPane.showMessageDialog(null, "Peso inválido, tente novamente!");
				}catch(AlturaErradaException erro) {
					JOptionPane.showMessageDialog(null, "Altura inválida, tente novamente!");
				}
			}
		};
	}
}
