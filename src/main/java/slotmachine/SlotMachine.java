package slotmachine;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

public class SlotMachine {
    private GUI gui;
    private List<ImageIcon> imageIconList = new ArrayList<>();
    private ImageIcon placeholder = new ImageIcon("slotimages/placeholder.png");

    public SlotMachine(GUI gui) {
        this.gui = gui;
        imageIconList.add(new ImageIcon("src/main/resources/slotimages/pacanele_cirese.png"));
        imageIconList.add(new ImageIcon("src/main/resources/slotimages/pacanele_lebenita.png"));
        imageIconList.add(new ImageIcon("src/main/resources/slotimages/pacanele_portocala.png"));
        imageIconList.add(new ImageIcon("src/main/resources/slotimages/pacanele_pruna.png"));
        imageIconList.add(new ImageIcon("src/main/resources/slotimages/pacanele_saptar.png"));
    }

    public void initSlotMachine() {
        gui.getMainPanel().setBackground(new Color(3, 0, 34));
        gui.getPanelPhotos().setBackground(new Color(3, 0, 34));
        initImages();
        gui.getAddMoneyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int credit = Integer.parseInt(gui.getCreditTextField().getText());
                int addedCredit = Integer.parseInt(gui.getAddCreditTextField().getText());
                if(addedCredit==0){
                    try {
                        playError();
                    } catch (LineUnavailableException | IOException | UnsupportedAudioFileException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    }
                }
                else {
                    gui.getCreditTextField().setText(credit + addedCredit + "");
                    try {
                        playKaching();
                    } catch (LineUnavailableException | IOException | UnsupportedAudioFileException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    }
                }
            }
        });
        gui.getPlayButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(gui.getCreditTextField().getText())>=Integer.parseInt(gui.getBetTextField().getText()) && Integer.parseInt(gui.getCreditTextField().getText())!=0 && Integer.parseInt(gui.getBetTextField().getText())!=0) {
                    playSlots();
                    try {
                        playCasinoSound();
                    } catch (LineUnavailableException | UnsupportedAudioFileException | IOException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    }
                }
                else
                {
                    try {
                        playError();
                    } catch (LineUnavailableException | IOException | UnsupportedAudioFileException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    }
                }
            }


        });

    }

    public Integer calculateScore(int mid1, int mid2, int mid3, int mid4, int mid5) {
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        scores.add(mid1);
        scores.add(mid2);
        scores.add(mid3);
        scores.add(mid4);
        scores.add(mid5);
        int count0 = Collections.frequency(scores, 0);
        int count1 = Collections.frequency(scores, 1);
        int count2 = Collections.frequency(scores, 2);
        int count3 = Collections.frequency(scores, 3);
        int count4 = Collections.frequency(scores, 4);
        counts.add(count0);
        counts.add(count1);
        counts.add(count2);
        counts.add(count3);
        counts.add(count4);
        Integer max = counts.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
        return max;
    }
    public void initImages(){
        gui.getImg11().setIcon(placeholder);
        gui.getImg12().setIcon(placeholder);
        gui.getImg13().setIcon(placeholder);
        gui.getImg14().setIcon(placeholder);
        gui.getImg15().setIcon(placeholder);
        gui.getImg21().setIcon(placeholder);
        gui.getImg22().setIcon(placeholder);
        gui.getImg23().setIcon(placeholder);
        gui.getImg24().setIcon(placeholder);
        gui.getImg25().setIcon(placeholder);
        gui.getImg31().setIcon(placeholder);
        gui.getImg32().setIcon(placeholder);
        gui.getImg33().setIcon(placeholder);
        gui.getImg34().setIcon(placeholder);
        gui.getImg35().setIcon(placeholder);
    }
    public void playSlots()
    {
        int imageIndex11 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex12 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex13 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex14 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex15 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex21 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex22 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex23 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex24 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex25 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex31 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex32 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex33 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex34 = ThreadLocalRandom.current().nextInt(0, 5);
        int imageIndex35 = ThreadLocalRandom.current().nextInt(0, 5);
        gui.getImg11().setIcon(imageIconList.get(imageIndex11));
        gui.getImg12().setIcon(imageIconList.get(imageIndex12));
        gui.getImg13().setIcon(imageIconList.get(imageIndex13));
        gui.getImg14().setIcon(imageIconList.get(imageIndex14));
        gui.getImg15().setIcon(imageIconList.get(imageIndex15));
        gui.getImg21().setIcon(imageIconList.get(imageIndex21));
        gui.getImg22().setIcon(imageIconList.get(imageIndex22));
        gui.getImg23().setIcon(imageIconList.get(imageIndex23));
        gui.getImg24().setIcon(imageIconList.get(imageIndex24));
        gui.getImg25().setIcon(imageIconList.get(imageIndex25));
        gui.getImg31().setIcon(imageIconList.get(imageIndex31));
        gui.getImg32().setIcon(imageIconList.get(imageIndex32));
        gui.getImg33().setIcon(imageIconList.get(imageIndex33));
        gui.getImg34().setIcon(imageIconList.get(imageIndex34));
        gui.getImg35().setIcon(imageIconList.get(imageIndex35));
        int credit = Integer.parseInt(gui.getCreditTextField().getText());
        int bet = Integer.parseInt(gui.getBetTextField().getText());
        int score = calculateScore(imageIndex21, imageIndex22, imageIndex23, imageIndex24, imageIndex25);
        int newCredit = credit + score*bet;
        if(score>=3) {
            gui.getScoreTextField().setText(score*bet  + "");
            gui.getCreditTextField().setText(String.valueOf(newCredit));
        }
        else
        {
            gui.getScoreTextField().setText("You lost "+bet);
            gui.getCreditTextField().setText(String.valueOf(credit-bet));
        }

    }
    public void playCasinoSound() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        String soundName = "src/main/resources/casinosound.wav";
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    }
    public void playKaching() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        String soundName = "src/main/resources/kaching.wav";
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    }
    public void playError() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        String soundName = "src/main/resources/errorsound.wav";
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    }
}
