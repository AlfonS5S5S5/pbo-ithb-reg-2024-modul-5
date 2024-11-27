package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
    JPanel panelRTRW = new JPanel();
    JPanel panelKelDesa = new JPanel();
    JPanel panelKecamatan = new JPanel();
    JPanel panelAgama = new JPanel();
    JPanel panelKawin = new JPanel();
    JPanel panelPekerjaan = new JPanel();
    JPanel panelKewarganegaraan = new JPanel();

    //TextField buat input
    JTextField NIK = new JTextField();
    JTextField Nama = new JTextField();
    JTextField tempatLahir = new JTextField();
    JTextField alamat = new JTextField();
    JTextField RTRW = new JTextField();
    JTextField KelDesa = new JTextField();
    JTextField kecamatan = new JTextField();

    //Radio Button
    ButtonGroup rButtonGroup1 = new ButtonGroup();
    ButtonGroup rButtonGroup2 = new ButtonGroup();
    ButtonGroup kewarganegaraanButton = new ButtonGroup();

    JRadioButton rButtonPria = new JRadioButton("Male");
    JRadioButton rButtonWanita = new JRadioButton("Wanita");

    JRadioButton rButtonA = new JRadioButton("A");
    JRadioButton rButtonB = new JRadioButton("B");
    JRadioButton rButtonO = new JRadioButton("O");
    JRadioButton rButtonAB = new JRadioButton("AB");

    JRadioButton rWNI = new JRadioButton("WNI");
    JRadioButton rWNA = new JRadioButton("WNA");

    //Submit
    JButton button = new JButton("Submit");

    public View () {
        initComponents();
    }

    private void initComponents () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Latihan Modul 5");
        this.setSize(1000,1000);
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
        //_______________________________________________________________________________________


        //_________________________________________RT/RW_______________________________________

        //buat label
        panelRTRW.setLayout(null);
        panelRTRW.setBackground(new Color(0x11bdd4));
        panelRTRW.setBounds(20, 410, 360, 50);

        //Text kiri nya input
        JLabel labelRTRW = new JLabel("RT/RW ");
        labelRTRW.setBounds(10, 5, 50, 20);

        //Nama buat input area nya
        RTRW.setBounds(10, 25, 200, 25);
        RTRW.setPreferredSize(ukuranTextField);
        RTRW.setMaximumSize(ukuranTextField);
        RTRW.setForeground(Color.BLACK);
        RTRW.setBackground(new Color(0xffffff));

        panelRTRW.add(labelRTRW); //JLabel
        panelRTRW.add(RTRW); //TextField
        //_______________________________________________________________________________________


        //_________________________________________Kel/Desa_______________________________________

        //buat label
        panelKelDesa.setLayout(null);
        panelKelDesa.setBackground(new Color(0x11bdd4));
        panelKelDesa.setBounds(20, 470, 360, 50);

        //Text kiri nya input
        JLabel labelKelDesa = new JLabel("Kel/Desa ");
        labelKelDesa.setBounds(10, 5, 100, 20);

        //Nama buat input area nya
        KelDesa.setBounds(10, 25, 200, 25);
        KelDesa.setPreferredSize(ukuranTextField);
        KelDesa.setMaximumSize(ukuranTextField);
        KelDesa.setForeground(Color.BLACK);
        KelDesa.setBackground(new Color(0xffffff));

        panelKelDesa.add(labelKelDesa); //JLabel
        panelKelDesa.add(KelDesa); //TextField
        //_______________________________________________________________________________________


        //_______________________________________Kecamatan_______________________________________

        //buat label
        panelKecamatan.setLayout(null);
        panelKecamatan.setBackground(new Color(0x11bdd4));
        panelKecamatan.setBounds(20, 530, 360, 50);

        //Text kiri nya input
        JLabel labelKecamatan = new JLabel("Kecamatan ");
        labelKecamatan.setBounds(10, 5, 100, 20);

        //Nama buat input area nya
        kecamatan.setBounds(10, 25, 200, 25);
        kecamatan.setPreferredSize(ukuranTextField);
        kecamatan.setMaximumSize(ukuranTextField);
        kecamatan.setForeground(Color.BLACK);
        kecamatan.setBackground(new Color(0xffffff));

        panelKecamatan.add(labelKecamatan); //JLabel
        panelKecamatan.add(kecamatan); //TextField
        //_______________________________________________________________________________________


        //Ke Kanan
        //_______________________________________Agama_______________________________________

        panelAgama.setLayout(null);
        panelAgama.setBackground(new Color(0x11bdd4));
        panelAgama.setBounds(400, 20, 400, 100);

        JLabel labelAgama = new JLabel("Agama ");
        labelAgama.setBounds(70, 17, 100, 30);

        // MAKE COMBO BOX
        JComboBox<String> agamaComboBox = new JComboBox<>();
        agamaComboBox.addItem("");
        agamaComboBox.addItem("KATOLIK");
        agamaComboBox.addItem("KRISTEN");
        agamaComboBox.addItem("HINDU");
        agamaComboBox.addItem("BUDDHA");
        agamaComboBox.addItem("KONGHUCU");
        agamaComboBox.addItem("ISLAM");

        agamaComboBox.setBounds(120, 20, 250, 25);

        panelAgama.add(labelAgama);
        panelAgama.add(agamaComboBox);
        //_______________________________________________________________________________________


        //___________________________________Status Perkawinan___________________________________

        panelKawin.setLayout(null);
        panelKawin.setBackground(new Color(0x11bdd4));
        panelKawin.setBounds(400, 80, 400, 100);

        JLabel labelKawin = new JLabel("Status Perkawinan ");
        labelKawin.setBounds(70, 45, 120, 30);

        // MAKE COMBO BOX
        JComboBox<String> kawinComboBox = new JComboBox<>();
        kawinComboBox.addItem("");
        kawinComboBox.addItem("Belum Menikah");
        kawinComboBox.addItem("Menikah");
        kawinComboBox.addItem("Janda/Duda");

        kawinComboBox.setBounds(190, 50, 150, 20);

        panelKawin.add(labelKawin);
        panelKawin.add(kawinComboBox);
        //_______________________________________________________________________________________


        //_______________________________________Pekerjaan_______________________________________

        panelPekerjaan.setLayout(null);
        panelPekerjaan.setBackground(new Color(0x11bdd4));
        panelPekerjaan.setBounds(400, 140, 400, 200);

        JLabel labelPekerjaan = new JLabel("Pekerjaan : ");
        labelPekerjaan.setBounds(70, 55, 120, 30);

        JCheckBox cekKaryawanSwasta = new JCheckBox("Karyawan Swasta");
        cekKaryawanSwasta.setBounds(70, 90, 150, 20);

        JCheckBox pnsCheck = new JCheckBox("PNS");
        pnsCheck.setBounds(240, 90, 150, 20);

        JCheckBox wiraswastaCheck = new JCheckBox("Wiraswasta");
        wiraswastaCheck.setBounds(70, 120, 150, 20);

        JCheckBox akademisiCheck = new JCheckBox("Akademisi");
        akademisiCheck.setBounds(240, 120, 150, 20);

        JCheckBox pengangguranCheck = new JCheckBox("Pengangguran");
        pengangguranCheck.setBounds(70, 150, 150, 20);
        
        pengangguranCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (pengangguranCheck.isSelected()) {

                    cekKaryawanSwasta.setEnabled(false);
                    pnsCheck.setEnabled(false);
                    wiraswastaCheck.setEnabled(false);
                    akademisiCheck.setEnabled(false);

                    cekKaryawanSwasta.setSelected(false);
                    pnsCheck.setSelected(false);
                    wiraswastaCheck.setSelected(false);
                    akademisiCheck.setSelected(false);

                } else {

                    cekKaryawanSwasta.setEnabled(true);
                    pnsCheck.setEnabled(true);
                    wiraswastaCheck.setEnabled(true);
                    akademisiCheck.setEnabled(true);

                }

            }

        });


        panelPekerjaan.add(labelPekerjaan);
        panelPekerjaan.add(cekKaryawanSwasta);
        panelPekerjaan.add(pnsCheck);
        panelPekerjaan.add(wiraswastaCheck);
        panelPekerjaan.add(akademisiCheck);
        panelPekerjaan.add(pengangguranCheck);
        //_______________________________________________________________________________________


        //___________________________________Kewarganegaraan_____________________________________

        panelKewarganegaraan.setLayout(null);
        panelKewarganegaraan.setBackground(new Color(0x11bdd4));
        panelKewarganegaraan.setBounds(400, 210, 400, 200);
        
        JLabel labelKewarganegaraan = new JLabel("Kewarganegaraan : ");
        labelKewarganegaraan.setBounds(70, 65, 120, 30);

        rWNI.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        rWNA.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);

        rWNI.setActionCommand("WNI");
        rWNA.setActionCommand("WNA");

        panelKewarganegaraan.add(labelKewarganegaraan);

        kewarganegaraanButton.add(rWNI);
        kewarganegaraanButton.add(rWNA);

        panelKewarganegaraan.add(rWNI);
        panelKewarganegaraan.add(rWNA);


        // JLabel countryLabel = new JLabel("ASAL NEGARA");
        // countryLabel.setBounds(600, 320, 300, 50);
        // countryLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        // countryLabel.setVisible(false); // SET VISIBLE FALSE -> DEFAULT
        // formPanel.add(countryLabel);

        // JTextField citizenshipField = new JTextField();
        // citizenshipField.setBounds(850, 330, 300, 30);
        // citizenshipField.setVisible(false); // SET VISIBLE FALSE -> DEFAULT
        // formPanel.add(citizenshipField);

        // wnaRadio.addActionListener(new ActionListener() {

        //     public void actionPerformed(ActionEvent e) {

        //         countryLabel.setVisible(true);
        //         citizenshipField.setVisible(true);

        //     }

        // });

        // wniRadio.addActionListener(new ActionListener() {

        //     public void actionPerformed(ActionEvent e) {

        //         countryLabel.setVisible(false);
        //         citizenshipField.setVisible(false);
        //         citizenshipField.setText("");

        //     }

        // });

        //_______________________________________________________________________________________



















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
        this.add(panelAlamat);
        this.add(panelRTRW);
        this.add(panelKelDesa);
        this.add(panelKecamatan);
        this.add(panelAgama);
        this.add(panelKawin);
        this.add(panelPekerjaan);
        this.add(panelKewarganegaraan);

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