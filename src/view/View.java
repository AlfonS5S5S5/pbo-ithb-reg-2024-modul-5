package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import controller.controller;
import model.classessss.KTP;
import model.enummm.JenisAgama;
import model.enummm.JenisKelamin;
import model.enummm.StatusPerkawinan;

public class View {

    private File photoFile;
    private File signatureFile;

    public View(int actionValue, KTP myKtp) {

        showForm(actionValue, myKtp);

    }

    public void showForm(int actionValue, KTP myKtp) {

        //_____________________________Screen__________________________
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize(); //screen size

        int widthScreen = screen.width; //width
        int heightScreen = screen.height; //height

        final int FRAME_WIDTH = 1200; //width
        final int FRAME_HEIGHT = 800; // height

        int start_x = widthScreen / 2 - (FRAME_WIDTH / 2);
        int start_y = heightScreen / 2 - (FRAME_HEIGHT / 2);
        //_______________________________________________________________

        JFrame myFrame = new JFrame("Form KTP");

        myFrame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelKTP = new JPanel();
        panelKTP.setLayout(null);
        panelKTP.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        JLabel nikLabel = new JLabel("NIK");
        nikLabel.setBounds(50, 50, 200, 50);
        panelKTP.add(nikLabel);

        JTextField nikField = new JTextField();
        nikField.setBounds(250, 60, 300, 30);
        panelKTP.add(nikField);

        JLabel namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 100, 200, 50);
        panelKTP.add(namaLabel);

        JTextField namaField = new JTextField();
        namaField.setBounds(250, 110, 300, 30);
        panelKTP.add(namaField);

        JLabel tempatLahirLabel = new JLabel("Tempat Lahir");
        tempatLahirLabel.setBounds(50, 150, 200, 50);
        panelKTP.add(tempatLahirLabel);

        JTextField tempatLahirField = new JTextField();
        tempatLahirField.setBounds(250, 160, 300, 30);
        panelKTP.add(tempatLahirField);

        JLabel tglLahirLabel = new JLabel("Tanggal Lahir");
        tglLahirLabel.setBounds(50, 200, 200, 50);
        panelKTP.add(tglLahirLabel);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        datePicker.setBounds(250, 210, 300, 30);
        panelKTP.add(datePicker);

        JLabel genderLabel = new JLabel("Jenis Kelamin");
        genderLabel.setBounds(50, 250, 200, 50);
        panelKTP.add(genderLabel);

        JRadioButton rPria = new JRadioButton("Pria");
        JRadioButton rWanita = new JRadioButton("Wanita");

