package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnlMenu;
	private JLabel lblTituloMenu;
	private JButton btnInicio;
	private JButton btnAlumnos;
	private JButton btnApoderados;
	private JButton btnCursos;
	private JButton btnDocentes;
	private JButton btnSecciones;
	private JButton btnMatriculas;
	private JButton btnRetiros;
	private JButton btnPagos;
	private JButton btnSalir;
	private JPanel pnlContenido;
	

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
		setTitle("Sistema de Gestión");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(32, 47, 70));
		contentPane.add(pnlMenu, BorderLayout.WEST);
		pnlMenu.setPreferredSize(new Dimension(170, 0));
		pnlMenu.setLayout(null);
		
		lblTituloMenu = new JLabel("Sistema escolar");
		lblTituloMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTituloMenu.setForeground(new Color(255, 255, 255));
		lblTituloMenu.setBounds(12, 18, 146, 30);
		pnlMenu.add(lblTituloMenu);
		
		btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout tarjetas = (CardLayout) pnlContenido.getLayout();
				tarjetas.show(pnlContenido, "Inicio");
			}
		});
		btnInicio.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.setBackground(new Color(52, 73, 102));
		btnInicio.setBounds(10, 65, 150, 35);
		pnlMenu.add(btnInicio);
		btnInicio.setUI(new BasicButtonUI());
		

		btnAlumnos = new JButton("Alumnos");
		btnAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout tarjetas = (CardLayout) pnlContenido.getLayout();
				tarjetas.show(pnlContenido, "Alumnos");
			}
		});
		btnAlumnos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAlumnos.setForeground(new Color(255, 255, 255));
		btnAlumnos.setBackground(new Color(52, 73, 102));
		btnAlumnos.setBounds(10, 107, 150, 35);
		pnlMenu.add(btnAlumnos);
		btnAlumnos.setUI(new BasicButtonUI());
		
		btnApoderados = new JButton("Apoderados");
		btnApoderados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout tarjetas = (CardLayout) pnlContenido.getLayout();
				tarjetas.show(pnlContenido, "Apoderados");
			}
		});
		btnApoderados.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnApoderados.setForeground(new Color(255, 255, 255));
		btnApoderados.setBackground(new Color(52, 73, 102));
		btnApoderados.setBounds(10, 149, 150, 35);
		pnlMenu.add(btnApoderados);
		btnApoderados.setUI(new BasicButtonUI());
		
		btnCursos = new JButton("Cursos");
		btnCursos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCursos.setForeground(new Color(255, 255, 255));
		btnCursos.setBackground(new Color(52, 73, 102));
		btnCursos.setBounds(10, 191, 150, 35);
		pnlMenu.add(btnCursos);
		btnCursos.setUI(new BasicButtonUI());
		
		btnDocentes = new JButton("Docentes");
		btnDocentes.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDocentes.setForeground(new Color(255, 255, 255));
		btnDocentes.setBackground(new Color(52, 73, 102));
		btnDocentes.setBounds(10, 233, 150, 35);
		pnlMenu.add(btnDocentes);
		btnDocentes.setUI(new BasicButtonUI());
		
		btnSecciones = new JButton("Secciones");
		btnSecciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout tarjetas = (CardLayout) pnlContenido.getLayout();
				tarjetas.show(pnlContenido, "Seccion");
			}
		});
		btnSecciones.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSecciones.setForeground(new Color(255, 255, 255));
		btnSecciones.setBackground(new Color(52, 73, 102));
		btnSecciones.setBounds(10, 275, 150, 35);
		pnlMenu.add(btnSecciones);
		btnSecciones.setUI(new BasicButtonUI());
		
		btnMatriculas = new JButton("Matrículas");
		btnMatriculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout tarjetas = (CardLayout) pnlContenido.getLayout();
				tarjetas.show(pnlContenido, "Matriculas");
			}
		});
		btnMatriculas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMatriculas.setForeground(new Color(255, 255, 255));
		btnMatriculas.setBackground(new Color(52, 73, 102));
		btnMatriculas.setBounds(10, 317, 150, 35);
		pnlMenu.add(btnMatriculas);
		btnMatriculas.setUI(new BasicButtonUI());
		
		btnRetiros = new JButton("Retiros");
		btnRetiros.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRetiros.setForeground(new Color(255, 255, 255));
		btnRetiros.setBackground(new Color(52, 73, 102));
		btnRetiros.setBounds(10, 359, 150, 35);
		pnlMenu.add(btnRetiros);
		btnRetiros.setUI(new BasicButtonUI());
		
		btnPagos = new JButton("Pagos");
		btnPagos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPagos.setForeground(new Color(255, 255, 255));
		btnPagos.setBackground(new Color(52, 73, 102));
		btnPagos.setBounds(10, 401, 150, 35);
		pnlMenu.add(btnPagos);
		btnPagos.setUI(new BasicButtonUI());
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(142, 53, 63));
		btnSalir.setBounds(10, 478, 150, 35);
		pnlMenu.add(btnSalir);
		btnSalir.setUI(new BasicButtonUI());
		
		pnlContenido = new JPanel();
		contentPane.add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(new CardLayout(0, 0));
		pnlContenido.add(new PanelInicio(), "Inicio");
		pnlContenido.add(new PanelMatricula(), "Matriculas");
		pnlContenido.add(new PanelSeccion(), "Seccion");
		pnlContenido.add(new PanelAlumno(), "Alumnos");
		pnlContenido.add(new PanelApoderado(), "Apoderados");
	}
}
