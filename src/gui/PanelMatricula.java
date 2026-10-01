package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class PanelMatricula extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTituloMatricula;
	private JLabel lblNumMatricula;
	private JTextField txtNumMatricula;
	private JLabel lblCodAlumno;
	private JTextField txtCodAlumno;
	private JLabel lblCodSeccion;
	private JTextField txtCodSeccion;
	private JLabel lblFecha;
	private JTextField txtFecha;
	private JLabel lblHora;
	private JTextField txtHora;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JScrollPane scrollMatriculas;
	private JTable tblMatriculas;

	/**
	 * Create the panel.
	 */
	public PanelMatricula() {
		setBackground(new Color(245, 247, 250));
		setLayout(null);
		setPreferredSize(new Dimension(650, 530));
		
		lblTituloMatricula = new JLabel("Matrículas");
		lblTituloMatricula.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloMatricula.setForeground(new Color(32, 47, 70));
		lblTituloMatricula.setBounds(30, 30, 450, 40);
		add(lblTituloMatricula);
		
		lblNumMatricula = new JLabel("Número de matrícula");
		lblNumMatricula.setBounds(30, 100, 125, 25);
		add(lblNumMatricula);
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setBounds(155, 98, 140, 28);
		add(txtNumMatricula);
		txtNumMatricula.setColumns(10);
		
		lblCodAlumno = new JLabel("Código de alumno");
		lblCodAlumno.setBounds(325, 100, 125, 25);
		add(lblCodAlumno);
		
		txtCodAlumno = new JTextField();
		txtCodAlumno.setBounds(455, 98, 160, 28);
		add(txtCodAlumno);
		txtCodAlumno.setColumns(10);
		
		lblCodSeccion = new JLabel("Código de sección");
		lblCodSeccion.setBounds(30, 150, 125, 25);
		add(lblCodSeccion);
		
		txtCodSeccion = new JTextField();
		txtCodSeccion.setBounds(155, 148, 140, 28);
		add(txtCodSeccion);
		txtCodSeccion.setColumns(10);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(325, 150, 125, 25);
		add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(455, 148, 160, 28);
		add(txtFecha);
		txtFecha.setColumns(10);
		
		lblHora = new JLabel("Hora");
		lblHora.setBounds(30, 200, 125, 25);
		add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setBounds(155, 198, 140, 28);
		add(txtHora);
		txtHora.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setForeground(new Color(255, 255, 255));
		btnAdicionar.setBackground(new Color(52, 73, 102));
		btnAdicionar.setBounds(30, 252, 105, 34);
		add(btnAdicionar);
		btnAdicionar.setUI(new BasicButtonUI());
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(new Color(255, 255, 255));
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
		
		scrollMatriculas = new JScrollPane();
		scrollMatriculas.setBounds(30, 315, 585, 190);
		add(scrollMatriculas);
		
		tblMatriculas = new JTable();
		tblMatriculas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N.\u00BA matr\u00EDcula", "C\u00F3d. alumno", "C\u00F3d. secci\u00F3n", "Fecha", "Hora"
			}
		));
		scrollMatriculas.setViewportView(tblMatriculas);

	}
}
