package com.es.proyectoformulario.ui.panels;

import com.es.proyectoformulario.ui.frames.FrameLogin;

import javax.swing.*;
import java.awt.*;

public class PanelConsulta extends JPanel{

    private FrameLogin framePadre;
    private JButton bConsultar;
    private JButton bVolver;
    private JTextField textIdUser;
    private JTextArea info;

    public PanelConsulta(FrameLogin framePadre){
        this.framePadre = framePadre;

        this.setBackground(new Color(105, 175, 216));
        this.setLayout(null);

        textIdUser = new JTextField();
        textIdUser.setSize(new Dimension());

    }

}
