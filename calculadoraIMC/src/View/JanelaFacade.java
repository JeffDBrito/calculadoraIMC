package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public abstract class JanelaFacade {
	public static void criarTexto(JanelaPadrao janela, int x, int y, int largura, int altura, String texto, Font fonte, int alinhamento, Color cor){
		JLabel label = new JLabel(texto);
		label.setBounds(x, y, largura, altura);
		label.setFont(fonte);
		label.setHorizontalAlignment(alinhamento);
		label.setForeground(cor);
		janela.add(label);
	}
	
	public static JTextField criarCampoTextoComum(JanelaPadrao janela, int x, int y, int largura, int altura,LineBorder borda) {
		JTextField campoDeTexto = new JTextField();
		campoDeTexto.setFont(null);
		campoDeTexto.setBorder(borda);
		campoDeTexto.setBounds(x, y, largura, altura);
		janela.add(campoDeTexto);
		return campoDeTexto;
	}
	
	public static JButton criarBotao(JanelaPadrao janela, ActionListener ouvinte, String titulo, Font fonte, Color corFonte, int x, int y, int largura, int altura, Color cor, LineBorder borda, String nomeImagem, int larguraImagem, int alturaImagem) {
		JButton botao = new JButton();
		
		botao.setBounds(x, y, largura, altura);
		botao.setBorder(borda);
		botao.setText(titulo);
		botao.setBackground(cor);
		botao.setFont(fonte);
		botao.setForeground(corFonte);
		
		botao.addActionListener(ouvinte);
		janela.add(botao);
		return null;
		
	}
}
