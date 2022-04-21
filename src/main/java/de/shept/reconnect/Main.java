package de.shept.reconnect;

import de.shept.reconnect.util.ReconnectUtil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Main {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton runButton = new JButton("Proccess");
        runButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == runButton) {

                    ReconnectUtil.sendReconnect();
                    try {
                        ReconnectUtil.execute();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    System.exit(-1);

                }

            }
        });
        runButton.setBounds(169, 112, 85, 21);
        frame.getContentPane().add(runButton);
    }
}
