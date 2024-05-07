package com.es.proyectoformulario.ui.panels;

import com.es.proyectoformulario.model.User;
import com.es.proyectoformulario.services.impl.ServiceUser;
import com.es.proyectoformulario.ui.frames.FrameLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PanelConsulta extends JPanel{

    private FrameLogin framePadre;
    private JButton bConsultar;
    private JButton bVolver;
    private JTextField textIdUser;
    private JLabel labelIdUSer;
    private JTextArea textArea;
    private ServiceUser serviceUser =  new ServiceUser();

    private MouseListener listenerMouseConsultar = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (serviceUser.userExists(textIdUser.getText())) {
                textArea.setText(serviceUser.mostrarDatosUser(textIdUser.getText()));
            }
        }
    };

    private MouseListener listenerMouseVolverr = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            cargarPanelOpciones();
        }
    };

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
        this.bConsultar.addMouseListener(listenerMouseConsultar);
        this.add(bConsultar);

        textArea = new JTextArea();
        this.textArea.setSize(new Dimension(250,250));
        this.textArea.setLocation(180,250);
        this.add(textArea);

        bVolver = new JButton("ATRAS");
        this.bVolver.setSize(new Dimension(100,32));
        this.bVolver.setLocation(new Point(25,500));
        this.bConsultar.setBackground(new Color(161, 255, 227));
        this.bVolver.addMouseListener(listenerMouseVolverr);
        this.add(bVolver);


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
