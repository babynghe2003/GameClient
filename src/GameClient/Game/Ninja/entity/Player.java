package GameClient.Game.Ninja.entity;

import GameClient.Game.Ninja.gameMain.NinjaPanel;
import GameClient.Game.Ninja.gameMain.KeyHandler;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.geom.AffineTransform;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity {

    NinjaPanel gp;
    KeyHandler keyH;

    BufferedImage image = null;
    Weapon weapon;

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
        x = (gp.screenWidth)/2; 
        y = (gp.screenHeight)/2;
        image = getPlayerImage("./sprites/AssasinRight-1.png");


    }

    public void update() {
        
        weapon.update();
    }


    public void draw(Graphics2D g2) {
        g2.drawImage(image, (gp.screenWidth)/2, (gp.screenHeight)/2 , gp.tileSize, gp.tileSize, null);
        weapon.draw(g2);
    }

}