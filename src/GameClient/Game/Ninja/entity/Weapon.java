package GameClient.Game.Ninja.entity;

import GameClient.Game.Ninja.gameMain.NinjaPanel;
import GameClient.Game.Ninja.gameMain.KeyHandler;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Weapon extends Entity {
    NinjaPanel gp;
    Player player;
    KeyHandler keyH;

    // BufferedImage sword = getPlayerImage("/sprites/ciuCuaMai.png");
    // BufferedImage cut1 = getPlayerImage("/sprites/cut-1.png"),
    //         cut2 = getPlayerImage("/sprites/cut-2.png"),
    //         cut3 = getPlayerImage("/sprites/cut-3.png"),
    //         cut4 = getPlayerImage("/sprites/cut-4.png");

    double rota = 30;
    boolean flip = false;

    long timers;
    long time;

    boolean attack = false;
    int attackStep = 0;

    public Weapon(NinjaPanel gp, Player player, KeyHandler keyH, String direction) {
        this.gp = gp;
        this.player = player;
        this.keyH = keyH;
        this.direction = direction;
        setDefaultValues();
    }

    public BufferedImage getPlayerImage(String Path) {
        try {
            return ImageIO.read(getClass().getResourceAsStream(Path));
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("loi file anh weapon");
        }
        return null;
    }

    public void setDefaultValues() {
  

    }

    public void update() {
        // this.x = player.x;
        // this.y = player.y;
        // this.direction = player.direction;
        // this.timers = gp.currentTime;
        

    }

    public void draw(Graphics2D g2) {

        

    }

}
