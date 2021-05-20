package calculoincc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class botao2 implements ActionListener {

	public botao2(ActionListener limpar) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		CalculoIncc.field1.setText("");
		CalculoIncc.field2.setText("");
		CalculoIncc.field3.setText("");
		CalculoIncc.field4.setText("");
		
		for(int i = 0; i<22; i++) {
			CalculoIncc.label[i].setVisible(false);
		}
	}//
}
		
		


