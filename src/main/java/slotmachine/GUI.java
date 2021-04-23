package slotmachine;

import javax.swing.*;
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


    public JLabel getImg11() {
        return img11;
    }

    public JLabel getImg12() {
        return img12;
    }

    public JLabel getImg13() {
        return img13;
    }

    public JLabel getImg14() {
        return img14;
    }

    public JLabel getImg15() {
        return img15;
    }

    public JLabel getImg21() {
        return img21;
    }

    public JLabel getImg22() {
        return img22;
    }

    public JLabel getImg23() {
        return img23;
    }

    public JLabel getImg24() {
        return img24;
    }

    public JLabel getImg25() {
        return img25;
    }

    public JLabel getImg31() {
        return img31;
    }

    public JLabel getImg32() {
        return img32;
    }

    public JLabel getImg33() {
        return img33;
    }

    public JLabel getImg34() {
        return img34;
    }

    public JLabel getImg35() {
        return img35;
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
