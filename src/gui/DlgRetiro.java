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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DlgRetiro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblNumRetiro;
	private JLabel lblNumMatricula;
	private JLabel lblFecha;
	private JLabel lblHora;
	private JTextField txtNumRetiro;
	private JTextField txtNumMatricula;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JScrollPane scrollPane;
	private JTable tblRetiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRetiro dialog = new DlgRetiro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRetiro() {
		setTitle("Registro | Retiro");
		setBounds(100, 100, 660, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdicionar.setBounds(534, 10, 100, 25);
		contentPanel.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(534, 45, 100, 25);
		contentPanel.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModificar.setBounds(534, 80, 100, 25);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setBounds(534, 115, 100, 25);
		contentPanel.add(btnEliminar);
		
		lblNumRetiro = new JLabel("N° Retiro:");
		lblNumRetiro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumRetiro.setBounds(10, 10, 100, 14);
		contentPanel.add(lblNumRetiro);
		
		lblNumMatricula = new JLabel("N° Matrícula:");
		lblNumMatricula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumMatricula.setBounds(10, 45, 110, 14);
		contentPanel.add(lblNumMatricula);
		
		lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFecha.setBounds(10, 80, 75, 14);
		contentPanel.add(lblFecha);
		
		txtNumRetiro = new JTextField();
		txtNumRetiro.setColumns(10);
		txtNumRetiro.setBounds(120, 10, 320, 20);
		contentPanel.add(txtNumRetiro);
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setColumns(10);
		txtNumMatricula.setBounds(120, 45, 320, 20);
		contentPanel.add(txtNumMatricula);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(120, 80, 141, 20);
		contentPanel.add(txtFecha);
		
		lblHora = new JLabel("Hora:");
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHora.setBounds(271, 80, 75, 14);
		contentPanel.add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(325, 79, 115, 20);
		contentPanel.add(txtHora);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 172, 624, 228);
		contentPanel.add(scrollPane);
		
		tblRetiro = new JTable();
		tblRetiro.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0 RETIRO", "N\u00B0 MATR\u00CDCULA", "FECHA", "HORA"
			}
		));
		scrollPane.setViewportView(tblRetiro);
	}

}
