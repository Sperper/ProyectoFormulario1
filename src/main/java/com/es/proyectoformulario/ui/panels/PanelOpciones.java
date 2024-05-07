package com.es.proyectoformulario.ui.panels;

import com.es.proyectoformulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelOpciones extends JPanel {

    private FrameLogin framePadre;
    private JButton bAlta;
    private JButton bBaja;
    private JButton bModificar;
    private JButton bConsultar;

    MouseListener mouseListenerAlta = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(151, 174, 145));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(192, 221, 184));
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            cargarPanelAlta();
        }
    };

    MouseListener mouseListenerBaja = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(191, 106, 106));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(234, 132, 132));
        }
    };

    MouseListener mouseListenerMod = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(161, 137, 75));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(216, 185, 105));
        }
    };

    MouseListener mouseListenerCons = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(86, 150, 186));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(105, 175, 216));
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Consultar pulsado");
            cargarPanelConsulta();
        }
    };



    public PanelOpciones(FrameLogin framePadre) {

        this.framePadre = framePadre;

        /*
        Alta
        Baja
        Modificar
        Consultar
         */

        this.setBackground(new Color(223, 220, 220));
        this.setLayout(null);

        bAlta = new JButton("Alta");
        bAlta.setLocation(new Point(215,100));
        bAlta.setSize(new Dimension(152,32));
        bAlta.setBackground(new Color(192, 221, 184));
        bAlta.setBorder(new LineBorder(new Color(135, 206, 250),2));
        bAlta.addMouseListener(mouseListenerAlta);
        this.add(bAlta);

        bBaja = new JButton("Baja");
        bBaja.setLocation(new Point(215,150));
        bBaja.setSize(new Dimension(152,32));
        bBaja.setBackground(new Color(234, 132, 132));
        bBaja.setBorder(new LineBorder(new Color(135, 206, 250),2));
        bBaja.addMouseListener(mouseListenerBaja);
        this.add(bBaja);

        bModificar = new JButton("Modificar");
        bModificar.setLocation(new Point(215,200));
        bModificar.setSize(new Dimension(152,32));
        bModificar.setBackground(new Color(216, 185, 105));
        bModificar.setBorder(new LineBorder(new Color(135, 206, 250),2));
        bModificar.addMouseListener(mouseListenerMod);
        this.add(bModificar);

        bConsultar = new JButton("Consultar");
        bConsultar.setLocation(new Point(215,250));
        bConsultar.setSize(new Dimension(152,32));
        bConsultar.setBackground(new Color(105, 175, 216));
        bConsultar.setBorder(new LineBorder(new Color(135, 206, 250),2));
        bConsultar.addMouseListener(mouseListenerCons);
        this.add(bConsultar);
    }

    private void cargarPanelConsulta(){
        framePadre.remove(this);

        PanelConsulta panelConsulta = new PanelConsulta(framePadre);
        framePadre.add(panelConsulta);

        framePadre.repaint();
        framePadre.revalidate();
    }

    private void cargarPanelAlta(){
        framePadre.remove(this);

        PanelAlta panelAlta = new PanelAlta();
        framePadre.add(panelAlta);

        framePadre.repaint();
        framePadre.revalidate();
    }

}
