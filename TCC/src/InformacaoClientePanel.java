import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
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
		add(informacao, BorderLayout.NORTH);
	}
}

class InformacaoAtualPanel extends JPanel {

	private JTextField nome;
	private JTextField sobrenome;
	private JTextField dtnascimento;
	private JTextField idade;
	private JTextField cpf;
	private JTextField profissao;
	private JTextField observacao;
	private JTextField endereco;
	private JTextField cidade;
	private JTextField estado;
	private JTextField cep;
	private JTextField telefone;
	private JComboBox sexo;
	private JCheckBox atvfisica;
	private JCheckBox histqueda;

	public InformacaoAtualPanel() {
		setLayout(new GridBagLayout());
		Dimension dim = new Dimension();
		dim.height = 250;
		setPreferredSize(dim);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));

		GridBagConstraints gc = new GridBagConstraints();

		nome = new JTextField(10);
		sobrenome = new JTextField(10);
		sexo = new JComboBox();
		dtnascimento = new JTextField(10);
		idade = new JTextField(10);
		cpf = new JTextField(10);
		profissao = new JTextField(10);
		observacao = new JTextField(10);
		endereco = new JTextField(10);
		cidade = new JTextField(10);
		estado = new JTextField(10);
		cep = new JTextField(10);
		telefone = new JTextField(10);
		atvfisica = new JCheckBox();
		histqueda = new JCheckBox();
		DefaultComboBoxModel sexomodel = new DefaultComboBoxModel();
		sexomodel.addElement("Masculino");
		sexomodel.addElement("Feminino");
		sexo.setModel(sexomodel);

		// Primeira linha
		gc.insets = new Insets(5, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 0;
		gc.gridy = 0;
		add(new JLabel("Nome: "), gc);

		gc.gridx = 1;
		gc.gridy = 0;
		add(nome, gc);

		// Segunda linha
		gc.insets = new Insets(5, 0, 0, 0);
		gc.gridx = 0;
		gc.gridy = 1;
		add(new JLabel("Sobrenome: "), gc);

		gc.gridx = 1;
		gc.gridy = 1;
		add(sobrenome, gc);

		// Terceira linha
		gc.gridx = 0;
		gc.gridy = 2;
		add(new JLabel("Data de nascimento: "), gc);

		gc.gridx = 1;
		gc.gridy = 2;
		add(dtnascimento, gc);

		// proxima linha
		gc.gridy++;
		gc.gridx = 0;
		gc.fill = gc.HORIZONTAL;
		add(new JLabel("Sexo: "), gc);

		gc.gridx = 1;
		// gc.gridy=2;
		add(sexo, gc);
		gc.fill = 0;

		// proxima linha
		gc.gridy++;
		gc.gridx = 0;
		add(new JLabel("Idade: "), gc);

		gc.gridx = 1;
		// gc.gridy=2;
		add(idade, gc);

		// proxima linha
		gc.gridy++;
		gc.gridx = 0;
		add(new JLabel("CPF: "), gc);

		gc.gridx = 1;
		// gc.gridy=2;
		add(cpf, gc);

		// proxima linha
		gc.gridy++;
		gc.gridx = 0;
		add(new JLabel("Profissão: "), gc);

		gc.gridx = 1;
		// gc.gridy=2;
		add(profissao, gc);

		// proxima linha
		gc.gridy++;
		gc.gridx = 0;
		add(new JLabel("Observações: "), gc);

		gc.gridx = 1;
		// gc.gridy=2;
		add(observacao, gc);

		// coluna 2
		// proxima linha
		gc.insets = new Insets(5, 10, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 2;
		gc.gridy = 0;
		add(new JLabel("Endereço: "), gc);

		gc.gridx = 3;
		// gc.gridy = 0;
		add(endereco, gc);

		// proxima linha
		gc.gridx = 2;
		gc.gridy++;
		add(new JLabel("Cidade: "), gc);

		gc.gridx = 3;
		// gc.gridy = 0;
		add(cidade, gc);

		// proxima linha
		gc.gridx = 2;
		gc.gridy++;
		add(new JLabel("Estado: "), gc);

		gc.gridx = 3;
		// gc.gridy = 0;
		add(estado, gc);

		// proxima linha
		gc.gridx = 2;
		gc.gridy++;
		add(new JLabel("CEP: "), gc);

		gc.gridx = 3;
		// gc.gridy = 0;
		add(cep, gc);

		// proxima linha
		gc.gridx = 2;
		gc.gridy++;
		add(new JLabel("Telefone: "), gc);

		gc.gridx = 3;
		// gc.gridy = 0;
		add(telefone, gc);

		// proxima linha
		gc.gridx = 2;
		gc.gridy++;
		add(new JLabel("Faz atividade física: "), gc);
		
//		gc.anchor=gc.CENTER;
		gc.gridx = 3;
		// gc.gridy = 0;
		add(atvfisica, gc);

//		gc.anchor = GridBagConstraints.LINE_START;
		// proxima linha
		gc.gridx = 2;
		gc.gridy++;
		add(new JLabel("Histórico de queda: "), gc);

		gc.gridx = 3;
		// gc.gridy = 0;
		add(histqueda, gc);

	}
}