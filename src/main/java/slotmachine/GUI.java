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



    public JPanel getMainPanel() {
        return mainPanel;
    }



    public JButton getPlayButton() {
        return playButton;
    }



    public JTextField getScoreTextField() {
        return scoreTextField;
    }


    public JTextField getCreditTextField() {
        return creditTextField;
    }

    public JTextField getAddCreditTextField() {
        return addCreditTextField;
    }


    public JButton getAddMoneyButton() {
        return addMoneyButton;
    }







    public JPanel getPanelPhotos() {
        return panelPhotos;
    }

    public GUI(String title) throws IOException {
        JFrame frame=new JFrame(title);
        frame.add(mainPanel);
        frame.setSize(880,550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
