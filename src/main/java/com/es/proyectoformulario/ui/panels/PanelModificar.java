package com.es.proyectoformulario.ui.panels;

import com.es.proyectoformulario.services.impl.ServiceUser;
import com.es.proyectoformulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelModificar extends JPanel {
    private FrameLogin framePadre;
    private JTextField textUser;
    private JTextField textRepPass;
    private JTextField textPass;
    private JButton bModificar;
    private JButton bConsultar;
    private JButton bVolver;
    private JTextField textIdUser;
    private JTextField textIdUser2;
    private ServiceUser serviceUser = new ServiceUser();


    public PanelModificar(FrameLogin framePadre) {
        this.framePadre = framePadre;

        this.setBackground(new Color(216, 185, 105));
        this.setLayout(null);

        JLabel labelIdUsuario = new JLabel("Id usuario");
        labelIdUsuario.setLocation(175,19);
        labelIdUsuario.setSize(152,50);
        labelIdUsuario.setFont(new Font("Consolas", Font.BOLD, 15));
        this.add(labelIdUsuario);

        textIdUser = new JTextField();
        textIdUser.setLocation(new Point(275,20));
        textIdUser.setSize(new Dimension(120,32));
        this.add(textIdUser);

        bConsultar = new JButton("CONSULTAR");
        bConsultar.setLocation(new Point(225,90));
        bConsultar.setSize(new Dimension(120,32));
        bConsultar.setBackground(new Color(234, 132, 132));
        this.add(bConsultar);

        JLabel labelNuevosDatos = new JLabel("NUEVOS DATOS");
        labelNuevosDatos.setLocation(new Point(215,160));
        labelNuevosDatos.setSize(new Dimension(200,32));
        labelNuevosDatos.setFont(new Font("Consolas", Font.BOLD, 22));
        this.add(labelNuevosDatos);

        JLabel labelIdUsuario2 = new JLabel("Id usuario");
        labelIdUsuario2.setLocation(181,200);
        labelIdUsuario2.setSize(152,50);
        labelIdUsuario2.setFont(new Font("Consolas", Font.BOLD, 15));
        this.add(labelIdUsuario2);

        textIdUser2 = new JTextField("  Id antiguo");
        textIdUser2.setLocation(new Point(275,200));
        textIdUser2.setSize(new Dimension(120,32));
        this.add(textIdUser2);

        JLabel labelUser = new JLabel("nombre usuario");
        labelUser.setLocation(150,250);
        labelUser.setSize(new Dimension(120,32));
        labelUser.setFont(new Font("Consolas", Font.BOLD, 15));
        this.add(labelUser);

        textUser = new JTextField(" nombre antiguo");
        textUser.setLocation(new Point(275,250));
        textUser.setSize(new Dimension(120,32));
        this.add(textUser);

        JLabel labelPass = new JLabel("password");
        labelPass.setLocation(new Point(197,300));
        labelPass.setSize(new Dimension(120,32));
        labelPass.setFont(new Font("Consolas", Font.BOLD, 15));
        this.add(labelPass);

        textPass = new JTextField(" password antigua");
        textPass.setLocation(new Point(275,300));
        textPass.setSize(new Dimension(120,32));
        this.add(textPass);

        JLabel labelRepPass = new JLabel("repita password");
        labelRepPass.setLocation(new Point(140,350));
        labelRepPass.setSize(new Dimension(120,32));
        labelRepPass.setFont(new Font("Consolas", Font.BOLD, 15));
        this.add(labelRepPass);

        textRepPass = new JTextField(" password antigua");
        textRepPass.setLocation(new Point(275,350));
        textRepPass.setSize(new Dimension(120,32));
        this.add(textRepPass);

        JLabel labelIsAdmin = new JLabel("is admin");
        labelIsAdmin.setLocation(new Point(193, 400));
        labelIsAdmin.setSize(new Dimension(120,32));
        labelIsAdmin.setFont(new Font("Consolas", Font.BOLD, 15));
        this.add(labelIsAdmin);

        JComboBox<String> isAdmin = new JComboBox<>();
        isAdmin.setLocation(new Point(275,400));
        isAdmin.setSize(new Dimension(120, 32));
        isAdmin.setBackground(new Color(255,255,255));
        isAdmin.addItem(null);
        isAdmin.addItem("No");
        isAdmin.addItem("Si");
        this.add(isAdmin);

        bModificar = new JButton("MODIFICAR");
        bModificar.setLocation(new Point(225,450));
        bModificar.setSize(new Dimension(120,32));
        bModificar.setBackground(new Color(105, 175, 216));
        bModificar.setBorder(new LineBorder(new Color(135, 206, 250),2));
        this.add(bModificar);


    }



}
