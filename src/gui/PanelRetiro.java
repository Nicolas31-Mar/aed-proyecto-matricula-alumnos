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

public class PanelRetiro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTituloRetiro;
	private JLabel lblNumRetiro;
	private JTextField txtNumRetiro;
	private JLabel lblNumMatricula;
	private JTextField txtNumMatricula;
	private JLabel lblFecha;
	private JTextField txtFecha;
	private JLabel lblHora;
	private JTextField txtHora;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JScrollPane scrollRetiros;
	private JTable tblRetiros;

	/**
	 * Create the panel.
	 */
	public PanelRetiro() {
		setBackground(new Color(245, 247, 250));
		setPreferredSize(new Dimension(650, 530));
		setLayout(null);
		
		lblTituloRetiro = new JLabel("Retiros");
		lblTituloRetiro.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloRetiro.setForeground(new Color(32, 47, 70));
		lblTituloRetiro.setBounds(30, 30, 450, 40);
		add(lblTituloRetiro);
		
		lblNumRetiro = new JLabel("Número de retiro");
		lblNumRetiro.setBounds(30, 100, 125, 25);
		add(lblNumRetiro);
		
		txtNumRetiro = new JTextField();
		txtNumRetiro.setBounds(155, 98, 140, 28);
		add(txtNumRetiro);
		txtNumRetiro.setColumns(10);
		
		lblNumMatricula = new JLabel("N.º de matrícula");
		lblNumMatricula.setBounds(325, 100, 125, 25);
		add(lblNumMatricula);
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setBounds(455, 98, 160, 28);
		add(txtNumMatricula);
		txtNumMatricula.setColumns(10);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(30, 150, 125, 25);
		add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(155, 148, 140, 28);
		add(txtFecha);
		txtFecha.setColumns(10);
		
		lblHora = new JLabel("Hora");
		lblHora.setBounds(325, 150, 125, 25);
		add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setBounds(455, 148, 160, 28);
		add(txtHora);
		txtHora.setColumns(10);
		
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
		
		scrollRetiros = new JScrollPane();
		scrollRetiros.setBounds(30, 315, 585, 190);
		add(scrollRetiros);
		
		tblRetiros = new JTable();
		tblRetiros.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N.\u00BA retiro", "N.\u00BA matr\u00EDcula", "Fecha", "Hora"
			}
		));
		scrollRetiros.setViewportView(tblRetiros);
	}

}
