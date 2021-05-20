package calculoincc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JLabel;

public class botao1 implements ActionListener {
	
	public botao1(ActionListener calcular) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		    float prazo = Float.parseFloat(CalculoIncc.field2.getText());
			float parcela = Float.parseFloat(CalculoIncc.field3.getText());
			float taxa = Float.parseFloat(CalculoIncc.field4.getText());
			float valorporano=0;
			float custototal=0;
			
			int y = 235;
			int i = 1;
			
			CalculoIncc.label[0] = new JLabel(" ano "+" Valor parcela "+ " Valor por ano ");
			CalculoIncc.frame.add(CalculoIncc.label[0]);
			CalculoIncc.label[0].setVisible(true);
			CalculoIncc.label[0].setBounds(25, y-10, 200, 20);
			calculo(i,y,parcela,prazo,taxa,valorporano,custototal);
			
	}
		
		public static void calculo(int i,int y, float parcela,float prazo, float taxa, float valorporano,float custototal) {
	
		y+=10;
		String resultado = "";
		
		if(i==1) {
			if(i<=prazo/12) {
				
				parcela = Float.parseFloat(CalculoIncc.field3.getText());
				valorporano = parcela*12;
				custototal = custototal+valorporano;
				CalculoIncc.label[i] = new JLabel();
				CalculoIncc.frame.add(CalculoIncc.label[i]);
				resultado = i+"   "+ NumberFormat.getCurrencyInstance().format(parcela) +"   "+NumberFormat.getCurrencyInstance().format(valorporano);
				CalculoIncc.label[i].setText(resultado);
				CalculoIncc.label[i].setVisible(true);
				CalculoIncc.label[i].setBounds(25, y, 200, 20);
				
			}else{
				
				valorporano = parcela*(prazo/12-(int)prazo/12)*12;
				custototal = custototal+valorporano;
				CalculoIncc.label[i] = new JLabel();
				CalculoIncc.frame.add(CalculoIncc.label[i]);
				resultado = i+"   "+ NumberFormat.getCurrencyInstance().format(parcela) +"   "+NumberFormat.getCurrencyInstance().format(valorporano);
				CalculoIncc.label[i].setText(resultado);
				CalculoIncc.label[i].setVisible(true);
				CalculoIncc.label[i].setBounds(25, y, 200, 20);
			}
		}else if(i-1<prazo/12){
			if(i<=prazo/12) {
				
			parcela = (parcela/100*taxa)+parcela;
			valorporano = parcela*12;
			custototal = custototal+valorporano;
            
			CalculoIncc.label[i] = new JLabel();
			CalculoIncc.frame.add(CalculoIncc.label[i]);
			resultado = i+"   "+ NumberFormat.getCurrencyInstance().format(parcela) +"   "+NumberFormat.getCurrencyInstance().format(valorporano);
			CalculoIncc.label[i].setText(resultado);
			CalculoIncc.label[i].setVisible(true);
			CalculoIncc.label[i].setBounds(25, y, 200, 20);
			}else{
				
			parcela = (parcela/100*taxa)+parcela;	
			valorporano = parcela*(prazo/12-(int)prazo/12)*12;
			custototal = custototal+valorporano;
			CalculoIncc.label[i] = new JLabel();
			CalculoIncc.frame.add(CalculoIncc.label[i]);
			resultado = i+"   "+ NumberFormat.getCurrencyInstance().format(parcela) +"   "+NumberFormat.getCurrencyInstance().format(valorporano);
			CalculoIncc.label[i].setText(resultado);
			CalculoIncc.label[i].setVisible(true);
			CalculoIncc.label[i].setBounds(25, y, 200, 20);
			}
	}
		
		i++;
		
		if(i<21) {
		calculo(i,y,parcela,prazo,taxa,valorporano,custototal);	
		}else {
		CalculoIncc.label[21] = new JLabel(" Custo Total "+ NumberFormat.getCurrencyInstance().format(custototal));
		CalculoIncc.frame.add(CalculoIncc.label[21]);
		CalculoIncc.label[21].setVisible(true);
		CalculoIncc.label[21].setBounds(25, 500, 200, 20);
		}
		
		
	}
		
}



