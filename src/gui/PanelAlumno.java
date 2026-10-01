package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelAlumno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTituloAlumno;
	private JLabel lblCodAlumno;
	private JTextField txtCodAlumno;
	private JLabel lblNombres;
	private JTextField txtNombres;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JLabel lblDni;
	private JTextField txtDni;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JLabel lblCelular;
	private JTextField txtCelular;
	private JLabel lblEstado;
	private JComboBox cmbEstado;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JScrollPane scrollAlumnos;
	private JTable tblAlumnos;

	/**
	 * Create the panel.
	 */
	public PanelAlumno() {
		setBackground(new Color(245, 247, 250));
		setPreferredSize(new Dimension(650, 530));
		setLayout(null);
		
		lblTituloAlumno = new JLabel("Alumnos");
		lblTituloAlumno.setForeground(new Color(32, 47, 70));
		lblTituloAlumno.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloAlumno.setBounds(30, 30, 450, 40);
		add(lblTituloAlumno);
		
		lblCodAlumno = new JLabel("Código de alumno");
		lblCodAlumno.setBounds(30, 95, 125, 25);
		add(lblCodAlumno);
		
		txtCodAlumno = new JTextField();
		txtCodAlumno.setBounds(155, 93, 140, 28);
		add(txtCodAlumno);
		txtCodAlumno.setColumns(10);
		
		lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(325, 95, 125, 25);
		add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(455, 93, 160, 28);
		add(txtNombres);
		txtNombres.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(30, 140, 125, 25);
		add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(155, 138, 140, 28);
		add(txtApellidos);
		txtApellidos.setColumns(10);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(325, 140, 125, 25);
		add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(455, 138, 160, 28);
		add(txtDni);
		txtDni.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(30, 185, 125, 25);
		add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(155, 183, 140, 28);
		add(txtEdad);
		txtEdad.setColumns(10);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(325, 185, 125, 25);
		add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(455, 183, 160, 28);
		add(txtCelular);
		txtCelular.setColumns(10);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(30, 230, 125, 25);
		add(lblEstado);
		
		cmbEstado = new JComboBox();
		cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"Registrado", "Matriculado", "Retirado"}));
		cmbEstado.setBounds(155, 228, 140, 28);
		add(cmbEstado);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(new Color(52, 73, 102));
		btnAdicionar.setBounds(30, 280, 105, 34);
		add(btnAdicionar);
		btnAdicionar.setUI(new BasicButtonUI());
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(52, 73, 102));
		btnConsultar.setBounds(145, 280, 105, 34);
		add(btnConsultar);
		btnConsultar.setUI(new BasicButtonUI());
		
		btnModificar = new JButton("Modificar");
		btnModificar.setForeground(new Color(255, 255, 255));
		btnModificar.setBounds(260, 280, 105, 34);
		btnModificar.setBackground(new Color(52, 73, 102));
		add(btnModificar);
		btnModificar.setUI(new BasicButtonUI());
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBounds(375, 280, 105, 34);
		btnEliminar.setBackground(new Color(142, 53, 63));
		add(btnEliminar);
		btnEliminar.setUI(new BasicButtonUI());
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(new Color(255, 255, 255));
		btnLimpiar.setBounds(490, 280, 105, 34);
		btnLimpiar.setBackground(new Color(95, 105, 115));
		add(btnLimpiar);
		btnLimpiar.setUI(new BasicButtonUI());
		
		scrollAlumnos = new JScrollPane();
		scrollAlumnos.setBounds(30, 340, 585, 165);
		add(scrollAlumnos);
		
		tblAlumnos = new JTable();
		tblAlumnos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nombres", "Apellidos", "DNI", "Edad", "Celular", "Estado"
			}
		));
		scrollAlumnos.setViewportView(tblAlumnos);
	}
}
