package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenu mnArchivo;
	private JMenu mnReporte;
	private JMenu mnConsulta;
	private JMenu mnMantenimiento;
	private JMenu mnRegistro;
	private JMenuItem mntmGenReportes;
	private JMenuItem mntmSalir;
	private JMenuItem mntmAlumno;
	private JMenuItem mntmCurso;
	private JMenuItem mntmMatricula;
	private JMenuItem mntmRetiro;
	private JMenuItem mntmConsultaAlumnosCursos;
	private JMenuItem mntmConsultaMatriculasRetiros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setTitle("Sistema de Registro y Matrícula - Colegio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 562, 22);
		contentPane.add(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmAlumno = new JMenuItem("Alumno");
		mntmAlumno.addActionListener(this);
		mnMantenimiento.add(mntmAlumno);
		
		mntmCurso = new JMenuItem("Curso");
		mntmCurso.addActionListener(this);
		mnMantenimiento.add(mntmCurso);
		
		mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		mntmMatricula = new JMenuItem("Matrícula");
		mntmMatricula.addActionListener(this);
		mnRegistro.add(mntmMatricula);
		
		mntmRetiro = new JMenuItem("Retiro");
		mntmRetiro.addActionListener(this);
		mnRegistro.add(mntmRetiro);
		
		mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		mntmConsultaAlumnosCursos = new JMenuItem("Alumnos y Cursos");
		mntmConsultaAlumnosCursos.addActionListener(this);
		mnConsulta.add(mntmConsultaAlumnosCursos);
		
		mntmConsultaMatriculasRetiros = new JMenuItem("Matrículas y Retiros");
		mntmConsultaMatriculasRetiros.addActionListener(this);
		mnConsulta.add(mntmConsultaMatriculasRetiros);
		
		mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		mntmGenReportes = new JMenuItem("Generar Reportes");
		mntmGenReportes.addActionListener(this);
		mnReporte.add(mntmGenReportes);

	}
	
	//metodo que escucha todos los clicks
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mntmSalir) {
        	actionPerformedMntmSalir(e);
        }
        if (e.getSource() == mntmAlumno) {
        	actionPerformedMntmAlumno(e);
        }
        if (e.getSource() == mntmCurso) {
            actionPerformedMntmCurso(e);
        }
        if (e.getSource() == mntmMatricula) {
        	actionPerformedmntmMatricula(e);
        }
        if (e.getSource() == mntmRetiro) {
        	actionPerformedMntmRetiro(e);
        }
        if (e.getSource() == mntmConsultaAlumnosCursos) {
        	actionPerformedMntmConsultaAlumnosCursos(e);
        }
        if (e.getSource() == mntmConsultaMatriculasRetiros) {
        	actionPerformedMntmConsultaMatriculasRetiros(e);
        }
        if (e.getSource() == mntmGenReportes) {
        	actionPerformedMntmGenReportes(e);
        }
    }
	
	protected void actionPerformedMntmSalir(ActionEvent e) {
        int rpta = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea salir del sistema?",
                "Confirmación de Salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rpta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
	
	protected void actionPerformedMntmAlumno(ActionEvent e) {
        DlgAlumno dlg = new DlgAlumno();
        dlg.setLocationRelativeTo(this); // Centra la ventana sobre el menú
        dlg.setVisible(true);            // Abre la ventana de alumno
    }
	
	protected void actionPerformedMntmCurso(ActionEvent e) {
		DlgCurso dlg = new DlgCurso();
		dlg.setLocationRelativeTo(this);
		dlg.setVisible(true);
	}
	
	protected void actionPerformedmntmMatricula(ActionEvent e) {
		DlgMatricula dlg = new DlgMatricula();
		dlg.setLocationRelativeTo(this);
		dlg.setVisible(true);
	}

	protected void actionPerformedMntmRetiro(ActionEvent e) {
		DlgRetiro dlg = new DlgRetiro();
		dlg.setLocationRelativeTo(this);
		dlg.setVisible(true);
	}

	protected void actionPerformedMntmConsultaAlumnosCursos(ActionEvent e) {
		DlgConsultaAlumnosCursos dlg = new DlgConsultaAlumnosCursos();
		dlg.setLocationRelativeTo(this);
		dlg.setVisible(true);
	}

	protected void actionPerformedMntmConsultaMatriculasRetiros(ActionEvent e) {
		DlgConsultaMatriculasRetiros dlg = new DlgConsultaMatriculasRetiros();
		dlg.setLocationRelativeTo(this);
		dlg.setVisible(true);
	}

	protected void actionPerformedMntmGenReportes(ActionEvent e) {
		DlgReportes dlg = new DlgReportes();
		dlg.setLocationRelativeTo(this);
		dlg.setVisible(true);
	}
}
