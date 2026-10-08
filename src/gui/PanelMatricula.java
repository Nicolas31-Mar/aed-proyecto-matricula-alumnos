
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import arreglos.ArregloSeccion;
import arreglos.ArregloMatricula;
import clases.Matricula;

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
    private ArregloSeccion as;
    private ArregloMatricula am;
    private DefaultTableModel modelo;

    /**
     * Create the panel.
     */
    public PanelMatricula() {

        am = new ArregloMatricula();

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
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
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
                "N.\u00BA matr\u00EDcula",
                "C\u00F3d. alumno",
                "C\u00F3d. secci\u00F3n",
                "Fecha",
                "Hora"
            }
        ));
        scrollMatriculas.setViewportView(tblMatriculas);

        modelo = (DefaultTableModel) tblMatriculas.getModel();

        btnAdicionar.addActionListener(e -> adicionar());
        btnConsultar.addActionListener(e -> consultar());
        btnModificar.addActionListener(e -> modificar());
        btnEliminar.addActionListener(e -> eliminar());

        listar();
    }

    public void setArregloSeccion(ArregloSeccion as) {
        this.as = as;
    }

    public void setArregloMatricula(ArregloMatricula am) {

        if (am != null) {
            this.am = am;
            listar();
        }
    }

    private void adicionar() {

        try {
            Matricula matricula = leerDatos();

            if (am.adicionar(matricula)) {
                listar();
                limpiar();
                mensaje("Matrícula registrada correctamente.");
            } else {
                mensaje("Ya existe una matrícula con ese número.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void consultar() {

        try {
            int numero = leerNumero();

            Matricula matricula = am.buscar(numero);

            if (matricula == null) {
                mensaje("No existe una matrícula con ese número.");
                return;
            }

            txtCodAlumno.setText(
                String.valueOf(matricula.getCodAlumno()));

            txtCodSeccion.setText(
                String.valueOf(matricula.getCodSeccion()));

            txtFecha.setText(matricula.getFecha());
            txtHora.setText(matricula.getHora());

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void modificar() {

        try {
            Matricula matricula = leerDatos();

            if (am.modificar(matricula)) {
                listar();
                limpiar();
                mensaje("Matrícula modificada correctamente.");
            } else {
                mensaje("No existe una matrícula con ese número.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void eliminar() {

        try {
            int numero = leerNumero();

            if (am.buscar(numero) == null) {
                mensaje("No existe una matrícula con ese número.");
                return;
            }

            int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar la matrícula?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
            );

            if (respuesta == JOptionPane.YES_OPTION) {

                am.eliminar(numero);
                listar();
                limpiar();

                mensaje("Matrícula eliminada correctamente.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private int leerNumero() {

        try {
            int numero = Integer.parseInt(
                txtNumMatricula.getText().trim());

            if (numero <= 0) {
                throw new IllegalArgumentException(
                    "El número de matrícula debe ser mayor que cero.");
            }

            return numero;

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Ingrese un número de matrícula válido.");
        }
    }

    private Matricula leerDatos() {

        int numMatricula = leerNumero();

        int codAlumno;
        int codSeccion;

        try {
            codAlumno = Integer.parseInt(
                txtCodAlumno.getText().trim());

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Ingrese un código de alumno válido.");
        }

        try {
            codSeccion = Integer.parseInt(
                txtCodSeccion.getText().trim());

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Ingrese un código de sección válido.");
        }

        if (codAlumno <= 0) {
            throw new IllegalArgumentException(
                "El código de alumno debe ser mayor que cero.");
        }

        if (codSeccion <= 0) {
            throw new IllegalArgumentException(
                "El código de sección debe ser mayor que cero.");
        }

        String fecha = txtFecha.getText().trim();
        String hora = txtHora.getText().trim();

        DateTimeFormatter formatoFecha = DateTimeFormatter
            .ofPattern("dd/MM/uuuu")
            .withResolverStyle(ResolverStyle.STRICT);

        DateTimeFormatter formatoHora = DateTimeFormatter
            .ofPattern("HH:mm");

        try {
            LocalDate.parse(fecha, formatoFecha);

        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException(
                "Ingrese una fecha válida en formato dd/MM/aaaa.");
        }

        try {
            LocalTime.parse(hora, formatoHora);

        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException(
                "Ingrese una hora válida en formato HH:mm.");
        }

        return new Matricula(
            numMatricula,
            codAlumno,
            codSeccion,
            fecha,
            hora
        );
    }

    private void listar() {

        if (modelo == null || am == null)
            return;

        modelo.setRowCount(0);

        for (int i = 0; i < am.tamanio(); i++) {

            Matricula matricula = am.obtener(i);

            modelo.addRow(new Object[] {
                matricula.getNumMatricula(),
                matricula.getCodAlumno(),
                matricula.getCodSeccion(),
                matricula.getFecha(),
                matricula.getHora()
            });
        }
    }

    private void limpiar() {

        txtNumMatricula.setText("");
        txtCodAlumno.setText("");
        txtCodSeccion.setText("");
        txtFecha.setText("");
        txtHora.setText("");

        txtNumMatricula.requestFocus();
    }

    private void mensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto);
    }
}
