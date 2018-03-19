import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private MenuBarMainFrame menuBar;
	private ListaPacientePanel listaPaciente;
	private InformacaoClientePanel clientePanel;
	private InformacaoInterface informacaoInterface;
	
	public MainFrame(String name) {
		super(name);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setLayout(new BorderLayout());
		
		menuBar = new MenuBarMainFrame();
		listaPaciente = new ListaPacientePanel();
		clientePanel = new InformacaoClientePanel();
		
		setJMenuBar(menuBar);
		
		
		
		informacaoInterface = new InformacaoInterface() {
			public void HidePanel(boolean hide) {
				if(!clientePanel.isVisible()) {
					clientePanel.setVisible(true);
//					System.out.println(hide);
				}
			}
		};
		
		listaPaciente.getInterface(informacaoInterface);
		
		
		add(listaPaciente,BorderLayout.WEST);
		add(clientePanel,BorderLayout.CENTER);
		
		
	}
}
