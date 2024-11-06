package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import calculadoraIMC.Model.TiposIMC;



public class ResultadoIMC extends JanelaPadrao{
	
	private double imc;
	private String categoria;
	private double sugerido;

	public ResultadoIMC(double imc, String categoria, double sugerido) {
		
		this.imc = imc;
		this.categoria = categoria;
			
		JanelaFacade.criarTexto(this, 0, 40, 550, 30, "Resultado do IMC", new java.awt.Font("Arial", java.awt.Font.BOLD, 20), JLabel.CENTER, Color.WHITE);
		
		JanelaFacade.criarTexto(this, 60, 55, 450, 120, "Aqui você pode encontrar o resultado final do ", new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		JanelaFacade.criarTexto(this, 60, 85, 450, 120, "do cálculo do seu índice de massa corporal.", new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		
		JanelaFacade.criarTexto(this, 60, 200, 450, 120, "Valor obtido: ", new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		JanelaFacade.criarTexto(this, 60, 230, 450, 120, String.format("%.2f", this.imc), new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		
		JanelaFacade.criarTexto(this, 60, 270, 450, 120, "Categoria: ", new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		JanelaFacade.criarTexto(this, 60, 290, 450, 120, ""+this.categoria, new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		
		JanelaFacade.criarTexto(this, 60, 330, 450, 120, "IMC sugerido:", new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		JanelaFacade.criarTexto(this, 60, 350, 450, 120, ""+this.sugerido, new Font("TimesRoman", Font.PLAIN, 17), JLabel.CENTER, Color.WHITE);
		
		JanelaFacade.criarBotao(this, ouvinteBotaoRefazer(), "Refazer", new Font("TimesRoman", Font.PLAIN, 17), Color.BLACK, 220, 580, 120, 30, new Color(174, 55, 255), new LineBorder(Color.WHITE, 2), null, 0, 0);
		
		setVisible(true);
			
	}
	
	public ActionListener ouvinteBotaoRefazer() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new CalculadoraIMC();
			}
		};
	}
	
}
