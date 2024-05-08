package com.es.proyectoformulario.ui.frames;

import com.es.proyectoformulario.ui.panels.*;

import javax.swing.*;

public class FrameLogin extends JFrame {

    public FrameLogin() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Proyecto UI");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/pikachu.png");
        this.setIconImage(image.getImage());
        this.setResizable(false);

         // PanelLogin p = new PanelLogin(this);
         // this.add(p);

        // PanelAlta pAlta = new PanelAlta();
        // this.add(pAlta);

        // PanelOpciones pOpciones = new PanelOpciones(this);
        // this.add(pOpciones);

        //PanelConsulta panelConsulta = new PanelConsulta(this);
        //this.add(panelConsulta);

        PanelModificar pModificar = new PanelModificar(this);
        this.add(pModificar);

        this.setVisible(true);
    }


}
