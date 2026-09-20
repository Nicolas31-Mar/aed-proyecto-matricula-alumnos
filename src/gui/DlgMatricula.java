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

public class DlgMatricula extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblN;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtNumMatricula;
	private JTextField txtCodAlumno;
	private JTextField txtCodCurso;
	private JTextField txtFecha;
	private JLabel lblNewLabel;
	private JTextField txtHora;
	private JScrollPane scrollPane;
	private JTable tblMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMatricula dialog = new DlgMatricula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgMatricula() {
		setTitle("Registro | Matricula");
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
		
		lblN = new JLabel("N° Matrícula:");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN.setBounds(10, 10, 100, 14);
		contentPanel.add(lblN);
		
		lblNewLabel_1 = new JLabel("Cod. Alumno:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 45, 100, 14);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cod. Curso:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 80, 100, 14);
		contentPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Fecha:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 115, 75, 14);
		contentPanel.add(lblNewLabel_3);
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setColumns(10);
		txtNumMatricula.setBounds(120, 10, 320, 20);
		contentPanel.add(txtNumMatricula);
		
		txtCodAlumno = new JTextField();
		txtCodAlumno.setColumns(10);
		txtCodAlumno.setBounds(120, 45, 320, 20);
		contentPanel.add(txtCodAlumno);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(120, 80, 320, 20);
		contentPanel.add(txtCodCurso);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(120, 115, 141, 20);
		contentPanel.add(txtFecha);
		
		lblNewLabel = new JLabel("Hora:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(271, 115, 75, 14);
		contentPanel.add(lblNewLabel);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(325, 114, 115, 20);
		contentPanel.add(txtHora);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 172, 624, 228);
		contentPanel.add(scrollPane);
		
		tblMatricula = new JTable();
		tblMatricula.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0 MATR\u00CDCULA", "COD. ALUMNO", "COD. CURSO", "FECHA", "HORA"
			}
		));
		scrollPane.setViewportView(tblMatricula);
	}

}
