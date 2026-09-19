package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class DlgCurso extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtAsignatura;
	private JTextField txtCodigo;
	private JTextField txtHoras;
	private JComboBox cboGrado;
	private JLabel lblNewLabel_4;
	private JComboBox cboNivel;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTable tblCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCurso dialog = new DlgCurso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCurso() {
		setTitle("Mantenimiento | Curso");
		setBounds(100, 100, 660, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Código:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 10, 75, 14);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Asignatura:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 45, 86, 14);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Grado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 80, 75, 14);
		contentPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Horas:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 115, 75, 14);
		contentPanel.add(lblNewLabel_3);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(106, 45, 380, 20);
		contentPanel.add(txtAsignatura);
		txtAsignatura.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(106, 10, 100, 20);
		contentPanel.add(txtCodigo);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(106, 115, 100, 20);
		contentPanel.add(txtHoras);
		
		cboGrado = new JComboBox();
		cboGrado.setModel(new DefaultComboBoxModel(new String[] {"1° Grado", "2° Grado", "3° Grado", "4° Grado", "5° Grado"}));
		cboGrado.setBounds(106, 80, 140, 22);
		contentPanel.add(cboGrado);
		
		lblNewLabel_4 = new JLabel("Nivel:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(281, 80, 55, 14);
		contentPanel.add(lblNewLabel_4);
		
		cboNivel = new JComboBox();
		cboNivel.setModel(new DefaultComboBoxModel(new String[] {"0 - Primaria", "1 - Secundaria"}));
		cboNivel.setBounds(346, 80, 140, 22);
		contentPanel.add(cboNivel);
		
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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 182, 624, 218);
		contentPanel.add(scrollPane);
		
		tblCurso = new JTable();
		tblCurso.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00D3DIGO", "ASIGNATURA", "GRADO", "NIVEL", "HORAS"
			}
		));
		scrollPane.setViewportView(tblCurso);
	}
}
