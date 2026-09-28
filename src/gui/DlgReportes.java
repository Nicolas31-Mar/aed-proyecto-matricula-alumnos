package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DlgReportes extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipoReporte;
	private JComboBox<String> cboTipoReporte;
	private JButton btnGenerarReporte;
	private JButton btnLimpiar;
	private JScrollPane scrollPane;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReportes dialog = new DlgReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgReportes() {
		setTitle("Reportes del Sistema");
		setBounds(100, 100, 660, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTipoReporte = new JLabel("Tipo de Reporte:");
		lblTipoReporte.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoReporte.setBounds(10, 15, 135, 20);
		contentPanel.add(lblTipoReporte);
		
		cboTipoReporte = new JComboBox<String>();
		cboTipoReporte.setModel(new DefaultComboBoxModel<String>(new String[] {
			"Alumnos con matr\u00EDcula pendiente",
			"Alumnos con matr\u00EDcula vigente",
			"Alumnos matriculados por curso"
		}));
		cboTipoReporte.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cboTipoReporte.setBounds(145, 15, 260, 24);
		contentPanel.add(cboTipoReporte);
		
		btnGenerarReporte = new JButton("Generar Reporte");
		btnGenerarReporte.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGenerarReporte.setBounds(415, 14, 135, 25);
		contentPanel.add(btnGenerarReporte);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpiar.setBounds(555, 14, 80, 25);
		contentPanel.add(btnLimpiar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 624, 345);
		contentPanel.add(scrollPane);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtResultado.setEditable(false);
		scrollPane.setViewportView(txtResultado);
	}

	public void setReporteSeleccionado(int index) {
		if (index >= 0 && index < cboTipoReporte.getItemCount()) {
			cboTipoReporte.setSelectedIndex(index);
		}
	}

}
