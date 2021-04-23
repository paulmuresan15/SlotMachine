package slotmachine;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI {
    private JPanel mainPanel;
    private JButton playButton;
    private JTextField scoreTextField;
    private JTextField creditTextField;
    private JTextField addCreditTextField;
    private JButton addMoneyButton;
    private JTextField betTextField;
    private JLabel img11;
    private JLabel img12;
    private JLabel img13;
    private JLabel img14;
    private JLabel img15;
    private JLabel img21;
    private JLabel img22;
    private JLabel img23;
    private JLabel img24;
    private JLabel img25;
    private JLabel img31;
    private JLabel img32;
    private JLabel img33;
    private JLabel img34;
    private JLabel img35;
    private JPanel panelPhotos;

    public JTextField getBetTextField() {
        return betTextField;
    }

    public void setBetTextField(JTextField betTextField) {
        this.betTextField = betTextField;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JButton getPlayButton() {
        return playButton;
    }

    public void setPlayButton(JButton playButton) {
        this.playButton = playButton;
    }

    public JTextField getScoreTextField() {
        return scoreTextField;
    }

    public void setScoreTextField(JTextField scoreTextField) {
        this.scoreTextField = scoreTextField;
    }

    public JTextField getCreditTextField() {
        return creditTextField;
    }

    public void setCreditTextField(JTextField creditTextField) {
        this.creditTextField = creditTextField;
    }

    public JTextField getAddCreditTextField() {
        return addCreditTextField;
    }

    public void setAddCreditTextField(JTextField addCreditTextField) {
        this.addCreditTextField = addCreditTextField;
    }

    public JButton getAddMoneyButton() {
        return addMoneyButton;
    }

    public void setAddMoneyButton(JButton addMoneyButton) {
        this.addMoneyButton = addMoneyButton;
    }

    public JTextField getTextField1() {
        return betTextField;
    }

    public void setTextField1(JTextField textField1) {
        this.betTextField = textField1;
    }

    public JLabel getImg11() {
        return img11;
    }

    public void setImg11(JLabel img11) {
        this.img11 = img11;
    }

    public JLabel getImg12() {
        return img12;
    }

    public void setImg12(JLabel img12) {
        this.img12 = img12;
    }

    public JLabel getImg13() {
        return img13;
    }

    public void setImg13(JLabel img13) {
        this.img13 = img13;
    }

    public JLabel getImg14() {
        return img14;
    }

    public void setImg14(JLabel img14) {
        this.img14 = img14;
    }

    public JLabel getImg15() {
        return img15;
    }

    public void setImg15(JLabel img15) {
        this.img15 = img15;
    }

    public JLabel getImg21() {
        return img21;
    }

    public void setImg21(JLabel img21) {
        this.img21 = img21;
    }

    public JLabel getImg22() {
        return img22;
    }

    public void setImg22(JLabel img22) {
        this.img22 = img22;
    }

    public JLabel getImg23() {
        return img23;
    }

    public void setImg23(JLabel img23) {
        this.img23 = img23;
    }

    public JLabel getImg24() {
        return img24;
    }

    public void setImg24(JLabel img24) {
        this.img24 = img24;
    }

    public JLabel getImg25() {
        return img25;
    }

    public void setImg25(JLabel img25) {
        this.img25 = img25;
    }

    public JLabel getImg31() {
        return img31;
    }

    public void setImg31(JLabel img31) {
        this.img31 = img31;
    }

    public JLabel getImg32() {
        return img32;
    }

    public void setImg32(JLabel img32) {
        this.img32 = img32;
    }

    public JLabel getImg33() {
        return img33;
    }

    public void setImg33(JLabel img33) {
        this.img33 = img33;
    }

    public JLabel getImg34() {
        return img34;
    }

    public void setImg34(JLabel img34) {
        this.img34 = img34;
    }

    public JLabel getImg35() {
        return img35;
    }

    public void setImg35(JLabel img35) {
        this.img35 = img35;
    }

    public JPanel getPanelPhotos() {
        return panelPhotos;
    }

    public GUI(String title) throws IOException {
        JFrame frame=new JFrame(title);
        frame.add(mainPanel);
        frame.setSize(880,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
