package com.es.proyectoformulario.ui.panels;

import com.es.proyectoformulario.services.impl.ServiceUser;
import com.es.proyectoformulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelAlta extends JPanel {

   private JTextField user;
   private JTextField textRepPass;
   private JTextField pass;
   private JButton bEnviar;
   private FrameLogin framePadre;

   private JTextField textIdUser;

   private ServiceUser serviceUser = new ServiceUser();

    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

            if (!textRepPass.getText().equals(pass.getText())) {
                pass.setBackground(new Color(255,0,0));
                textRepPass.setBackground(new Color(255,0,0));
            } else {
                System.out.println("Usuario registrado correctamente");
                pass.setBackground(new Color(255,255,255));
                textRepPass.setBackground(new Color(255,255,255));
            }

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(135, 206, 250)); // Fondo azul claro
            b.setBorder(new LineBorder(new Color(0, 115, 183), 3)); // Borde azul oscuro
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(102, 153, 204)); // Fondo azul medio
            b.setBorder(new LineBorder(new Color(135, 206, 250), 3)); // Borde azul claro
        }
    };

    public PanelAlta(){

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
        this.add(user);



        JLabel passwd = new JLabel("Passwd: ");
        passwd.setLocation(new Point(200,200));
        passwd.setSize(new Dimension(152,32));
        this.add(passwd);

        pass = new JPasswordField();
        pass.setLocation(new Point(260,200));
        pass.setSize(new Dimension(152,32));
        this.add(pass);

        JLabel repPass = new JLabel("Repite su passwd: ");
        repPass.setLocation(new Point(150,267));
        repPass.setSize(new Dimension(152, 32));
        this.add(repPass);

        textRepPass = new JPasswordField();
        textRepPass.setLocation(new Point(260, 267));
        textRepPass.setSize(new Dimension(152,32));
        this.add(textRepPass);

        JLabel idUser = new JLabel("Id del Usuario");
        idUser.setLocation(new Point(175, 80));
        idUser.setSize(new Dimension(152,32));
        this.add(idUser);

        textIdUser = new JTextField();
        textIdUser.setLocation(new Point(260, 80));
        textIdUser.setSize(new Dimension(152,32));
        this.add(textIdUser);

        bEnviar = new JButton("Enviar");
        bEnviar.setLocation(new Point(220,500));
        bEnviar.setSize(new Dimension(152,32));
        this.add(bEnviar);
        bEnviar.addMouseListener(listenerMouse);

        JLabel labelIsAdmin = new JLabel("Is Admin");
        labelIsAdmin.setLocation(new Point(200, 330));
        labelIsAdmin.setSize(new Dimension(152,32));
        this.add(labelIsAdmin);


        JComboBox<String> isAdmin = new JComboBox<>();
        isAdmin.setLocation(new Point(260,330));
        isAdmin.setSize(new Dimension(152, 32));
        isAdmin.addItem(null);
        isAdmin.addItem("No");
        isAdmin.addItem("Si");
        this.add(isAdmin);


    }

}
