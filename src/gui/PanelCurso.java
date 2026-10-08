
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloCurso;
import clases.Curso;

public class PanelCurso extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lblTituloCurso;
	private JLabel lblCodCurso;
	private JTextField txtCodCurso;
	private JLabel lblAsignatura;
	private JTextField txtAsignatura;
	private JLabel lblGrado;
	private JTextField txtGrado;
	private JLabel lblHoras;
	private JTextField txtHoras;
	private JLabel lblNivel;
	private JTextField txtNivel;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JScrollPane scrollCursos;
	private JTable tblCursos;

	private ArregloCurso ac;
	private DefaultTableModel modelo;

	/**
	 * Create the panel.
	 */
	public PanelCurso() {

		ac = new ArregloCurso();

		setBackground(new Color(245, 247, 250));
		setPreferredSize(new Dimension(650, 530));
		setLayout(null);

		lblTituloCurso = new JLabel("Cursos");
		lblTituloCurso.setForeground(new Color(32, 47, 70));
		lblTituloCurso.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTituloCurso.setBounds(30, 30, 450, 40);
		add(lblTituloCurso);

		lblCodCurso = new JLabel("Código de curso");
		lblCodCurso.setBounds(30, 100, 125, 25);
		add(lblCodCurso);

		txtCodCurso = new JTextField();
		txtCodCurso.setBounds(155, 98, 140, 28);
		add(txtCodCurso);
		txtCodCurso.setColumns(10);

		lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setBounds(325, 100, 125, 25);
		add(lblAsignatura);

		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(455, 98, 160, 28);
		add(txtAsignatura);
		txtAsignatura.setColumns(10);

		lblGrado = new JLabel("Grado");
		lblGrado.setBounds(30, 150, 125, 25);
		add(lblGrado);

		txtGrado = new JTextField();
		txtGrado.setBounds(155, 148, 140, 28);
		add(txtGrado);
		txtGrado.setColumns(10);

		lblHoras = new JLabel("Horas");
		lblHoras.setBounds(325, 150, 125, 25);
		add(lblHoras);

		txtHoras = new JTextField();
		txtHoras.setBounds(455, 148, 160, 28);
		add(txtHoras);
		txtHoras.setColumns(10);

		lblNivel = new JLabel("Nivel");
		lblNivel.setBounds(30, 200, 125, 25);
		add(lblNivel);

		txtNivel = new JTextField();
		txtNivel.setBounds(155, 198, 140, 28);
		add(txtNivel);
		txtNivel.setColumns(10);

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

		scrollCursos = new JScrollPane();
		scrollCursos.setBounds(30, 315, 585, 190);
		add(scrollCursos);

		tblCursos = new JTable();
		tblCursos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3d. curso", "Asignatura", "Grado", "Horas", "Nivel"
			}
		));
		scrollCursos.setViewportView(tblCursos);

		modelo = (DefaultTableModel) tblCursos.getModel();

		btnAdicionar.addActionListener(e -> adicionar());
		btnConsultar.addActionListener(e -> consultar());
		btnModificar.addActionListener(e -> modificar());
		btnEliminar.addActionListener(e -> eliminar());
		btnLimpiar.addActionListener(e -> limpiar());

		listar();
	}

	private void adicionar() {
		try {
			Curso curso = leerDatos();

			if(ac.adicionar(curso)) {
				listar();
				limpiar();
				mensaje("Curso registrado correctamente.");
			} else {
				mensaje("Ya existe un curso con ese código.");
			}

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private void consultar() {
		try {
			int codigo = leerCodigo();
			Curso curso = ac.buscar(codigo);

			if(curso == null) {
				mensaje("No existe un curso con ese código.");
				return;
			}

			txtAsignatura.setText(curso.getAsignatura());
			txtGrado.setText(String.valueOf(curso.getGrado()));
			txtHoras.setText(String.valueOf(curso.getHoras()));
			txtNivel.setText(String.valueOf(curso.getNivel()));

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private void modificar() {
		try {
			Curso curso = leerDatos();

			if(ac.modificar(curso)) {
				listar();
				limpiar();
				mensaje("Curso modificado correctamente.");
			} else {
				mensaje("No existe un curso con ese código.");
			}

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private void eliminar() {
		try {
			int codigo = leerCodigo();

			if(ac.buscar(codigo) == null) {
				mensaje("No existe un curso con ese código.");
				return;
			}

			int respuesta = JOptionPane.showConfirmDialog(
				this,
				"¿Desea eliminar el curso?",
				"Confirmar eliminación",
				JOptionPane.YES_NO_OPTION
			);

			if(respuesta == JOptionPane.YES_OPTION) {
				ac.eliminar(codigo);
				listar();
				limpiar();
				mensaje("Curso eliminado correctamente.");
			}

		} catch(IllegalArgumentException ex) {
			mensaje(ex.getMessage());
		}
	}

	private int leerCodigo() {
		try {
			int codigo = Integer.parseInt(txtCodCurso.getText().trim());

			if(codigo <= 0) {
				throw new IllegalArgumentException(
					"El código debe ser mayor que cero.");
			}

			return codigo;

		} catch(NumberFormatException ex) {
			throw new IllegalArgumentException(
				"Ingrese un código de curso válido.");
		}
	}

	private Curso leerDatos() {
		int codigo = leerCodigo();

		String asignatura = txtAsignatura.getText().trim();
		String textoGrado = txtGrado.getText().trim();
		String textoHoras = txtHoras.getText().trim();
		String textoNivel = txtNivel.getText().trim();

		if(asignatura.isEmpty()) {
			throw new IllegalArgumentException(
				"Ingrese el nombre de la asignatura.");
		}

		int grado;
		int horas;
		int nivel;

		try {
			grado = Integer.parseInt(textoGrado);
			horas = Integer.parseInt(textoHoras);
			nivel = Integer.parseInt(textoNivel);
		} catch(NumberFormatException ex) {
			throw new IllegalArgumentException(
				"Ingrese valores numéricos válidos para grado, horas y nivel.");
		}

		if(grado <= 0) {
			throw new IllegalArgumentException(
				"El grado debe ser mayor que cero.");
		}

		if(horas <= 0) {
			throw new IllegalArgumentException(
				"Las horas deben ser mayores que cero.");
		}

		if(nivel < 0) {
			throw new IllegalArgumentException(
				"El nivel no puede ser negativo.");
		}

		return new Curso(codigo, grado, nivel, horas, asignatura);
	}

	private void listar() {
		modelo.setRowCount(0);

		for(int i = 0; i < ac.tamanio(); i++) {
			Curso curso = ac.obtener(i);

			modelo.addRow(new Object[] {
				curso.getCodCurso(),
				curso.getAsignatura(),
				curso.getGrado(),
				curso.getHoras(),
				curso.getNivel()
			});
		}
	}

	private void limpiar() {
		txtCodCurso.setText("");
		txtAsignatura.setText("");
		txtGrado.setText("");
		txtHoras.setText("");
		txtNivel.setText("");
		txtCodCurso.requestFocus();
	}

	private void mensaje(String texto) {
		JOptionPane.showMessageDialog(this, texto);
	}

}