        rPria.setBounds(250, 250, 90, 50);
        rWanita.setBounds(340, 250, 100, 50);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rPria);
        genderGroup.add(rWanita);

        panelKTP.add(rPria);
        panelKTP.add(rWanita);

        JLabel golDarahLabel = new JLabel("Gol.Darah");
        golDarahLabel.setBounds(50, 300, 200, 50);
        panelKTP.add(golDarahLabel);

        JRadioButton aRadio = new JRadioButton("A");
        JRadioButton bRadio = new JRadioButton("B");
        JRadioButton oRadio = new JRadioButton("O");
        JRadioButton abRadio = new JRadioButton("AB");

        aRadio.setBounds(250, 300, 50, 50);
        bRadio.setBounds(340, 300, 50, 50);
        oRadio.setBounds(430, 300, 50, 50);
        abRadio.setBounds(510, 300, 50, 50);

        ButtonGroup golDarahGroup = new ButtonGroup();
        golDarahGroup.add(aRadio);
        golDarahGroup.add(bRadio);
        golDarahGroup.add(oRadio);
        golDarahGroup.add(abRadio);

        aRadio.setActionCommand("A");
        bRadio.setActionCommand("B");
        oRadio.setActionCommand("O");
        abRadio.setActionCommand("AB");

        panelKTP.add(aRadio);
        panelKTP.add(bRadio);
        panelKTP.add(oRadio);
        panelKTP.add(abRadio);

        JLabel alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(50, 350, 200, 50);
        panelKTP.add(alamatLabel);

        JTextField alamatField = new JTextField();
        alamatField.setBounds(250, 360, 300, 30);
        panelKTP.add(alamatField);

        JLabel rtLabel = new JLabel("RT");
        rtLabel.setBounds(250, 400, 50, 50);
        panelKTP.add(rtLabel);

        JTextField rtField = new JTextField();
        rtField.setBounds(300, 410, 50, 30);
        panelKTP.add(rtField);

        JLabel rwLabel = new JLabel("RW");
        rwLabel.setBounds(450, 400, 50, 50);
        panelKTP.add(rwLabel);

        JTextField rwField = new JTextField();
        rwField.setBounds(500, 410, 50, 30);
        panelKTP.add(rwField);

        JLabel kelurahanLabel = new JLabel("Kel/Desa");
        kelurahanLabel.setBounds(50, 450, 200, 50);
        panelKTP.add(kelurahanLabel);

        JTextField kelurahanField = new JTextField();
        kelurahanField.setBounds(250, 460, 300, 30);
        panelKTP.add(kelurahanField);

        JLabel kecamatanLabel = new JLabel("Kecamatan");
        kecamatanLabel.setBounds(50, 500, 200, 50);
        panelKTP.add(kecamatanLabel);

        JTextField kecamatanField = new JTextField();
        kecamatanField.setBounds(250, 510, 300, 30);
        panelKTP.add(kecamatanField);

        // -------------------------------- Kanan --------------------------------

        JLabel agamaLabel = new JLabel("Agama");
        agamaLabel.setBounds(600, 50, 200, 50);
        panelKTP.add(agamaLabel);

        JComboBox<String> agamaComboBox = new JComboBox<>();
        agamaComboBox.addItem("Katolik");
        agamaComboBox.addItem("Kristen");
        agamaComboBox.addItem("Hindu");
        agamaComboBox.addItem("Buddha");
        agamaComboBox.addItem("Konghucu");
        agamaComboBox.addItem("Islam");

        agamaComboBox.setBounds(850, 60, 300, 30);
        panelKTP.add(agamaComboBox);

        JLabel statusPerkawinanLabel = new JLabel("Status Perkawinan");
        statusPerkawinanLabel.setBounds(600, 100, 300, 50);
        panelKTP.add(statusPerkawinanLabel);

        JComboBox<String> perkawinanBox = new JComboBox<>();
        perkawinanBox.addItem("Menikah");
        perkawinanBox.addItem("Janda");
        perkawinanBox.addItem("Duda");
        perkawinanBox.addItem("Belum Menikah");

        perkawinanBox.setBounds(850, 110, 300, 30);
        panelKTP.add(perkawinanBox);

        JLabel pekerjaanLabel = new JLabel("Pekerjaan");
        pekerjaanLabel.setBounds(600, 150, 300, 50);
        panelKTP.add(pekerjaanLabel);

        JCheckBox karyawanSwastaCheck = new JCheckBox("Karyawan Swasta");
        karyawanSwastaCheck.setBounds(850, 150, 150, 50);

        JCheckBox pnsCheck = new JCheckBox("PNS");
        pnsCheck.setBounds(1000, 150, 150, 50);

        JCheckBox wiraswastaCheck = new JCheckBox("Wiraswasta");
        wiraswastaCheck.setBounds(850, 190, 150, 50);

        JCheckBox akademisiCheck = new JCheckBox("Akademisi");
        akademisiCheck.setBounds(1000, 190, 150, 50);

        JCheckBox pengangguranCheck = new JCheckBox("Pengangguran");
        pengangguranCheck.setBounds(850, 230, 150, 50);

        panelKTP.add(karyawanSwastaCheck);
        panelKTP.add(pnsCheck);
        panelKTP.add(wiraswastaCheck);
        panelKTP.add(akademisiCheck);
        panelKTP.add(pengangguranCheck);
        pengangguranCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (pengangguranCheck.isSelected()) {
                    karyawanSwastaCheck.setEnabled(false);
                    pnsCheck.setEnabled(false);
                    wiraswastaCheck.setEnabled(false);
                    akademisiCheck.setEnabled(false);

                    karyawanSwastaCheck.setSelected(false);
                    pnsCheck.setSelected(false);
                    wiraswastaCheck.setSelected(false);
                    akademisiCheck.setSelected(false);
                } else {
                    karyawanSwastaCheck.setEnabled(true);
                    pnsCheck.setEnabled(true);
                    wiraswastaCheck.setEnabled(true);
                    akademisiCheck.setEnabled(true);
                }
            }
        });

        JLabel citizenshipLabel = new JLabel("Kewarganegaraan");
        citizenshipLabel.setBounds(600, 280, 300, 50);
        panelKTP.add(citizenshipLabel);

        JRadioButton rWNI = new JRadioButton("WNI");
        JRadioButton rWNA = new JRadioButton("WNA");

        rWNI.setBounds(850, 280, 100, 50);
        rWNA.setBounds(1000, 280, 100, 50);

        rWNI.setActionCommand("WNI");
        rWNA.setActionCommand("WNA");

        ButtonGroup citizenshipGroup = new ButtonGroup();
        citizenshipGroup.add(rWNI);
        citizenshipGroup.add(rWNA);

        panelKTP.add(rWNI);
        panelKTP.add(rWNA);

        JLabel countryLabel = new JLabel("Asal Negara");
        countryLabel.setBounds(600, 320, 300, 50);
        countryLabel.setVisible(false);
        panelKTP.add(countryLabel);

        JTextField citizenshipField = new JTextField();
        citizenshipField.setBounds(850, 330, 300, 30);
        citizenshipField.setVisible(false);
        panelKTP.add(citizenshipField);

        rWNA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countryLabel.setVisible(true);
                citizenshipField.setVisible(true);
            }
        });

        rWNI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countryLabel.setVisible(false);
                citizenshipField.setVisible(false);
                citizenshipField.setText("");
            }
        });

        JLabel photoLabel = new JLabel("Foto");
        photoLabel.setBounds(600, 380, 100, 50);
        panelKTP.add(photoLabel);

        JButton photoButton = new JButton("Upload Photo");
        photoButton.setBounds(850, 380, 300, 40);
        panelKTP.add(photoButton);

        photoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    photoFile = fileChooser.getSelectedFile();
                }
            }
        });

        JLabel signatureLabel = new JLabel("Tanda Tangan");
        signatureLabel.setBounds(600, 450, 200, 50);
        panelKTP.add(signatureLabel);

        JButton signatureButton = new JButton("Upload Signature");
        signatureButton.setBounds(850, 450, 300, 40);
        panelKTP.add(signatureButton);

        signatureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    signatureFile = fileChooser.getSelectedFile();
                }
            }
        });

        JLabel tglBerlakuLabel = new JLabel("Berlaku Hingga");
        tglBerlakuLabel.setBounds(600, 500, 200, 50);
        panelKTP.add(tglBerlakuLabel);

        JTextField tglBerlakuField = new JTextField();
        tglBerlakuField.setBounds(850, 510, 300, 30);
        panelKTP.add(tglBerlakuField);

        JLabel kotaPembuatanLabel = new JLabel("Kota Pembuatan");
        kotaPembuatanLabel.setBounds(600, 550, 200, 50);
        panelKTP.add(kotaPembuatanLabel);

        JTextField kotaPembuatanField = new JTextField();
        kotaPembuatanField.setBounds(850, 560, 300, 30);
        panelKTP.add(kotaPembuatanField);

        JLabel tglPembuatanLabel = new JLabel("Tanggal Pembuatan");
        tglPembuatanLabel.setBounds(600, 600, 220, 50);
        panelKTP.add(tglPembuatanLabel);

        UtilDateModel tglBuatmodel = new UtilDateModel();
        Properties tglBuatProperties = new Properties();
        JDatePanelImpl tglBuatPanel = new JDatePanelImpl(tglBuatmodel, tglBuatProperties);
        JDatePickerImpl tglBuatPicker = new JDatePickerImpl(tglBuatPanel, new DateLabelFormatter());

        tglBuatPicker.setBounds(850, 610, 300, 30);
        panelKTP.add(tglBuatPicker);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(950, 660, 200, 30);
        panelKTP.add(submitButton);

        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (controller.checkInput(nikField, namaField, tempatLahirField, genderGroup, golDarahGroup,
                        alamatField, rtField, rwField, kelurahanField, kecamatanField, agamaComboBox, perkawinanBox,
                        karyawanSwastaCheck, pnsCheck, wiraswastaCheck, akademisiCheck, pengangguranCheck,
                        citizenshipGroup, citizenshipField, photoFile, signatureFile, tglBerlakuField,
                        kotaPembuatanField)) {

                    String nik = nikField.getText();
                    String nama = namaField.getText();
                    String tempatLahir = tempatLahirField.getText();

                    JenisKelamin jenisKelamin = rPria.isSelected() ? JenisKelamin.PRIA : JenisKelamin.WANITA;
                    String golDarah = golDarahGroup.getSelection().getActionCommand();
                    String alamat = alamatField.getText();
                    String rt = rtField.getText();
                    String rw = rwField.getText();
                    String kelDesa = kelurahanField.getText();
                    String kecamatan = kecamatanField.getText();
                    JenisAgama agama = controller.getJenisAgama(String.valueOf(agamaComboBox.getSelectedItem()));
                    StatusPerkawinan statusPerkawinan = controller.getStatusPerkawinan(String.valueOf(perkawinanBox.getSelectedItem()));
                    String pekerjaan = controller.getSelectedJobs(karyawanSwastaCheck, pnsCheck, wiraswastaCheck, akademisiCheck, pengangguranCheck);
                    String wargaNegaraAsal = rWNA.isSelected() ? citizenshipField.getText() : null;
                    String kewarganegaraan = controller.getCitizenship(citizenshipGroup.getSelection().getActionCommand(), wargaNegaraAsal);
                    String berlakuHingga = tglBerlakuField.getText();
                    String kotaPembuatan = kotaPembuatanField.getText();

                    // Date tanggalPembuatan = (Date) tglBuatPicker.getModel().getValue();
                    // LocalDate tanggalPembuatanlocalDate = tanggalPembuatan.toInstant()
                    // .atZone(ZoneId.systemDefault())
                    // .toLocalDate();
                    // String tanggalPembuatanlocalDateFormatted = tanggalPembuatanlocalDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    
                    KTP ktp = controller.createKTP(nik, nama, tempatLahir, jenisKelamin, golDarah, alamat, rt, rw, kelDesa, kecamatan, agama, statusPerkawinan,
                    pekerjaan, kewarganegaraan, wargaNegaraAsal, photoFile, signatureFile, berlakuHingga, kotaPembuatan, 1);

                    myFrame.dispose();
                    new outputKTP(ktp);
                }
                else {
                    JOptionPane.showMessageDialog(myFrame, "Semua field harus diisi", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton mainMenuButton = new JButton("Balik ke Main Menu");
        mainMenuButton.setBounds(50, 660, 250, 30);
        panelKTP.add(mainMenuButton);

        mainMenuButton.addActionListener(e -> {
            myFrame.dispose();
        });

        if (actionValue == 1) {
            submitButton.setVisible(true);
        }
        else {
            submitButton.setVisible(false);

            nikField.setText(myKtp.getNik());
            namaField.setText(myKtp.getNama());
            tempatLahirField.setText(myKtp.getTempatLahir());

            // String tanggalLahirString = myKtp.getTanggalLahir();
            // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            // LocalDate tanggalLahirLocalDate = LocalDate.parse(tanggalLahirString, formatter);
            // Date tanggalLahir = Date.from(tanggalLahirLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            // model.setValue(tanggalLahir);


            if (myKtp.getJenisKelamin() == JenisKelamin.PRIA) {
                rPria.setSelected(true);
            }
            else {
                rWanita.setSelected(true);
            }

            String golDarah = myKtp.getGolDarah();

            switch (golDarah) {
                case "A":
                    aRadio.setSelected(true);
                    break;
                case "B":
                    bRadio.setSelected(true);
                    break;
                case "O":
                    oRadio.setSelected(true);
                    break;
                case "AB":
                    abRadio.setSelected(true);
                    break;
            }

            alamatField.setText(myKtp.getAlamat());
            rtField.setText(myKtp.getRt());
            rwField.setText(myKtp.getRw());
            kelurahanField.setText(myKtp.getKelDesa());
            kecamatanField.setText(myKtp.getKecamatan());

            agamaComboBox.setSelectedItem(myKtp.getAgama().toString());

            perkawinanBox.setSelectedItem(myKtp.getStatusPerkawinan().toString());

            String[] listJobs = controller.setSelectedJobs(myKtp.getPekerjaan());

            for (int i = 0; i < listJobs.length; i++) {
                switch (listJobs[i]) {
                    case "KARYAWAN SWASTA":
                        karyawanSwastaCheck.setSelected(true);
                        break;
                    case "PNS":
                        pnsCheck.setSelected(true);
                        break;
                    case "WIRASWASTA":
                        wiraswastaCheck.setSelected(true);
                        break;
                    case "AKADEMISI":
                        akademisiCheck.setSelected(true);
                        break;
                    case "PENGANGGURAN":
                        pengangguranCheck.setSelected(true);
                        break;
                }
            }

            String kewarganegaraan = myKtp.getKewarganegaraan();
            if (kewarganegaraan.equals("WNI")) {
                rWNI.setSelected(true);
                citizenshipField.setVisible(false);
            }
            else {
                rWNA.setSelected(true);
                citizenshipField.setVisible(true);
                citizenshipField.setText(myKtp.getWargaNegaraAsal());
            }

            photoFile = myKtp.getFotoFilePath();
            signatureFile = myKtp.getTandaTanganFilePath();

            tglBerlakuField.setText(myKtp.getBerlakuHingga());
            kotaPembuatanField.setText(myKtp.getKotaPembuatan());

            // String tanggalPembuatanString = myKtp.getTanggalPembuatan();
            // DateTimeFormatter tanggalPembuatanformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            // LocalDate tanggalPembuatanLocalDate = LocalDate.parse(tanggalPembuatanString, tanggalPembuatanformatter);
            // Date tanggalPembuatan = Date.from(tanggalPembuatanLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            // tglBuatmodel.setValue(tanggalPembuatan);

        }

        myFrame.add(panelKTP);

        myFrame.setVisible(true);

    }

}