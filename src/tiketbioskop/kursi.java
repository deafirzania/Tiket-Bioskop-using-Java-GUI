/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author ASUS
 */
public class kursi extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel labela, labelb, labelc,
            l1a, l2a, l3a, l4a, l5a,
            l1b, l2b, l3b, l4b, l5b, l6b, l7b,
            l1c, l2c, l3c, l4c, l5c, l6c, l7c,
            l1d, l2d, l3d, l4d, l5d, l6d, l7d,
            l1e, l2e, l3e, l4e, l5e, l6e, l7e;
    private JRadioButton k1a, k2a, k3a, k4a, k5a,
            k1b, k2b, k3b, k4b, k5b, k6b, k7b,
            k1c, k2c, k3c, k4c, k5c, k6c, k7c,
            k1d, k2d, k3d, k4d, k5d, k6d, k7d,
            k1e, k2e, k3e, k4e, k5e, k6e, k7e;
    private JButton next;
    private ButtonGroup group = new ButtonGroup();
    private Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private JProgressBar barisProgres = new JProgressBar();
    private int time = 0;
    private Timer timer;

    public kursi() {
        frame = new JFrame();
        frame.setTitle("TIKET BIOSKOP");
        frame.setSize(550, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        labela = new JLabel("PEMILIHAN KURSI");
        frame.setLayout(null);
        frame.add(labela);
        labela.setBounds(225, 10, 150, 30);

        labelb = new JLabel("Layar");
        frame.setLayout(null);
        frame.add(labelb);
        labelb.setBounds(263, 60, 50, 30);

        labelc = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------");
        frame.setLayout(null);
        frame.add(labelc);
        labelc.setBounds(0, 80, 550, 30);

        k1a = new JRadioButton();
        frame.setLayout(null);
        frame.add(k1a);
        k1a.setBounds(100, 100, 30, 30);

        l1a = new JLabel("1A");
        frame.setLayout(null);
        frame.add(l1a);
        l1a.setBounds(130, 100, 50, 30);

        k2a = new JRadioButton();
        frame.setLayout(null);
        frame.add(k2a);
        k2a.setBounds(170, 100, 30, 30);

        l2a = new JLabel("2A");
        frame.setLayout(null);
        frame.add(l2a);
        l2a.setBounds(200, 100, 50, 30);

        k3a = new JRadioButton();
        frame.setLayout(null);
        frame.add(k3a);
        k3a.setBounds(240, 100, 30, 30);

        l3a = new JLabel("3A");
        frame.setLayout(null);
        frame.add(l3a);
        l3a.setBounds(270, 100, 50, 30);

        k4a = new JRadioButton();
        frame.setLayout(null);
        frame.add(k4a);
        k4a.setBounds(310, 100, 30, 30);

        l4a = new JLabel("4A");
        frame.setLayout(null);
        frame.add(l4a);
        l4a.setBounds(340, 100, 50, 30);

        k5a = new JRadioButton();
        frame.setLayout(null);
        frame.add(k5a);
        k5a.setBounds(380, 100, 30, 30);

        l5a = new JLabel("5A");
        frame.setLayout(null);
        frame.add(l5a);
        l5a.setBounds(410, 100, 50, 30);

        k1b = new JRadioButton();
        frame.setLayout(null);
        frame.add(k1b);
        k1b.setBounds(10, 170, 30, 30);

        l1b = new JLabel("1B");
        frame.setLayout(null);
        frame.add(l1b);
        l1b.setBounds(40, 170, 50, 30);

        k2b = new JRadioButton();
        frame.setLayout(null);
        frame.add(k2b);
        k2b.setBounds(100, 170, 30, 30);

        l2b = new JLabel("2B");
        frame.setLayout(null);
        frame.add(l2b);
        l2b.setBounds(130, 170, 50, 30);

        k3b = new JRadioButton();
        frame.setLayout(null);
        frame.add(k3b);
        k3b.setBounds(170, 170, 30, 30);

        l3b = new JLabel("3B");
        frame.setLayout(null);
        frame.add(l3b);
        l3b.setBounds(200, 170, 50, 30);

        k4b = new JRadioButton();
        frame.setLayout(null);
        frame.add(k4b);
        k4b.setBounds(240, 170, 30, 30);

        l4b = new JLabel("4B");
        frame.setLayout(null);
        frame.add(l4b);
        l4b.setBounds(270, 170, 50, 30);

        k5b = new JRadioButton();
        frame.setLayout(null);
        frame.add(k5b);
        k5b.setBounds(310, 170, 30, 30);

        l5a = new JLabel("5B");
        frame.setLayout(null);
        frame.add(l5a);
        l5a.setBounds(340, 170, 50, 30);

        k6b = new JRadioButton();
        frame.setLayout(null);
        frame.add(k6b);
        k6b.setBounds(380, 170, 30, 30);

        l6b = new JLabel("6B");
        frame.setLayout(null);
        frame.add(l6b);
        l6b.setBounds(410, 170, 50, 30);

        k7b = new JRadioButton();
        frame.setLayout(null);
        frame.add(k7b);
        k7b.setBounds(450, 170, 30, 30);

        l7b = new JLabel("7B");
        frame.setLayout(null);
        frame.add(l7b);
        l7b.setBounds(480, 170, 50, 30);

        k1c = new JRadioButton();
        frame.setLayout(null);
        frame.add(k1c);
        k1c.setBounds(10, 240, 30, 30);

        l1c = new JLabel("1C");
        frame.setLayout(null);
        frame.add(l1c);
        l1c.setBounds(40, 240, 50, 30);

        k2c = new JRadioButton();
        frame.setLayout(null);
        frame.add(k2c);
        k2c.setBounds(100, 240, 30, 30);

        l2c = new JLabel("2C");
        frame.setLayout(null);
        frame.add(l2c);
        l2c.setBounds(130, 240, 50, 30);

        k3c = new JRadioButton();
        frame.setLayout(null);
        frame.add(k3c);
        k3c.setBounds(170, 240, 30, 30);

        l3c = new JLabel("3C");
        frame.setLayout(null);
        frame.add(l3c);
        l3c.setBounds(200, 240, 50, 30);

        k4c = new JRadioButton();
        frame.setLayout(null);
        frame.add(k4c);
        k4c.setBounds(240, 240, 30, 30);

        l4c = new JLabel("4C");
        frame.setLayout(null);
        frame.add(l4c);
        l4c.setBounds(270, 240, 50, 30);

        k5c = new JRadioButton();
        frame.setLayout(null);
        frame.add(k5c);
        k5c.setBounds(310, 240, 30, 30);

        l5c = new JLabel("5C");
        frame.setLayout(null);
        frame.add(l5c);
        l5c.setBounds(340, 240, 50, 30);

        k6c = new JRadioButton();
        frame.setLayout(null);
        frame.add(k6c);
        k6c.setBounds(380, 240, 30, 30);

        l6c = new JLabel("6C");
        frame.setLayout(null);
        frame.add(l6c);
        l6c.setBounds(410, 240, 50, 30);

        k7c = new JRadioButton();
        frame.setLayout(null);
        frame.add(k7c);
        k7c.setBounds(450, 240, 30, 30);

        l7c = new JLabel("7C");
        frame.setLayout(null);
        frame.add(l7c);
        l7c.setBounds(480, 240, 50, 30);

        k1d = new JRadioButton();
        frame.setLayout(null);
        frame.add(k1d);
        k1d.setBounds(10, 310, 30, 30);

        l1d = new JLabel("1D");
        frame.setLayout(null);
        frame.add(l1d);
        l1d.setBounds(40, 310, 50, 30);

        k2d = new JRadioButton();
        frame.setLayout(null);
        frame.add(k2d);
        k2d.setBounds(100, 310, 30, 30);

        l2d = new JLabel("2D");
        frame.setLayout(null);
        frame.add(l2d);
        l2d.setBounds(130, 310, 50, 30);

        k3d = new JRadioButton();
        frame.setLayout(null);
        frame.add(k3d);
        k3d.setBounds(170, 310, 30, 30);

        l3d = new JLabel("3D");
        frame.setLayout(null);
        frame.add(l3d);
        l3d.setBounds(200, 310, 50, 30);

        k4d = new JRadioButton();
        frame.setLayout(null);
        frame.add(k4d);
        k4d.setBounds(240, 310, 30, 30);

        l4d = new JLabel("4D");
        frame.setLayout(null);
        frame.add(l4d);
        l4d.setBounds(270, 310, 50, 30);

        k5d = new JRadioButton();
        frame.setLayout(null);
        frame.add(k5d);
        k5d.setBounds(310, 310, 30, 30);

        l5d = new JLabel("5D");
        frame.setLayout(null);
        frame.add(l5d);
        l5d.setBounds(340, 310, 50, 30);

        k6d = new JRadioButton();
        frame.setLayout(null);
        frame.add(k6d);
        k6d.setBounds(380, 310, 30, 30);

        l6d = new JLabel("6D");
        frame.setLayout(null);
        frame.add(l6d);
        l6d.setBounds(410, 310, 50, 30);

        k7d = new JRadioButton();
        frame.setLayout(null);
        frame.add(k7d);
        k7d.setBounds(450, 310, 30, 30);

        l7d = new JLabel("7D");
        frame.setLayout(null);
        frame.add(l7d);
        l7d.setBounds(480, 310, 50, 30);

        k1e = new JRadioButton();
        frame.setLayout(null);
        frame.add(k1e);
        k1e.setBounds(10, 380, 30, 30);

        l1e = new JLabel("1E");
        frame.setLayout(null);
        frame.add(l1e);
        l1e.setBounds(40, 380, 50, 30);

        k2e = new JRadioButton();
        frame.setLayout(null);
        frame.add(k2e);
        k2e.setBounds(100, 380, 30, 30);

        l2e = new JLabel("2E");
        frame.setLayout(null);
        frame.add(l2e);
        l2e.setBounds(130, 380, 50, 30);

        k3e = new JRadioButton();
        frame.setLayout(null);
        frame.add(k3e);
        k3e.setBounds(170, 380, 30, 30);

        l3e = new JLabel("3E");
        frame.setLayout(null);
        frame.add(l3e);
        l3e.setBounds(200, 380, 50, 30);

        k4e = new JRadioButton();
        frame.setLayout(null);
        frame.add(k4e);
        k4e.setBounds(240, 380, 30, 30);

        l4e = new JLabel("4E");
        frame.setLayout(null);
        frame.add(l4e);
        l4e.setBounds(270, 380, 50, 30);

        k5e = new JRadioButton();
        frame.setLayout(null);
        frame.add(k5e);
        k5e.setBounds(310, 380, 30, 30);

        l5e = new JLabel("5E");
        frame.setLayout(null);
        frame.add(l5e);
        l5e.setBounds(340, 380, 50, 30);

        k6e = new JRadioButton();
        frame.setLayout(null);
        frame.add(k6e);
        k6e.setBounds(380, 380, 30, 30);

        l6e = new JLabel("6E");
        frame.setLayout(null);
        frame.add(l6e);
        l6e.setBounds(410, 380, 50, 30);

        k7e = new JRadioButton();
        frame.setLayout(null);
        frame.add(k7e);
        k7e.setBounds(450, 380, 30, 30);

        l7e = new JLabel("7E");
        frame.setLayout(null);
        frame.add(l7e);
        l7e.setBounds(480, 380, 50, 30);

        next = new JButton("NEXT");
        frame.setLayout(null);
        frame.add(next);
        next.setBounds(230, 425, 100, 30);
        next.addActionListener(this);

        group.add(k1a);
        group.add(k2a);
        group.add(k3a);
        group.add(k4a);
        group.add(k5a);
        group.add(k1b);
        group.add(k2b);
        group.add(k3b);
        group.add(k4b);
        group.add(k5b);
        group.add(k6b);
        group.add(k7b);
        group.add(k1c);
        group.add(k2c);
        group.add(k3c);
        group.add(k4c);
        group.add(k5c);
        group.add(k6c);
        group.add(k7c);
        group.add(k1d);
        group.add(k2d);
        group.add(k3d);
        group.add(k4d);
        group.add(k5d);
        group.add(k6d);
        group.add(k7d);
        group.add(k1e);
        group.add(k2e);
        group.add(k3e);
        group.add(k4e);
        group.add(k5e);
        group.add(k6e);
        group.add(k7e);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin dengan kursi yang Anda pilih ?", "Confirmation",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                Color Warna = Color.blue;
                barisProgres.setValue(0);
                barisProgres.setPreferredSize(new Dimension(100, 15));
                barisProgres.setBackground(Color.white);
                barisProgres.setBackground(Color.red);
                barisProgres.setStringPainted(true);
                barisProgres.setBorder(new LineBorder(Warna, 1));
                getContentPane().add(barisProgres, BorderLayout.CENTER);
                timer = new Timer(50, new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        time++;
                        barisProgres.setValue(time);
                        if (barisProgres.getPercentComplete() == 1.0) {

                            timer.stop();
                            setVisible(false);
                            new bayar().setVisible(true);
                            frame.setVisible(false);
                        }
                    }
                });
                timer.start();
                pack();
                show();
                setLocation(dimensi.width / 2 - getWidth() / 2, dimensi.height / 2 - getHeight() / 2);

            }
        }
    }
}
