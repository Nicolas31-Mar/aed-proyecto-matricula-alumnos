
package gui;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

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

import arreglos.ArregloPago;
import clases.Pago;

public class PanelPago extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel lblTituloPago;
    private JLabel lblNumPago;
    private JTextField txtNumPago;
    private JLabel lblNumMatricula;
    private JTextField txtNumMatricula;
    private JLabel lblMonto;
    private JTextField txtMonto;
    private JLabel lblFecha;
    private JTextField txtFecha;
    private JLabel lblHora;
    private JTextField txtHora;
    private JButton btnAdicionar;
    private JButton btnConsultar;
    private JButton btnModificar;
    private JButton btnEliminar;
    private JButton btnLimpiar;
    private JScrollPane scrollPagos;
    private JTable tblPagos;

    private ArregloPago ap;
    private DefaultTableModel modelo;

    /**
     * Create the panel.
     */
    public PanelPago() {

        ap = new ArregloPago();

        setBackground(new Color(245, 247, 250));
        setPreferredSize(new Dimension(650, 530));
        setLayout(null);

        lblTituloPago = new JLabel("Pagos");
        lblTituloPago.setForeground(new Color(32, 47, 70));
        lblTituloPago.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblTituloPago.setBounds(30, 30, 450, 40);
        add(lblTituloPago);

        lblNumPago = new JLabel("Número de pago");
        lblNumPago.setBounds(30, 100, 125, 25);
        add(lblNumPago);

        txtNumPago = new JTextField();
        txtNumPago.setBounds(155, 98, 140, 28);
        add(txtNumPago);
        txtNumPago.setColumns(10);

        lblNumMatricula = new JLabel("N.º de matrícula");
        lblNumMatricula.setBounds(325, 100, 125, 25);
        add(lblNumMatricula);

        txtNumMatricula = new JTextField();
        txtNumMatricula.setBounds(455, 98, 160, 28);
        add(txtNumMatricula);
        txtNumMatricula.setColumns(10);

        lblMonto = new JLabel("Monto");
        lblMonto.setBounds(30, 150, 125, 25);
        add(lblMonto);

        txtMonto = new JTextField();
        txtMonto.setBounds(155, 148, 140, 28);
        add(txtMonto);
        txtMonto.setColumns(10);

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

        scrollPagos = new JScrollPane();
        scrollPagos.setBounds(30, 315, 585, 190);
        add(scrollPagos);

        tblPagos = new JTable();
        tblPagos.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "N.\u00BA pago", "N.\u00BA matr\u00EDcula",
                "Monto", "Fecha", "Hora"
            }
        ));
        scrollPagos.setViewportView(tblPagos);

        modelo = (DefaultTableModel) tblPagos.getModel();

        btnAdicionar.addActionListener(e -> adicionar());
        btnConsultar.addActionListener(e -> consultar());
        btnModificar.addActionListener(e -> modificar());
        btnEliminar.addActionListener(e -> eliminar());
        btnLimpiar.addActionListener(e -> limpiar());

        listar();
    }

    private void adicionar() {

        try {
            Pago pago = leerDatos();

            if (ap.adicionar(pago)) {
                listar();
                limpiar();
                mensaje("Pago registrado correctamente.");
            } else {
                mensaje("Ya existe un pago con ese número.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void consultar() {

        try {
            int numero = leerNumero();
            Pago pago = ap.buscar(numero);

            if (pago == null) {
                mensaje("No existe un pago con ese número.");
                return;
            }

            txtNumMatricula.setText(
                String.valueOf(pago.getNumMatricula()));

            txtMonto.setText(
                String.valueOf(pago.getMonto()));

            txtFecha.setText(pago.getFecha());
            txtHora.setText(pago.getHora());

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void modificar() {

        try {
            Pago pago = leerDatos();

            if (ap.modificar(pago)) {
                listar();
                limpiar();
                mensaje("Pago modificado correctamente.");
            } else {
                mensaje("No existe un pago con ese número.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private void eliminar() {

        try {
            int numero = leerNumero();

            if (ap.buscar(numero) == null) {
                mensaje("No existe un pago con ese número.");
                return;
            }

            int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar el pago?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
            );

            if (respuesta == JOptionPane.YES_OPTION) {
                ap.eliminar(numero);
                listar();
                limpiar();
                mensaje("Pago eliminado correctamente.");
            }

        } catch (IllegalArgumentException ex) {
            mensaje(ex.getMessage());
        }
    }

    private int leerNumero() {

        try {
            int numero = Integer.parseInt(
                txtNumPago.getText().trim());

            if (numero <= 0) {
                throw new IllegalArgumentException(
                    "El número de pago debe ser mayor que cero.");
            }

            return numero;

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Ingrese un número de pago válido.");
        }
    }

    private Pago leerDatos() {

        int numPago = leerNumero();
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

        double monto;

        try {
            monto = Double.parseDouble(
                txtMonto.getText().trim());

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "Ingrese un monto numérico válido.");
        }

        if (!Double.isFinite(monto) || monto <= 0) {
            throw new IllegalArgumentException(
                "El monto debe ser mayor que cero.");
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

        return new Pago(
            numPago,
            numMatricula,
            monto,
            fecha,
            hora
        );
    }

    private void listar() {

        modelo.setRowCount(0);

        for (int i = 0; i < ap.tamanio(); i++) {

            Pago pago = ap.obtener(i);

            modelo.addRow(new Object[] {
                pago.getNumPago(),
                pago.getNumMatricula(),
                pago.getMonto(),
                pago.getFecha(),
                pago.getHora()
            });
        }
    }

    private void limpiar() {

        txtNumPago.setText("");
        txtNumMatricula.setText("");
        txtMonto.setText("");
        txtFecha.setText("");
        txtHora.setText("");

        txtNumPago.requestFocus();
    }

    private void mensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto);
    }
}
