package slotmachine;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        GUI gui=new GUI("Pacanele tati");
        SlotMachine slotMachine=new SlotMachine(gui);
        slotMachine.initSlotMachine();
    }
}
