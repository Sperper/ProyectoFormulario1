package com.es.proyectoformulario.ui.panels;


import com.es.proyectoformulario.services.impl.ServiceUser;
import com.es.proyectoformulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Pablo Macías
 */
public class PanelLogin extends JPanel {
    private JTextField user;
    private JTextField pass;
    private JButton bEnviar;
    private JButton bAlta;


    // Este es el framePadre del panel
    private FrameLogin framePadre;

    private ServiceUser serviceUser = new ServiceUser();

    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

            if(serviceUser.checkUser(user.getText(), pass.getText())) {
                System.out.println("Esta registrado");
            } else {
                System.out.println("Pa tu casa");
            }

            Boolean isAdmin2 = false;

        }
    };


    private MouseListener listenerMouseAlta = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Alta pulsado");
            cargarPanelAlta();
        }
    };

   private MouseListener listenerMouseOpciones = new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e) {
           System.out.println("Cargando opciones");
           cargarPanelOpciones();
       }
   };


    public PanelLogin(FrameLogin framePadre) {

        this.framePadre = framePadre;

        this.setBackground(new Color(174, 139, 225));
        this.setLayout(null);

        JLabel usuario = new JLabel("Usuario: ");
        usuario.setLocation(new Point(200,135));
        usuario.setSize(new Dimension(152,32));
        // usuario.setFont(new Font("Consolas", Font.BOLD, 22));
        this.add(usuario);

        user = new JTextField("Introduzca su usuario");
        user.setLocation(new Point(260,135));
        user.setSize(new Dimension(152,32));
        this.add    (user);

        JLabel passwd = new JLabel("Passwd: ");
        passwd.setLocation(new Point(200,200));
        passwd.setSize(new Dimension(152,32));
        this.add(passwd);

        pass = new JPasswordField();
        pass.setLocation(new Point(260,200));
        pass.setSize(new Dimension(152,32));
        this.add(pass);

        bEnviar = new JButton("Enviar");
        bEnviar.setLocation(new Point(150,321));
        bEnviar.setSize(new Dimension(152,32));
        this.add(bEnviar);
        bEnviar.addMouseListener(listenerMouseOpciones);

        bAlta = new JButton("Alta");
        bAlta.setLocation(new Point(320,321));
        bAlta.setSize(new Dimension(152,32));
        bAlta.setBackground(new Color(208,223,232));
        bAlta.setBorder(new LineBorder(new Color(135, 206, 250),2));
        bAlta.addMouseListener(listenerMouseAlta);
        this.add(bAlta);

    }

    private void cargarPanelAlta(){
        // ELIMINAMOS THIS PanelLogin... este... no otro.
        framePadre.remove(this);

        // AÑADIMOS UN PANEL ALTA AL ¡¡¡FRAME!!!
        PanelAlta panelAlta = new PanelAlta();
        framePadre.add(panelAlta);

        // ULTIMO: REPINTAR EL FRAME
        framePadre.repaint();
        framePadre.revalidate();

    }

    private void cargarPanelOpciones(){
        // ELIMINAMOS THIS PanelLogin... este... no otro.
        framePadre.remove(this);

        // AÑADIMOS UN PANEL ALTA AL ¡¡¡FRAME!!!
        PanelOpciones panelOpciones = new PanelOpciones(framePadre);
        framePadre.add(panelOpciones);

        // ULTIMO: REPINTAR EL FRAME
        framePadre.repaint();
        framePadre.revalidate();
    }

}
