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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DlgConsultaAlumnosCursos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JRadioButton rdbtnPorAlumno;
	private JRadioButton rdbtnPorCurso;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnConsultar;
	private JScrollPane scrollPane;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConsultaAlumnosCursos dialog = new DlgConsultaAlumnosCursos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConsultaAlumnosCursos() {
		setTitle("Consulta | Alumnos y Cursos");
		setBounds(100, 100, 660, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCodigo = new JLabel("Código:");
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCodigo.setBounds(10, 15, 75, 20);
		contentPanel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(85, 15, 150, 22);
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		rdbtnPorAlumno = new JRadioButton("Por Alumno");
		buttonGroup.add(rdbtnPorAlumno);
		rdbtnPorAlumno.setSelected(true);
		rdbtnPorAlumno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPorAlumno.setBounds(250, 15, 100, 23);
		contentPanel.add(rdbtnPorAlumno);
		
		rdbtnPorCurso = new JRadioButton("Por Curso");
		buttonGroup.add(rdbtnPorCurso);
		rdbtnPorCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPorCurso.setBounds(355, 15, 100, 23);
		contentPanel.add(rdbtnPorCurso);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setBounds(514, 13, 120, 25);
		contentPanel.add(btnConsultar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 624, 345);
		contentPanel.add(scrollPane);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtResultado.setEditable(false);
		scrollPane.setViewportView(txtResultado);
	}

}
