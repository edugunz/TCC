import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InformacaoClientePanel extends JPanel {
	
	InformacaoAtualPanel informacao;
	
	public InformacaoClientePanel() {
		setVisible(false);
		setLayout(new BorderLayout());
		informacao = new InformacaoAtualPanel();
		add(informacao,BorderLayout.NORTH);
	}
}

class InformacaoAtualPanel extends JPanel{
	
	private JTextField nome;
	private JTextField sobrenome;
	private JTextField endereco;
	private JComboBox sexo;
	
	public InformacaoAtualPanel() {
		setLayout(new GridBagLayout());
		Dimension dim = new Dimension();
		dim.height=200;
		setPreferredSize(dim);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		GridBagConstraints gc = new GridBagConstraints();
		
		nome = new JTextField(10);
		sobrenome = new JTextField(10);
		endereco = new JTextField(10);
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
		
		gc.insets=new Insets(5,10,0,0);
		gc.anchor=GridBagConstraints.LINE_START;
		gc.gridx=2;
		gc.gridy=0;
		add(new JLabel("Endereço: "),gc);
		
		gc.gridx=3;
		gc.gridy=0;
		add(endereco,gc);
		
		//Segunda linha
		gc.insets=new Insets(5,0,0,0);
		gc.gridx=0;
		gc.gridy=1;
		add(new JLabel("Sobrenome: "),gc);
		
		gc.gridx=1;
		gc.gridy=1;
		add(sobrenome,gc);
		
		//Terceira linha
		gc.gridx=0;
		gc.gridy=2;
		add(new JLabel("Sexo: "),gc);
		
		gc.gridx=1;
		gc.gridy=2;
		add(sexo,gc);
	}
}