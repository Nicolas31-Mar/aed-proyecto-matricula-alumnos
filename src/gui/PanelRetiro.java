
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
import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import arreglos.ArregloRetiro;
import clases.Retiro;

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

    private ArregloRetiro ar;
    private DefaultTableModel modelo;

    /**
     * Create the panel.
     */
    public PanelRetiro() {

        ar = new ArregloRetiro();

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
                "N.\u00BA retiro", "N.\u00BA matr\u00EDcula",
                "Fecha", "Hora"
            }
        ));
        scrollRetiros.setViewportView(tblRetiros);

        modelo = (DefaultTableModel) tblRetiros.getModel();

        btnAdicionar.addActionListener(e -> adicionar());
        btnConsultar.addActionListener(e -> consultar());
        btnModificar.addActionListener(e -> modificar());
        btnEliminar.addActionListener(e -> eliminar());
        btnLimpiar.addActionListener(e -> limpiar());

        listar();
    }

    private void adicionar() {

        try {
            Retiro retiro = leerDatos();

            if (ar.adicionar(retiro)) {
                listar();
                limpiar();
                mensaje("Retiro registrado correctamente.");
            } else {
                mensaje("Ya existe un retiro con ese número.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void consultar() {

        try {
            int numero = leerNumero();
            Retiro retiro = ar.buscar(numero);

            if (retiro == null) {
                mensaje("No existe un retiro con ese número.");
                return;
            }

            txtNumMatricula.setText(
                String.valueOf(retiro.getNumMatricula()));

            txtFecha.setText(retiro.getFecha());
            txtHora.setText(retiro.getHora());

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void modificar() {

        try {
            Retiro retiro = leerDatos();

            if (ar.modificar(retiro)) {
                listar();
                limpiar();
                mensaje("Retiro modificado correctamente.");
            } else {
                mensaje("No existe un retiro con ese número.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void eliminar() {

        try {
            int numero = leerNumero();

            if (ar.buscar(numero) == null) {
                mensaje("No existe un retiro con ese número.");
                return;
            }

            int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar el retiro?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
            );

            if (respuesta == JOptionPane.YES_OPTION) {
                ar.eliminar(numero);
                listar();
                limpiar();
                mensaje("Retiro eliminado correctamente.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private int leerNumero() {

        try {
            int numero = Integer.parseInt(
                txtNumRetiro.getText().trim());

            if (numero <= 0) {
                throw new IllegalArgumentException(
                    "El número de retiro debe ser mayor que cero.");
            }

            return numero;

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Ingrese un número de retiro válido.");
        }
    }

    private Retiro leerDatos() {

        int numRetiro = leerNumero();

        int numMatricula;

        try {
            numMatricula = Integer.parseInt(
                txtNumMatricula.getText().trim());

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Ingrese un número de matrícula válido.");
        }

        if (numMatricula <= 0) {
            throw new IllegalArgumentException(
                "El número de matrícula debe ser mayor que cero.");
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

        return new Retiro(
            numRetiro,
            numMatricula,
            fecha,
            hora
        );
    }

    private void listar() {

        modelo.setRowCount(0);

        for (int i = 0; i < ar.tamanio(); i++) {

            Retiro retiro = ar.obtener(i);

            modelo.addRow(new Object[] {
                retiro.getNumRetiro(),
                retiro.getNumMatricula(),
                retiro.getFecha(),
                retiro.getHora()
            });
        }
    }

    private void limpiar() {

        txtNumRetiro.setText("");
        txtNumMatricula.setText("");
        txtFecha.setText("");
        txtHora.setText("");

        txtNumRetiro.requestFocus();
    }

    private void mensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto);
    }
}
