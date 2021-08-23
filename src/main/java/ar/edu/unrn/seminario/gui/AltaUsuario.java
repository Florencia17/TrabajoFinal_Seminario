package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaUsuario extends JFrame {

    private JPanel contentPane;
    private JTextField nombreDeUsuariotextField;
    private JTextField contraseniatextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AltaUsuario frame = new AltaUsuario();
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
    public AltaUsuario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel usuarioNewLabel = new JLabel("Nombre de Usuario:");
        usuarioNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        usuarioNewLabel.setBounds(10, 62, 139, 14);
        contentPane.add(usuarioNewLabel);

        nombreDeUsuariotextField = new JTextField();
        nombreDeUsuariotextField.setBounds(181, 61, 115, 20);
        contentPane.add(nombreDeUsuariotextField);
        nombreDeUsuariotextField.setColumns(10);

        JLabel ContraseniaNewLabel = new JLabel("Contrase\u00F1a:");
        ContraseniaNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ContraseniaNewLabel.setBounds(10, 124, 115, 14);
        contentPane.add(ContraseniaNewLabel);

        contraseniatextField = new JTextField();
        contraseniatextField.setBounds(181, 123, 115, 20);
        contentPane.add(contraseniatextField);
        contraseniatextField.setColumns(10);

        JButton AceptarNewButton = new JButton("Aceptar");
        AceptarNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Se regitro la venta correctamente." + "\n" +
                        "Nombre de Usuario:" + nombreDeUsuariotextField.getText() + "\n" + "Contraseña: " + contraseniatextField.getText() );
                //System.out.println("Nombre de Usuario:" + nombreDeUsuariotextField + "\n" + "Contraseña: " + contraseniatextField.getText() );
            }
        });
        AceptarNewButton.setBounds(137, 238, 89, 23);
        contentPane.add(AceptarNewButton);

        JButton CancelarNewButton = new JButton("Cancelar");
        CancelarNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        CancelarNewButton.setBounds(237, 238, 89, 23);
        contentPane.add(CancelarNewButton);
    }
}

