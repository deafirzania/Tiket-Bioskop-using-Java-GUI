package tiketbioskop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class form extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel label, label1, label2, label3, label4, label5, lb;
    private JComboBox<String> judul, bulan, hari, waktu;
    private JComboBox tanggal, tahun;
    private JButton book, keluar, next;
    JTextField nama;
    JTextArea hasil;
    private Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private JProgressBar barisProgres = new JProgressBar();
    private int time = 0;
    private Timer timer;

    /**
     * @param args the command line arguments
     */
    public form() {
        frame = new JFrame();
        frame.setTitle("TIKET BIOSKOP");
        frame.setSize(550, 650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        JPanel pane = new JPanel();

        Container x = getContentPane();
        label = new JLabel("FORM PEMESANAN");
        frame.setLayout(null);
        frame.add(label);
        label.setBounds(220, 20, 150, 30);

        lb = new JLabel("HANYA UNTUK 1 TIKET");
        frame.setLayout(null);
        frame.add(lb);
        lb.setBounds(210, 60, 150, 30);

        label1 = new JLabel("Pilihan Film");
        frame.setLayout(null);
        frame.add(label1);
        label1.setBounds(20, 120, 150, 30);

        judul = new JComboBox<>();
        String[] a = new String[]{"MALEFICENT : MISTRESS OF EVIL",
            "PEREMPUAN TANAH JAHANAM",
            "LAMPOR KERANDA TERBANG",
            "JOKER", "AJARI AKU ISLAM"};
        judul = new JComboBox<>(a);
        frame.add(judul);
        judul.setBounds(100, 120, 350, 30);
        setContentPane(pane);

        label2 = new JLabel("Tanggal");
        frame.setLayout(null);
        frame.add(label2);
        label2.setBounds(20, 160, 150, 30);

        tanggal = new JComboBox();
        for (int i = 1; i <= 31; i++) {
            tanggal.addItem(i);
        }
        frame.add(tanggal);
        tanggal.setBounds(100, 160, 40, 30);

        bulan = new JComboBox<>();
        String[] b = new String[]{"Januari", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November", "Desember"};
        bulan = new JComboBox<>(b);
        frame.add(bulan);
        bulan.setBounds(150, 160, 90, 30);

        tahun = new JComboBox();
        for (int i = 2019; i < 2031; i++) {
            tahun.addItem(i);
        }
        frame.add(tahun);
        tahun.setBounds(250, 160, 60, 30);

        label3 = new JLabel("Hari");
        frame.setLayout(null);
        frame.add(label3);
        label3.setBounds(20, 200, 150, 30);

        hari = new JComboBox<>();
        String[] c = new String[]{"Senin", "Selasa", "Rabu", "Kamis",
            "Jumat", "Sabtu", "Minggu"};
        hari = new JComboBox<>(c);
        frame.add(hari);
        hari.setBounds(100, 200, 70, 30);

        label4 = new JLabel("Waktu");
        frame.setLayout(null);
        frame.add(label4);
        label4.setBounds(20, 240, 150, 30);

        waktu = new JComboBox<>();
        String[] d = new String[]{"14:00", "16:00", "18:30",
            "20:30", "22:30"};
        waktu = new JComboBox<>(d);
        frame.add(waktu);
        waktu.setBounds(100, 240, 60, 30);

        label5 = new JLabel("Nama");
        frame.setLayout(null);
        frame.add(label5);
        label5.setBounds(20, 280, 150, 30);

        nama = new JTextField();
        frame.setLayout(null);
        frame.add(nama);
        nama.setBounds(100, 280, 90, 30);

        book = new JButton("BOOKING");
        frame.add(book);
        book.setBounds(180, 390, 90, 30);
        book.addActionListener(this);

        keluar = new JButton("KELUAR");
        frame.add(keluar);
        keluar.setBounds(290, 390, 90, 30);
        keluar.addActionListener(this);

        hasil = new JTextArea();
        frame.setLayout(null);
        frame.add(hasil);
        hasil.setBounds(20, 440, 500, 100);
        hasil.setEditable(false);

        next = new JButton("NEXT");
        frame.setLayout(null);
        frame.add(next);
        next.setBounds(255, 550, 90, 30);
        next.addActionListener(this);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        new form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == book) {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin dengan film yang Anda pilih ?", "Confirmation",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                    == JOptionPane.YES_OPTION) {
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
                            hasil.setText("Judul \t: " + judul.getSelectedItem()
                                    + "\nTanggal \t: " + tanggal.getSelectedItem()
                                    + " " + bulan.getSelectedItem() + " "
                                    + tahun.getSelectedItem()
                                    + "\nHari \t: " + hari.getSelectedItem()
                                    + "\nNama \t: " + nama.getText());
                            timer.stop();
                            setVisible(false);
                        }
                    }
                });
                timer.start();
                pack();
                show();
                setLocation(dimensi.width / 2 - getWidth() / 2, dimensi.height
                        / 2 - getHeight() / 2);
            }
        } else if (e.getSource() == keluar) {
            if (JOptionPane.showConfirmDialog(null,
                    "Pesanan belum Tersimpan, Apakah Anda yakin akan keluar ?",
                    "Confirmation", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        } else if (e.getSource() == next) {
            new kursi().setVisible(true);
            frame.setVisible(false);
        }
    }

}
