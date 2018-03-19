import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ListaPacientePanel extends JPanel{
	
	private JLabel seusPacientes;
	private JTextField buscaPaciente;
	private JPanel testeCenter;
	private JPanel bot;
	private DefaultTableModel model;
	private JTable listaPacientes;
	private JScrollPane scroll;
	private JButton adicionarPaciente;
	private InformacaoInterface informacaoInterface;
	
	public ListaPacientePanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		Dimension dim = new Dimension();
		dim.width=170;
		setPreferredSize(dim);
		
		
		//componentes
		seusPacientes = new JLabel("Seus Pacientes:");
		buscaPaciente = new JTextField(10);
//		testeCenter = new JPanel();
		model = new DefaultTableModel(new Object[][] {{"gabriel"},{"edu"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"},{"bernardinho"}},new Object[][] {{"Paciente"}});
		listaPacientes = new JTable(model);
		listaPacientes.setDefaultEditor(Object.class, null);
//		bot = new JPanel();
		scroll = new JScrollPane(listaPacientes);
		adicionarPaciente = new JButton("Adicionar");
		
//		testeCenter.setBackground(Color.BLACK);
//		bot.setBackground(Color.GREEN);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		listaPacientes.setTableHeader(null);
		listaPacientes.setShowVerticalLines(false);
		listaPacientes.setBackground(null);
		listaPacientes.setRowHeight(25);
		listaPacientes.setFont(new Font ("Arial",Font.PLAIN,14));
		
		adicionarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(informacaoInterface!=null) {
					informacaoInterface.HidePanel(true);
				}
			}
		});
		
		//Primeira linha
		
		gc.insets=new Insets(5,5,0,5);
		gc.gridx=0;
		gc.gridy=0;
		gc.weighty=0;
		gc.weightx=1;
		gc.anchor=gc.FIRST_LINE_START;
		add(seusPacientes,gc);
		
		//Segunda linha
		gc.insets=new Insets(10,5,0,5);
		gc.gridy++;
		gc.weighty=0;
		gc.fill=gc.HORIZONTAL;
		gc.anchor=gc.FIRST_LINE_START;
		add(buscaPaciente,gc);
		
		//Terceira Linha
		gc.insets=new Insets(10,5,0,5);
		gc.gridy++;
		gc.weighty=1;
		gc.anchor=gc.FIRST_LINE_START;
		gc.fill=gc.BOTH;
		add(scroll,gc);
		
		//Quarta Linha
//		bot.setPreferredSize(new Dimension(0,50));
		gc.insets=new Insets(10,5,5,5);
		gc.gridy++;
		gc.weighty=0;
		gc.anchor=gc.FIRST_LINE_START;
		gc.fill=gc.BOTH;
		add(adicionarPaciente,gc);
		
		
	}
	
	public void getInterface(InformacaoInterface informacaoInterface) {
		this.informacaoInterface=informacaoInterface;
	}
}
