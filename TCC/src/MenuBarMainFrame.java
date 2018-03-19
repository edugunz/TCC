import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarMainFrame extends JMenuBar {
	
	private JMenu arquivo;
	private JMenu editar;
	private JMenu visualizar;
	private JMenu sobre;
	private JMenuItem novoPaciente;
	
	private JMenuItem logout;
	private JMenuItem fechar;
	
	public MenuBarMainFrame() {
		arquivo = new JMenu("Arquivo");
		editar = new JMenu("Editar");
		visualizar = new JMenu("Visualizar");
		sobre = new JMenu("Sobre");
		novoPaciente = new JMenuItem("Novo Paciente");
		logout = new JMenuItem("Logout");
		fechar = new JMenuItem("Fechar");	
		
		arquivo.add(novoPaciente);
		arquivo.addSeparator();
		arquivo.add(logout);
		arquivo.add(fechar);
		
		fechar.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		add(arquivo);
		add(editar);
		add(visualizar);
		add(sobre);		
		
	}
}
