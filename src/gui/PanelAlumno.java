
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloAlumno;
import clases.Alumno;

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
	private JComboBox<String> cmbEstado;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JScrollPane scrollAlumnos;
	private JTable tblAlumnos;

	private ArregloAlumno aa;
	private DefaultTableModel modelo;

	public PanelAlumno() {

		aa = new ArregloAlumno();

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

		cmbEstado = new JComboBox<String>();
		cmbEstado.setModel(new DefaultComboBoxModel<String>(
				new String[] {"Registrado", "Matriculado", "Retirado"}));
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
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBounds(260, 280, 105, 34);
		btnModificar.setBackground(new Color(52, 73, 102));
		add(btnModificar);
		btnModificar.setUI(new BasicButtonUI());

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBounds(375, 280, 105, 34);
		btnEliminar.setBackground(new Color(142, 53, 63));
		add(btnEliminar);
		btnEliminar.setUI(new BasicButtonUI());

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setForeground(Color.WHITE);
		btnLimpiar.setBounds(490, 280, 105, 34);
		btnLimpiar.setBackground(new Color(95, 105, 115));
		add(btnLimpiar);
		btnLimpiar.setUI(new BasicButtonUI());

		scrollAlumnos = new JScrollPane();
		scrollAlumnos.setBounds(30, 340, 585, 165);
		add(scrollAlumnos);

		tblAlumnos = new JTable();
		modelo = new DefaultTableModel(
				new Object[][] {},
				new String[] {
					"Código", "Nombres", "Apellidos",
					"DNI", "Edad", "Celular", "Estado"
				}
		);

		tblAlumnos.setModel(modelo);
		scrollAlumnos.setViewportView(tblAlumnos);

		btnAdicionar.addActionListener(e -> adicionar());
		btnConsultar.addActionListener(e -> consultar());
		btnModificar.addActionListener(e -> modificar());
		btnEliminar.addActionListener(e -> eliminar());
		btnLimpiar.addActionListener(e -> limpiar());

		listar();
	}

	private void adicionar() {
		try {
			Alumno alumno = leerDatos();

			if(aa.adicionar(alumno)) {
				listar();
				limpiar();
				mensaje("Alumno registrado correctamente.");
			} else {
				mensaje("Ya existe un alumno con ese código.");
			}

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private void consultar() {
		try {
			int codigo = leerCodigo();
			Alumno alumno = aa.buscar(codigo);

			if(alumno == null) {
				mensaje("No existe un alumno con ese código.");
				return;
			}

			txtNombres.setText(alumno.getNombres());
			txtApellidos.setText(alumno.getApellidos());
			txtDni.setText(alumno.getDni());
			txtEdad.setText(String.valueOf(alumno.getEdad()));
			txtCelular.setText(String.valueOf(alumno.getCelular()));
			cmbEstado.setSelectedIndex(alumno.getEstado());

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private void modificar() {
		try {
			Alumno alumno = leerDatos();

			if(aa.modificar(alumno)) {
				listar();
				limpiar();
				mensaje("Alumno modificado correctamente.");
			} else {
				mensaje("No existe un alumno con ese código.");
			}

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private void eliminar() {
		try {
			int codigo = leerCodigo();

			if(aa.buscar(codigo) == null) {
				mensaje("No existe un alumno con ese código.");
				return;
			}

			int respuesta = JOptionPane.showConfirmDialog(
					this,
					"¿Desea eliminar al alumno?",
					"Confirmar eliminación",
					JOptionPane.YES_NO_OPTION
			);

			if(respuesta == JOptionPane.YES_OPTION) {
				aa.eliminar(codigo);
				listar();
				limpiar();
				mensaje("Alumno eliminado correctamente.");
			}

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private int leerCodigo() {
		try {
			int codigo = Integer.parseInt(txtCodAlumno.getText().trim());

			if(codigo <= 0) {
				throw new IllegalArgumentException(
						"El código debe ser mayor que cero.");
			}

			return codigo;

		} catch(NumberFormatException ex) {
			throw new IllegalArgumentException(
					"Ingrese un código de alumno válido.");
		}
	}

	private Alumno leerDatos() {
		int codigo = leerCodigo();

		String nombres = txtNombres.getText().trim();
		String apellidos = txtApellidos.getText().trim();
		String dni = txtDni.getText().trim();
		String textoEdad = txtEdad.getText().trim();
		String textoCelular = txtCelular.getText().trim();
		int estado = cmbEstado.getSelectedIndex();

		if(nombres.isEmpty() || apellidos.isEmpty()) {
			throw new IllegalArgumentException(
					"Complete los nombres y apellidos.");
		}

		if(!dni.matches("\\d{8}")) {
			throw new IllegalArgumentException(
					"El DNI debe tener 8 dígitos.");
		}

		if(!textoCelular.matches("9\\d{8}")) {
			throw new IllegalArgumentException(
					"El celular debe tener 9 dígitos y comenzar con 9.");
		}

		int edad;
		int celular;

		try {
			edad = Integer.parseInt(textoEdad);
			celular = Integer.parseInt(textoCelular);
		} catch(NumberFormatException ex) {
			throw new IllegalArgumentException(
					"Ingrese una edad y un celular válidos.");
		}

		if(edad <= 0 || edad > 120) {
			throw new IllegalArgumentException(
					"Ingrese una edad válida entre 1 y 120.");
		}

		return new Alumno(
				codigo, edad, celular, estado,
				nombres, apellidos, dni
		);
	}

	private void listar() {
		modelo.setRowCount(0);

		for(int i = 0; i < aa.tamanio(); i++) {
			Alumno alumno = aa.obtener(i);

			modelo.addRow(new Object[] {
				alumno.getCodAlumno(),
				alumno.getNombres(),
				alumno.getApellidos(),
				alumno.getDni(),
				alumno.getEdad(),
				alumno.getCelular(),
				cmbEstado.getItemAt(alumno.getEstado())
			});
		}
	}

	private void limpiar() {
		txtCodAlumno.setText("");
		txtNombres.setText("");
		txtApellidos.setText("");
		txtDni.setText("");
		txtEdad.setText("");
		txtCelular.setText("");
		cmbEstado.setSelectedIndex(0);
		txtCodAlumno.requestFocus();
	}

	private void mensaje(String texto) {
		JOptionPane.showMessageDialog(this, texto);
	}

}
