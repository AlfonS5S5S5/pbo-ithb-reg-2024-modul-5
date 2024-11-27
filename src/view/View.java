package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class View extends JFrame implements ActionListener {
    JFrame frame = new JFrame();

    //Panel
    JPanel panelNIK = new JPanel();
    JPanel panelNama = new JPanel();
    JPanel panelTempatLahir = new JPanel();
    JPanel panelJenisKelamin = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel radioPanel1 = new JPanel();
    JPanel radioPanel2 = new JPanel();
    JPanel panelGolDarah = new JPanel();
    JPanel panelAlamat = new JPanel();

    //TextField buat input
    JTextField NIK = new JTextField();
    JTextField Nama = new JTextField();
    JTextField tempatLahir = new JTextField();
    JTextField alamat = new JTextField();

    //Radio Button
    ButtonGroup rButtonGroup1 = new ButtonGroup();
    ButtonGroup rButtonGroup2 = new ButtonGroup();

    JRadioButton rButtonPria = new JRadioButton("Male");
    JRadioButton rButtonWanita = new JRadioButton("Wanita");

    JRadioButton rButtonA = new JRadioButton("A");
    JRadioButton rButtonB = new JRadioButton("B");
    JRadioButton rButtonO = new JRadioButton("O");
    JRadioButton rButtonAB = new JRadioButton("AB");

    //Submit
    JButton button = new JButton("Submit");

    public View () {
        initComponents();
    }

    private void initComponents () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Latihan Modul 5");
        this.setSize(400,300);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x11bdd4));

        Dimension ukuranTextField = new Dimension(200, 25);
        
        button.setPreferredSize(new Dimension(100, 30));
        button.setBackground(Color.yellow);
        button.addActionListener(this);

        //________________________Label Title_____________________________
        JLabel judul = new JLabel("Form KTP");
        judul.setBounds(80, 10, 100, 10);
        judul.setBackground(new Color(0x11bdd4));
        judul.setOpaque(true);
        this.add(judul);
        //________________________________________________________________


        //___________________________NIK___________________________________
        //buat label
        panelNIK.setLayout(null);
        panelNIK.setBackground(new Color(0x11bdd4));
        panelNIK.setBounds(20, 20, 360, 50);

        //Text kiri nya input
        JLabel labelNIK = new JLabel("NIK ");
        labelNIK.setBounds(10, 5, 50, 20);

        //NIK buat textfield nya
        NIK.setBounds(10, 25, 200, 25);
        NIK.setPreferredSize(ukuranTextField);
        NIK.setMaximumSize(ukuranTextField);
        NIK.setForeground(Color.BLACK);
        NIK.setBackground(new Color(0xffffff));

        panelNIK.add(labelNIK); //JLabel
        panelNIK.add(NIK); //TextField
        //______________________________________________________________


        //___________________________Nama_______________________________
        //buat label
        panelNama.setLayout(null);
        panelNama.setBackground(new Color(0x11bdd4));
        panelNama.setBounds(20, 80, 360, 50);

        //Text kiri nya input
        JLabel labelNama = new JLabel("Nama ");
        labelNama.setBounds(10, 5, 50, 20);

        //Nama buat input area nya
        Nama.setBounds(10, 25, 200, 25);
        Nama.setPreferredSize(ukuranTextField);
        Nama.setMaximumSize(ukuranTextField);
        Nama.setForeground(Color.BLACK);
        Nama.setBackground(new Color(0xffffff));

        panelNama.add(labelNama); //JLabel
        panelNama.add(Nama); //TextField
        //______________________________________________________________


        //_________________________Tempat Lahir_________________________
        //buat label
        panelTempatLahir.setLayout(null);
        panelTempatLahir.setBackground(new Color(0x11bdd4));
        panelTempatLahir.setBounds(20, 140, 360, 50);
        
        //Text kiri nya input
        JLabel labelTempatLahir = new JLabel ("Tempat Lahir ");
        labelTempatLahir.setBounds(10, 5, 100, 20);

        //Tempat lahir buat input area nya
        tempatLahir.setBounds(10, 25, 200, 25);
        tempatLahir.setPreferredSize(ukuranTextField);
        tempatLahir.setMaximumSize(ukuranTextField);
        tempatLahir.setForeground((Color.BLACK));
        tempatLahir.setBackground(new Color (0xffffff));

        panelTempatLahir.add(labelTempatLahir);
        panelTempatLahir.add(tempatLahir);
        //________________________________________________________________


        // ____________________________ Tanggal Lahir (Date Picker) ____________________________
        //JDatePicker sm Calender masih gabisa koo T.T
        //______________________________________________________________________________________



        // __________________________________Jenis Kelamin______________________________________
        panelJenisKelamin.setLayout(null);
        panelJenisKelamin.setBackground(new Color(0x11bdd4));
        panelJenisKelamin.setBounds(20, 200, 360, 60);

        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin ");
        labelJenisKelamin.setBounds(10, 5, 100, 20);

        panelJenisKelamin.add(labelJenisKelamin);
        panelJenisKelamin.add(Box.createRigidArea(new Dimension(0, 5)));

        radioPanel1.setLayout(null);
        radioPanel1.setBounds(10, 25, 200, 30);
        rButtonPria.setBounds(0, 0, 70, 20);
        rButtonWanita.setBounds(80, 0, 70, 20);

        radioPanel1.setBackground(new Color (0x11bdd4));
        rButtonPria.setBackground(new Color(0x11bdd4));
        rButtonWanita.setBackground(new Color(0x11bdd4));
        
        radioPanel1.add(rButtonPria);
        radioPanel1.add(rButtonWanita);

        panelJenisKelamin.add(radioPanel1);
        
        rButtonGroup1.add(rButtonPria);
        rButtonGroup1.add(rButtonWanita);
        //______________________________________________________________________________________


        //_____________________________________Golongan Darah___________________________________

        panelGolDarah.setLayout(null);
        panelGolDarah.setBackground(new Color(0x11bdd4));
        panelGolDarah.setBounds(20, 270, 360, 60);

        JLabel labelGolDarah = new JLabel("Gol.Darah");
        labelGolDarah.setBounds(10, 5, 100, 20);

        panelGolDarah.add(labelGolDarah);
        panelGolDarah.add(Box.createRigidArea(new Dimension(0, 5)));

        radioPanel2.setLayout(null);
        radioPanel2.setBounds(10, 25, 400, 30);
        
        rButtonA.setBounds(0, 0, 70, 20);
        rButtonB.setBounds(80, 0, 70, 20);
        rButtonO.setBounds(160, 0, 70, 20);
        rButtonAB.setBounds(240, 0, 70, 20);
        
        radioPanel2.setBackground(new Color (0x11bdd4));
        rButtonA.setBackground(new Color(0x11bdd4));
        rButtonB.setBackground(new Color(0x11bdd4));
        rButtonO.setBackground(new Color(0x11bdd4));
        rButtonAB.setBackground(new Color(0x11bdd4));
        
        radioPanel2.add(rButtonA);
        radioPanel2.add(rButtonB);
        radioPanel2.add(rButtonO);
        radioPanel2.add(rButtonAB);

        panelGolDarah.add(radioPanel2);
        
        rButtonGroup2.add(rButtonA);
        rButtonGroup2.add(rButtonB);
        rButtonGroup2.add(rButtonO);
        rButtonGroup2.add(rButtonAB);

        //______________________________________________________________________________________


        //_________________________________________Alamat_______________________________________

        //buat label
        panelAlamat.setLayout(null);
        panelAlamat.setBackground(new Color(0x11bdd4));
        panelAlamat.setBounds(20, 330, 360, 50);

        //Text kiri nya input
        JLabel labelAlamat = new JLabel("Alamat ");
        labelAlamat.setBounds(10, 5, 50, 20);

        //Nama buat input area nya
        alamat.setBounds(10, 25, 200, 25);
        alamat.setPreferredSize(ukuranTextField);
        alamat.setMaximumSize(ukuranTextField);
        alamat.setForeground(Color.BLACK);
        alamat.setBackground(new Color(0xffffff));

        panelAlamat.add(labelAlamat); //JLabel
        panelAlamat.add(alamat); //TextField























        //___________________________________SUBMIT_____________________________
        // buttonPanel.setLayout(null);
        // buttonPanel.setBackground(new Color(0x11bdd4));
        // buttonPanel.setBounds(75, 280, 100, 30);
        // button.setBounds(0, 0, 100, 30);
        // buttonPanel.add(button);
        //______________________________________________________________________


        this.add(panelNIK);
        this.add(panelNama);
        this.add(panelTempatLahir);
        this.add(panelJenisKelamin);
        this.add(panelGolDarah);
        this.add(buttonPanel);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String nik = NIK.getText();
            String nama = Nama.getText();
            String tempat = tempatLahir.getText();

    
            System.out.println("NIK: " + nik);
            System.out.println("Nama: " + nama);
            System.out.println("Tempat Lahir: " + tempat);
    
            NIK.setText("");
            Nama.setText("");
            tempatLahir.setText("");
        }
    }
}