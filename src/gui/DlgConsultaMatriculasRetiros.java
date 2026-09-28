package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DlgConsultaMatriculasRetiros extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNumOperacion;
	private JTextField txtNumOperacion;
	private JRadioButton rdbtnPorMatricula;
	private JRadioButton rdbtnPorRetiro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnConsultar;
	private JScrollPane scrollPane;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConsultaMatriculasRetiros dialog = new DlgConsultaMatriculasRetiros();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConsultaMatriculasRetiros() {
		setTitle("Consulta | Matrículas y Retiros");
		setBounds(100, 100, 660, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNumOperacion = new JLabel("N° Operación:");
		lblNumOperacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumOperacion.setBounds(10, 15, 115, 20);
		contentPanel.add(lblNumOperacion);
		
		txtNumOperacion = new JTextField();
		txtNumOperacion.setBounds(130, 15, 130, 22);
		contentPanel.add(txtNumOperacion);
		txtNumOperacion.setColumns(10);
		
		rdbtnPorMatricula = new JRadioButton("Por Matrícula");
		buttonGroup.add(rdbtnPorMatricula);
		rdbtnPorMatricula.setSelected(true);
		rdbtnPorMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPorMatricula.setBounds(275, 15, 105, 23);
		contentPanel.add(rdbtnPorMatricula);
		
		rdbtnPorRetiro = new JRadioButton("Por Retiro");
		buttonGroup.add(rdbtnPorRetiro);
		rdbtnPorRetiro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPorRetiro.setBounds(385, 15, 95, 23);
		contentPanel.add(rdbtnPorRetiro);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(514, 13, 120, 25);
		contentPanel.add(btnConsultar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 624, 345);
		contentPanel.add(scrollPane);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtResultado.setEditable(false);
		scrollPane.setViewportView(txtResultado);
	}

}
