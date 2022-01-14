package GameClient.Game.Ninja.entity;

import GameClient.Game.Ninja.gameMain.NinjaPanel;
import GameClient.Game.Ninja.gameMain.KeyHandler;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.geom.AffineTransform;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {

    public int hearts = 8;

    NinjaPanel gp;
    KeyHandler keyH;

    BufferedImage image = null;
    Weapon weapon;

    boolean left = false;
    int step = 1;

    public Player(NinjaPanel gp, KeyHandler keyH) {
        System.out.println("player da mo");
        this.gp = gp;
        this.keyH = keyH;
        weapon = new Weapon(gp, this, keyH, direction);
        setDefaultValues();
    }

    public BufferedImage getPlayerImage(String Path) {
        try {
            return ImageIO.read(getClass().getResourceAsStream(Path));
        } catch (Exception e) {
            System.out.println("loi file player anh");
        }
        return null;
    }

    public void setDefaultValues() {
        x = (gp.screenWidth - gp.tileSize)/2; 
        y = (gp.screenHeight - gp.tileSize)/2;
        image = getPlayerImage("./sprites/AssasinRight-1.png");

        Collisions = new Rectangle(x + gp.tileSize/4,y+gp.tileSize/2, gp.tileSize/2,gp.tileSize/2);


    }

    public void update() {

        if (keyH.leftPressed){
            left = true;
        }
        if (keyH.rightPressed){
            left = false;
        }

        if (gp.timer <= 125000000){
            step = 1;
        }else if (gp.timer <= 250000000){
            step = 2;
        }else if (gp.timer <= 375000000) {
            step = 3;
        }else if (gp.timer <= 500000000) {
            step = 4;
        }else if (gp.timer <= 625000000) {
            step = 1;
        }else if (gp.timer <= 750000000){
            step = 2;
        }else if (gp.timer <= 875000000){
            step = 3;
        }else if (gp.timer <= 1000000000) {
            step = 4;
        }
        
        if (!keyH.stand){
            image = getPlayerImage(String.format("./sprites/BabyDragon-%s.png",step));
        }else
        image = getPlayerImage(String.format("./sprites/BabyDragonRun-%s.png",step));
        weapon.update();
    }


    public void draw(Graphics2D g2) {
        if (left){
            g2.drawImage(image, x + gp.tileSize , y, -gp.tileSize, gp.tileSize, null);
        } else 
        g2.drawImage(image, x , y, gp.tileSize, gp.tileSize, null);

        // weapon.draw(g2);
    }

}