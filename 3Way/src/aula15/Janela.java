package aula15;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public final class Janela extends JFrame {}
	
	public Janela(){
		
		setSize(400, 255);
		setTitle("Linguagem de programação II");
		
		private JLabel jlAgencia;
		private JTextField jtfAgencia;
		private JLabel jlConta;
		private JTextField jtfConta;
		private JSeparator jSeparator01;
		private JLabel jlNome;
		private JTextField jtfNome;
		private JLabel jlEndereco;
		private JTextField jtfEndereco;
		private JLabel jlTelefone;
		private JTextField jtfTelefone;
		private JLabel jlCpf;
		private JTextField jtfCpf;
		private JRadioButton jrbCorrente;
		private JRadioButton jrbPoupanca;
		private ButtonGroup bgContas;
		private JSeparator jSeparator02;
		private JButton jbConsultar;
		private JButton jbAtualizar;
		private JButton jbFechar;
	
		
		
		private void centralizar(){
			
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension janela = getSize();
			
			if (janela.height > screen.height){
				setSize(janela.width, screen.height);
			}
			if (janela.width > screen.width){
				setSize(screen.width, janela.height);
			}
			
			setLocation((screen.width - janela.width) / 2,
					(screen.height - janela.height) / 2);
			
			setResizable(false);
			getContentPane().setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			public static void main(String[] args){
				Janela janela = new Janela();
				janela.setVisible(true);
			}
			
	}

	
		
	
