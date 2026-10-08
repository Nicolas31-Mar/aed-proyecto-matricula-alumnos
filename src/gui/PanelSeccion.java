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
import clases.Seccion;

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
	private JLabel lblMensajeSeccion;

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
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarSeccion();
			}
		});
		btnAdicionar.setForeground(Color.WHITE);
		btnAdicionar.setBackground(new Color(52, 73, 102));
		btnAdicionar.setBounds(30, 252, 105, 34);
		add(btnAdicionar);
		btnAdicionar.setUI(new BasicButtonUI());
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consultarSeccion();
			}
		});
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(52, 73, 102));
		btnConsultar.setBounds(145, 252, 105, 34);
		add(btnConsultar);
		btnConsultar.setUI(new BasicButtonUI());
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarSeccion();
			}
		});
		btnModificar.setForeground(new Color(255, 255, 255));
		btnModificar.setBounds(260, 252, 105, 34);
		btnModificar.setBackground(new Color(52, 73, 102));
		add(btnModificar);
		btnModificar.setUI(new BasicButtonUI());
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarSeccion();
			}
		});
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBounds(375, 252, 105, 34);
		btnEliminar.setBackground(new Color(142, 53, 63));
		add(btnEliminar);
		btnEliminar.setUI(new BasicButtonUI());
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				lblMensajeSeccion.setText("");
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
		
		lblMensajeSeccion = new JLabel("");
		lblMensajeSeccion.setForeground(new Color(95, 105, 115));
		lblMensajeSeccion.setBounds(30, 290, 585, 18);
		add(lblMensajeSeccion);
	}
	
	public void setArregloSeccion(ArregloSeccion as) {
		this.as = as;
		actualizarTabla();
	}
	
	private void adicionarSeccion() {
		try {
			int codSeccion = Integer.parseInt(txtCodSeccion.getText().trim());
			int codCurso = Integer.parseInt(txtCodCurso.getText().trim());
			int codDocente = Integer.parseInt(txtCodDocente.getText().trim());
			String aula = txtAula.getText().trim();
			String horario = txtHorario.getText().trim();
			
			if(codSeccion <= 0 || codCurso <= 0 || codDocente <= 0 || aula.isEmpty()
					|| horario.isEmpty()) {
				lblMensajeSeccion.setText("Complete los datos con códigos mayores que cero.");
				return;
			}
			
			Seccion nueva = new Seccion(codSeccion, codCurso, codDocente, aula, horario);
			
			if (as.adicionar(nueva)) {
				DefaultTableModel modelo = (DefaultTableModel) tblSecciones.getModel();
			    modelo.addRow(new Object[] {
			        codSeccion, codCurso, codDocente, aula, horario
			    });
			    lblMensajeSeccion.setText("Sección agregada.");
			} else {
				lblMensajeSeccion.setText("Ya existe una sección con ese código.");
			}
			
		} catch (NumberFormatException ex) {
			lblMensajeSeccion.setText("Los códigos deben ser números.");
		}
	}	
	
	private void consultarSeccion() {
		try {
			int codigo = Integer.parseInt(txtCodSeccion.getText().trim());
			Seccion encontrada = as.buscar(codigo);
			
			if(encontrada == null) {
				lblMensajeSeccion.setText("No existe una sección con ese código.");
				return;
			}
			
			txtCodCurso.setText(String.valueOf(encontrada.getCodCurso()));
			txtCodDocente.setText(String.valueOf(encontrada.getCodDocente()));
			txtAula.setText(encontrada.getAula());
			txtHorario.setText(encontrada.getHorario());
			lblMensajeSeccion.setText("Sección encontrada.");
			
		} catch (NumberFormatException ex) {
			lblMensajeSeccion.setText("Ingresa un código de sección numérico.");
		}
	}
	
	private void modificarSeccion() {
		try {
			int codSeccion = Integer.parseInt(txtCodSeccion.getText().trim());
			int codCurso = Integer.parseInt(txtCodCurso.getText().trim());
	        int codDocente = Integer.parseInt(txtCodDocente.getText().trim());
	        String aula = txtAula.getText().trim();
	        String horario = txtHorario.getText().trim();
	        
	        if(codSeccion <= 0 || codCurso <= 0 || codDocente <= 0
	                || aula.isEmpty() || horario.isEmpty()) {
	        	lblMensajeSeccion.setText("Complete los datos con códigos mayores que cero.");
	        	return;
	        }
	        
	        Seccion cambios = new Seccion(codSeccion, codCurso, codDocente, aula, horario);
	        
	        if(as.modificar(cambios)) {
	        	actualizarTabla();
	        	lblMensajeSeccion.setText("Sección modificada.");
	        } else {
	        	lblMensajeSeccion.setText("No existe una sección con ese código.");
	        }
	        
		} catch (NumberFormatException ex) {
			lblMensajeSeccion.setText("Los códigos deben ser números.");
		}
	}
	
	private void eliminarSeccion() {
			try {
				int codigo = Integer.parseInt(txtCodSeccion.getText().trim());
				
				if(codigo <= 0) {
					lblMensajeSeccion.setText("Ingresa un código de sección mayor que cero.");
					return;
				}
				
				if(as.eliminar(codigo)) {
					actualizarTabla();
					limpiarCampos();
					lblMensajeSeccion.setText("Sección eliminada.");
				} else {
					lblMensajeSeccion.setText("No existe una sección con ese código.");
				}
				
			} catch (NumberFormatException ex) {
				lblMensajeSeccion.setText("Ingresa un código de sección numérico.");
			}
	}
	
	private void actualizarTabla() {
		DefaultTableModel modelo = (DefaultTableModel) tblSecciones.getModel();
		modelo.setRowCount(0);
		
		for(int i = 0; i < as.tamanio(); i++){
			Seccion seccion = as.obtener(i);
			modelo.addRow(new Object[] {
					seccion.getCodSeccion(),
					seccion.getCodCurso(),
		            seccion.getCodDocente(),
		            seccion.getAula(),
		            seccion.getHorario()
			});
		}
	}
	
	private void limpiarCampos() {
		txtCodSeccion.setText("");
	    txtCodCurso.setText("");
	    txtCodDocente.setText("");
	    txtAula.setText("");
	    txtHorario.setText("");
	}
}
