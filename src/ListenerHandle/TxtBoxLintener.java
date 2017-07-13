package ListenerHandle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import PickNumber.CreateNumber;

public class TxtBoxLintener extends InputVerifier implements ActionListener{
	CreateNumber cn= new CreateNumber(); 
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verify(JComponent input) {
		// TODO Auto-generated method stub
		String str= ((JTextField)input).getText();
		if(!str.isEmpty()){
		if(cn.stringConvertToInteger(str) == 0){
			JOptionPane.showMessageDialog(null, "¿ù»~ªº¼Æ¦r");
			return false;
		}else{
			return true;
		}
		}else{
			return true;
		}
		
	}

	

}
