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

    BufferedImage sword;
    BufferedImage cut;

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
        
        sword = getPlayerImage("./sprites/BloodKatana.png");

    }

    public void update() {
        
        rota = 15;
        

    }

    public void draw(Graphics2D g2) {

        g2.rotate(Math.toRadians(-rota), player.x+gp.tileSize/2+ gp.tileSize*5/32, player.y +gp.tileSize/5*2+ gp.tileSize*14/32);

        g2.drawImage(sword, player.x+gp.tileSize/2, player.y +gp.tileSize/5*2, gp.tileSize, gp.tileSize, null);

        g2.rotate(Math.toRadians(rota), player.x+gp.tileSize/2+ gp.tileSize*5/32, player.y +gp.tileSize/5*2+ gp.tileSize*14/32);

        
    }

}
