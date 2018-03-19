import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NovoPacientePanel extends JFrame {
	
	private JTextField nome;
	private JTextField sobrenome;
	private JComboBox sexo;
	
	public NovoPacientePanel(String name) {
		super(name);
		setVisible(true);
		setSize(400,600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		nome = new JTextField(10);
		sobrenome = new JTextField(10);
		sexo = new JComboBox();
		DefaultComboBoxModel sexomodel = new DefaultComboBoxModel();
		sexomodel.addElement("Masculino");
		sexomodel.addElement("Feminino");
		sexo.setModel(sexomodel);
		
		
		//Primeira linha
		gc.insets=new Insets(5,0,0,0);
		gc.anchor=GridBagConstraints.LINE_START;
		gc.gridx=0;
		gc.gridy=0;
		add(new JLabel("Nome: "),gc);
		
		gc.gridx=1;
		gc.gridy=0;
		add(nome,gc);
		
		//Segunda linha
		gc.gridx=0;
		gc.gridy=1;
		add(new JLabel("Sobrenome: "),gc);
		
		gc.gridx=1;
		gc.gridy=1;
		add(sobrenome,gc);
		
		//Segunda linha
		gc.gridx=0;
		gc.gridy=2;
		add(new JLabel("Sexo: "),gc);
		
		gc.gridx=1;
		gc.gridy=2;
		add(sexo,gc);
		
		
	}
}
