package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelApoderado extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTituloApoderado;
	private JLabel lblCodApoderado;
	private JTextField txtCodApoderado;
	private JLabel lblNombres;
	private JTextField txtNombres;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JLabel lblDni;
	private JTextField txtDni;
	private JLabel lblCelular;
	private JTextField txtCelular;
	private JLabel lblCodAlumno;
	private JTextField txtCodAlumno;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JScrollPane scrollApoderados;
	private JTable tblApoderados;

	/**
	 * Create the panel.
	 */
	public PanelApoderado() {
		setBackground(new Color(245, 247, 250));
		setPreferredSize(new Dimension(650, 530));
		setLayout(null);
		
		lblTituloApoderado = new JLabel("Apoderados");
		lblTituloApoderado.setForeground(new Color(32, 47, 70));
		lblTituloApoderado.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloApoderado.setBounds(30, 30, 450, 40);
		add(lblTituloApoderado);
		
		lblCodApoderado = new JLabel("Código");
		lblCodApoderado.setBounds(30, 100, 125, 25);
		add(lblCodApoderado);
		
		txtCodApoderado = new JTextField();
		txtCodApoderado.setBounds(155, 98, 140, 28);
		add(txtCodApoderado);
		txtCodApoderado.setColumns(10);
		
		lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(325, 100, 125, 25);
		add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(455, 98, 160, 28);
		add(txtNombres);
		txtNombres.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(30, 150, 125, 25);
		add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(155, 148, 140, 28);
		add(txtApellidos);
		txtApellidos.setColumns(10);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(325, 150, 125, 25);
		add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(455, 148, 160, 28);
		add(txtDni);
		txtDni.setColumns(10);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(30, 200, 125, 25);
		add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(155, 198, 140, 28);
		add(txtCelular);
		txtCelular.setColumns(10);
		
		lblCodAlumno = new JLabel("Código de alumno");
		lblCodAlumno.setBounds(325, 200, 125, 25);
		add(lblCodAlumno);
		
		txtCodAlumno = new JTextField();
		txtCodAlumno.setBounds(455, 198, 160, 28);
		add(txtCodAlumno);
		txtCodAlumno.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(new Color(52, 73, 102));
		btnAdicionar.setBounds(30, 252, 105, 34);
		add(btnAdicionar);
		btnAdicionar.setUI(new BasicButtonUI());
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(52, 73, 102));
		btnConsultar.setBounds(145, 252, 105, 34);
		add(btnConsultar);
		btnConsultar.setUI(new BasicButtonUI());
		
		btnModificar = new JButton("Modificar");
		btnModificar.setForeground(new Color(255, 255, 255));
		btnModificar.setBounds(260, 252, 105, 34);
		btnModificar.setBackground(new Color(52, 73, 102));
		add(btnModificar);
		btnModificar.setUI(new BasicButtonUI());
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBounds(375, 252, 105, 34);
		btnEliminar.setBackground(new Color(142, 53, 63));
		add(btnEliminar);
		btnEliminar.setUI(new BasicButtonUI());
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(new Color(255, 255, 255));
		btnLimpiar.setBounds(490, 252, 105, 34);
		btnLimpiar.setBackground(new Color(95, 105, 115));
		add(btnLimpiar);
		btnLimpiar.setUI(new BasicButtonUI());
		
		scrollApoderados = new JScrollPane();
		scrollApoderados.setBounds(30, 315, 585, 190);
		add(scrollApoderados);
		
		tblApoderados = new JTable();
		tblApoderados.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nombres", "Apellidos", "DNI", "Celular", "C\u00F3d. alumno"
			}
		));
		scrollApoderados.setViewportView(tblApoderados);
	}

}
