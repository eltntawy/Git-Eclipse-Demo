package com.chat.controller;

import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import git.eclipse.demo.TestLookAndFeelForm;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {

    public Main() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String arg []) {
	
        final JFrame frame = new JFrame("Massanger");
        frame.setSize(800,700);
        try {

            //UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
            //UIManager.installLookAndFeel("SeaGlass", "com.seaglasslookandfeel.SeaGlassLookAndFeel");
            
            //UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
            UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                // TODO Auto-generated method stub
                SwingUtilities.updateComponentTreeUI(frame);
            }
        });
    }
}
