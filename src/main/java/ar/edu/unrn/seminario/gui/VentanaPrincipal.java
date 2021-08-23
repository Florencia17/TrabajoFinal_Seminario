package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal();
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
    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu UsuariosNewMenu = new JMenu("Usuarios");
        menuBar.add(UsuariosNewMenu);

        JMenuItem AltaModificacionNewMenuItem = new JMenuItem("Alta/Modificacion");
        AltaModificacionNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AltaUsuario altaUsuario= new AltaUsuario();
                altaUsuario.setVisible(true);
            }
        });
        UsuariosNewMenu.add(AltaModificacionNewMenuItem);

        JMenuItem ListadoNewMenuItem = new JMenuItem("Listado");
        UsuariosNewMenu.add(ListadoNewMenuItem);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton SalirNewButton = new JButton("Salir");
        SalirNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }
        });
        SalirNewButton.setBounds(179, 217, 89, 23);
        contentPane.add(SalirNewButton);
    }
}

