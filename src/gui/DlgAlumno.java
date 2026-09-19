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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DlgAlumno extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCod;
	private JTextField txtCod;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private JTextField txtEdad;
	private JComboBox cboEstado;
	private JLabel lblCelular;
	private JTextField txtCel;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgAlumno dialog = new DlgAlumno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgAlumno() {
		setTitle("Mantenimiento | Alumno");
		setBounds(100, 100, 660, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCod = new JLabel("Código:");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCod.setBounds(26, 10, 60, 19);
		contentPanel.add(lblCod);
		{
			JLabel lblNombre = new JLabel("Nombres:");
			lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNombre.setBounds(11, 40, 75, 19);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblApellidos.setBounds(10, 70, 75, 19);
			contentPanel.add(lblApellidos);
		}
		{
			JLabel lblDni = new JLabel("DNI:");
			lblDni.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblDni.setBounds(49, 100, 42, 19);
			contentPanel.add(lblDni);
		}
		{
			JLabel lblEdad = new JLabel("Edad:");
			lblEdad.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblEdad.setBounds(43, 130, 48, 19);
			contentPanel.add(lblEdad);
		}
		{
			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblEstado.setBounds(30, 160, 59, 19);
			contentPanel.add(lblEstado);
		}
		
		txtCod = new JTextField();
		txtCod.setBounds(105, 10, 100, 20);
		contentPanel.add(txtCod);
		txtCod.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(105, 40, 320, 20);
		contentPanel.add(txtNombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(105, 70, 320, 20);
		contentPanel.add(txtApellidos);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(105, 100, 100, 20);
		contentPanel.add(txtDni);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(105, 130, 60, 20);
		contentPanel.add(txtEdad);
		
		cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"0 - Registrado", "1 - Matriculado", "2 - Retirado"}));
		cboEstado.setBounds(105, 160, 100, 22);
		contentPanel.add(cboEstado);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCelular.setBounds(190, 130, 68, 19);
		contentPanel.add(lblCelular);
		
		txtCel = new JTextField();
		txtCel.setColumns(10);
		txtCel.setBounds(268, 131, 157, 20);
		contentPanel.add(txtCel);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdicionar.setBounds(498, 36, 100, 25);
		contentPanel.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultar.setBounds(498, 66, 100, 25);
		contentPanel.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnModificar.setBounds(498, 96, 100, 25);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEliminar.setBounds(498, 126, 100, 25);
		contentPanel.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 207, 623, 193);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00D3DIGO", "NOMBRES", "APELLIDOS", "DNI", "EDAD", "CELULAR", "ESTADO"
			}
		));
		scrollPane.setViewportView(table);
	}
}
