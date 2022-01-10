package GameClient.Game.Ninja.gameMain;

import javax.swing.JFrame;

public class NinjaFrame extends JFrame {
    public NinjaFrame(){
        System.out.println("Ninja da mo");
        this.add(new NinjaPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("SoulKnight fake");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
