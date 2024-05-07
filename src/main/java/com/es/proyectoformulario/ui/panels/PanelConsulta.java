package com.es.proyectoformulario.ui.panels;

import com.es.proyectoformulario.ui.frames.FrameLogin;

import javax.swing.*;
import java.awt.*;

public class PanelConsulta extends JPanel{

    private FrameLogin framePadre;
    private JButton bConsultar;
    private JButton bVolver;
    private JTextField textIdUser;
    private JLabel labelIdUSer;
    private JTextArea textArea;

    public PanelConsulta(FrameLogin framePadre){
        this.framePadre = framePadre;

        this.setBackground(new Color(105, 175, 216));
        this.setLayout(null);

        labelIdUSer = new JLabel("id usuario");
        this.labelIdUSer.setSize(new Dimension(152, 32));
        this.labelIdUSer.setLocation(new Point(200, 100));
        this.add(labelIdUSer);

        textIdUser = new JTextField();
        this.textIdUser.setSize(new Dimension(152,32));
        this.textIdUser.setLocation(new Point(265,100));
        this.add(textIdUser);

        bConsultar = new JButton("CONSULTAR");
        this.bConsultar.setSize(new Dimension(150,50));
        this.bConsultar.setLocation(232, 165);
        this.bConsultar.setBackground(new Color(161, 255, 227));
        this.add(bConsultar);

        textArea = new JTextArea();
        this.textArea.setSize(new Dimension(250,250));
        this.textArea.setLocation(180,250);
        this.add(textArea);


    }



}
