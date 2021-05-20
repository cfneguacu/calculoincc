package calculoincc;

import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Formatter;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class CalculoIncc{

	static JFrame frame;
	static JLabel[] label = new JLabel[22];
	static JFormattedTextField field1;
	static JFormattedTextField field2;
	static JFormattedTextField field3;
	static JFormattedTextField field4;
	static JPanel panel;
	static JLabel label2;
	static JLabel label3;
	static JLabel label4;
	static JLabel label5;
	static ActionListener calcular;
	static ActionListener limpar;
	static float credito;
	static String fieldprazo;
	static String fieldparcela;
	static String fieldtaxa;
	static JButton botao1;
	static JButton botao2;
	static float prazo = 0;
	static float parcela = 0;
	static float taxa = 0;
	
	
	public static void main(String[] args) throws ParseException {
		
		
	try {
		
		
		
		frame = new JFrame("Simulação Calculo INCC");
		frame.setSize(300,580);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		field1 = new JFormattedTextField();
		field2 = new JFormattedTextField();
		field3 = new JFormattedTextField();
		field4 = new JFormattedTextField();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		botao1 = new JButton();
		botao2 = new JButton();
		
		frame.add(panel);
		frame.add(field1);
		frame.add(field2);
		frame.add(field3);
		frame.add(field4);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(botao1);
		frame.add(botao2);
		
		
		label2.setVisible(true);
		label2.setBounds(25, 9, 50, 20);
		label2.setText("Crédito");
		
		label3.setVisible(true);
		label3.setBounds(25, 59, 50, 20);
		label3.setText("Prazo");
		
		label4.setVisible(true);
		label4.setBounds(25, 109, 50, 20);
		label4.setText("Parcela");
		
		label5.setVisible(true);
		label5.setBounds(25, 159, 50, 20);
		label5.setText("INCC");
		
		botao1.setVisible(true);
		botao1.setBounds(25,200,100,20);
		botao1.setText("Calcular");
		
		botao2.setVisible(true);
		botao2.setBounds(175,200,100,20);
		botao2.setText("Limpar");
		
		field1.setVisible(true);
		field1.setBounds(25, 25, 250, 20);
		
		
		field2.setVisible(true);
		field2.setBounds(25, 75, 250, 20);
		String prazo_texto = field2.getText();
		
		
		field3.setVisible(true);
		field3.setBounds(25, 125, 250, 20);
		String parcela_texto = field3.getText();
		
		field4.setVisible(true);
		field4.setBounds(25, 175, 250, 20);
		String taxa_texto = field3.getText();

		prazo = Float.parseFloat(prazo_texto);
		parcela = Float.parseFloat(parcela_texto);
		taxa = Float.parseFloat(taxa_texto);
		
	
	}catch(NumberFormatException e) {
			
			calcular = null;
			limpar = null;
			botao1.addActionListener(new botao1(calcular));
			botao2.addActionListener(new botao2(limpar) );
			
	}
	
	}

}
			
			


	
		


