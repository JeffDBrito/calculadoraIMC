package View;

import javax.swing.JFrame;
import javax.swing.JPanel;


public abstract class JanelaPadrao extends JFrame{
	public JanelaPadrao(){
		//Color purpleTwilight = new Color(95, 0, 160);
		//getContentPane().setBackground(purpleTwilight);
		JPanel contentPane = new GradienteBackgroundPainel();
        setContentPane(contentPane);
		setResizable(false);
		setTitle("Calculadora IMC");
		setSize(550, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
	}	
}
