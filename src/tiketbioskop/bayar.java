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

/**
 *
 * @author ASUS
 */
public class bayar extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel labeld, labele, labelf, labelg;
    private JTextField total, uang;
    private JButton hitung, ulang, exit;

    public bayar() {
        frame = new JFrame();
        frame.setTitle("TIKET BIOSKOP");
        frame.setSize(550, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        labeld = new JLabel("PEMBAYARAN");
        frame.setLayout(null);
        frame.add(labeld);
        labeld.setBounds(255, 10, 150, 30);

        labele = new JLabel("Total Tagihan ");
        frame.setLayout(null);
        frame.add(labele);
        labele.setBounds(20, 50, 150, 30);

        total = new JTextField();
        frame.setLayout(null);
        frame.add(total);
        total.setBounds(150, 50, 150, 30);
        total.setEditable(false);
        total.setText("Rp35.000");

        labelf = new JLabel("Total Pembayaran");
        frame.setLayout(null);
        frame.add(labelf);
        labelf.setBounds(20, 90, 150, 30);

        uang = new JTextField();
        frame.setLayout(null);
        frame.add(uang);
        uang.setBounds(150, 90, 150, 30);

        hitung = new JButton("HITUNG");
        frame.setLayout(null);
        frame.add(hitung);
        hitung.setBounds(225, 130, 150, 30);
        hitung.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hitung) {
            try {
                int a = Integer.parseInt(uang.getText());
                int b = 35000;

                if (a < b) {
                    JOptionPane.showMessageDialog(null, "Mohon Maaf Uang Anda Kurang");
                }
                if (a > b) {
                    int hasil = a - b;
                    JOptionPane.showMessageDialog(null, "<html> Kembalian : "
                            + hasil + "</html>");
                    labelg = new JLabel("Mau Membeli Tiket Yang Lain?");
                    frame.setLayout(null);
                    frame.add(labelg);
                    labelg.setBounds(180, 200, 200, 30);

                    ulang = new JButton("YA");
                    frame.setLayout(null);
                    frame.add(ulang);
                    ulang.setBounds(220, 240, 90, 30);
                    ulang.addActionListener(this);

                    exit = new JButton("TIDAK");
                    frame.setLayout(null);
                    frame.add(exit);
                    exit.setBounds(220, 300, 90, 30);
                    exit.addActionListener(this);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Isi Kotak Kosong dengan Angka");
            }

        }
        if (e.getSource() == ulang) {
            new form().setVisible(true);
            frame.setVisible(false);
        } else if (e.getSource() == exit) {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar ?", "Confirmation",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        }
    }
}
