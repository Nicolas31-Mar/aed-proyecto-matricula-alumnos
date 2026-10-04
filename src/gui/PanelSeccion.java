package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import arreglos.ArregloSeccion;

public class PanelSeccion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTituloSeccion;
	private JLabel lblCodSeccion;
	private JLabel lblCodCurso;
	private JTextField txtCodSeccion;
	private JTextField txtCodCurso;
	private JLabel lblCodDocente;
	private JLabel lblAula;
	private JTextField txtCodDocente;
	private JTextField txtAula;
	private JLabel lblHorario;
	private JTextField txtHorario;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JScrollPane scrollSecciones;
	private JTable tblSecciones;
	private ArregloSeccion as;

	/**
	 * Create the panel.
	 */
	public PanelSeccion() {
		setBackground(new Color(245, 247, 250));
		setPreferredSize(new Dimension(650, 530));
		setLayout(null);
		
		lblTituloSeccion = new JLabel("Secciones");
		lblTituloSeccion.setForeground(new Color(32, 47, 70));
		lblTituloSeccion.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloSeccion.setBounds(30, 30, 450, 40);
		add(lblTituloSeccion);
		
		lblCodSeccion = new JLabel("Código de sección");
		lblCodSeccion.setBounds(30, 100, 125, 25);
		add(lblCodSeccion);
		
		lblCodCurso = new JLabel("Código de curso");
		lblCodCurso.setBounds(325, 100, 125, 25);
		add(lblCodCurso);
		
		txtCodSeccion = new JTextField();
		txtCodSeccion.setBounds(155, 98, 140, 28);
		add(txtCodSeccion);
		txtCodSeccion.setColumns(10);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setColumns(10);
		txtCodCurso.setBounds(455, 98, 160, 28);
		add(txtCodCurso);
		
		lblCodDocente = new JLabel("Código de docente");
		lblCodDocente.setBounds(30, 150, 125, 25);
		add(lblCodDocente);
		
		lblAula = new JLabel("Aula");
		lblAula.setBounds(325, 150, 125, 25);
		add(lblAula);
		
		txtCodDocente = new JTextField();
		txtCodDocente.setBounds(155, 148, 140, 28);
		add(txtCodDocente);
		txtCodDocente.setColumns(10);
		
		txtAula = new JTextField();
		txtAula.setColumns(10);
		txtAula.setBounds(455, 148, 160, 28);
		add(txtAula);
		
		lblHorario = new JLabel("Horario");
		lblHorario.setBounds(30, 200, 125, 25);
		add(lblHorario);
		
		txtHorario = new JTextField();
		txtHorario.setBounds(155, 198, 460, 28);
		add(txtHorario);
		txtHorario.setColumns(10);
		
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
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHorario.setText("");
				txtCodSeccion.setText("");
				txtCodDocente.setText("");
				txtCodCurso.setText("");
				txtAula.setText("");
			}
		});
		btnLimpiar.setForeground(new Color(255, 255, 255));
		btnLimpiar.setBounds(490, 252, 105, 34);
		btnLimpiar.setBackground(new Color(95, 105, 115));
		add(btnLimpiar);
		btnLimpiar.setUI(new BasicButtonUI());
		
		scrollSecciones = new JScrollPane();
		scrollSecciones.setBounds(30, 315, 585, 190);
		add(scrollSecciones);
		
		tblSecciones = new JTable();
		tblSecciones.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3d. secci\u00F3n", "C\u00F3d. curso", "C\u00F3d. docente", "Aula", "Horario"
			}
		));
		scrollSecciones.setViewportView(tblSecciones);
	}
	
	public void setArregloSeccion(ArregloSeccion as) {
		this.as = as;
	}

}
