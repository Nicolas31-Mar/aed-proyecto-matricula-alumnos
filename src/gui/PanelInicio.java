package gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelInicio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTituloInicio;

	/**
	 * Create the panel.
	 */
	public PanelInicio() {
		setBackground(new Color(245, 247, 250));
		setLayout(null);
		
		lblTituloInicio = new JLabel("Inicio");
		lblTituloInicio.setForeground(new Color(32, 47, 70));
		lblTituloInicio.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloInicio.setBounds(30, 30, 450, 40);
		add(lblTituloInicio);

	}

}
