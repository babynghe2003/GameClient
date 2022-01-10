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
        this.gp = gp;
        this.keyH = keyH;
        weapon = new Weapon(gp, this, keyH, direction);
        setDefaultValues();
    }

    public BufferedImage getPlayerImage(String Path) {
        try {
            return ImageIO.read(getClass().getResourceAsStream(Path));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi file anh");
        }
        return null;
    }

    public void setDefaultValues() {
        x = (gp.screenWidth)/2; 
        y = (gp.screenHeight)/2;

    }

    public void update() {
        if (x >= 0 && y >= 0 && x <= gp.screenWidth - gp.tileSize && y <= gp.screenHeight - gp.tileSize) {
            if (keyH.upPressed && keyH.leftPressed && y > 0 && x > 0) {
                x -= speed * 3 / 4;
                y -= speed * 3 / 4;

                if (weapon.time == 0) {
                    direction = "LU";
                    // image = getPlayerImage(String.format("/sprites/AssasinMoveLeft-%s.png", gp.step));
                }
            } else if (keyH.upPressed && keyH.rightPressed && y > 0 && x < gp.screenWidth - gp.tileSize) {
                x += speed * 3 / 4;
                y -= speed * 3 / 4;

                if (weapon.time == 0) {
                    direction = "RU";
                    // image = getPlayerImage(String.format("/sprites/AssasinMoveRight-%s.png", gp.step));
                }
            } else if (keyH.downPressed && keyH.leftPressed && y < gp.screenHeight - gp.tileSize && x > 0) {
                x -= speed * 3 / 4;
                y += speed * 3 / 4;

                if (weapon.time == 0) {
                    direction = "LD";
                    // image = getPlayerImage(String.format("/sprites/AssasinMoveLeft-%s.png", gp.step));
                }
            } else if (keyH.downPressed && keyH.rightPressed && y < gp.screenHeight - gp.tileSize
                    && x < gp.screenWidth - gp.tileSize) {
                x += speed * 3 / 4;
                y += speed * 3 / 4;

                if (weapon.time == 0) {
                    direction = "RD";
                    // image = getPlayerImage(String.format("/sprites/AssasinMoveRight-%s.png", gp.step));
                }
            } else if (keyH.upPressed && y > 0) {
                y -= speed;

                if (weapon.time == 0) {
                    if (direction.charAt(0) == 'L') {
                        // image = getPlayerImage(String.format("/sprites/AssasinMoveLeft-%s.png", gp.step));
                        direction = "LU";
                    } else {
                        // image = getPlayerImage(String.format("/sprites/AssasinMoveRight-%s.png", gp.step));
                        direction = "RU";
                    }
                }
            } else if (keyH.downPressed && y < gp.screenHeight - gp.tileSize) {
                y += speed;

                if (weapon.time == 0) {
                    if (direction.charAt(0) == 'L') {
                        // image = getPlayerImage(String.format("/sprites/AssasinMoveLeft-%s.png", gp.step));
                        direction = "LD";
                    } else {
                        // image = getPlayerImage(String.format("/sprites/AssasinMoveRight-%s.png", gp.step));
                        direction = "RD";
                    }
                }
            } else if (keyH.leftPressed && x > 0) {
                x -= speed;

                if (weapon.time == 0) {
                    direction = "LL";
                    // image = getPlayerImage(String.format("/sprites/AssasinMoveLeft-%s.png", gp.step));
                }
            } else if (keyH.rightPressed && x < gp.screenWidth - gp.tileSize) {
                x += speed;

                if (weapon.time == 0) {
                    direction = "RR";
                    // image = getPlayerImage(String.format("/sprites/AssasinMoveRight-%s.png", gp.step));
                }
            } else {
                if (direction.charAt(0) == 'L') {
                    // image = getPlayerImage(String.format("/sprites/AssasinLeft-%s.png", gp.step));
                } else {
                    // image = getPlayerImage(String.format("/sprites/AssasinRight-%s.png", gp.step));
                }
            }
        } else {
            if (x < 0)
                x = 0;
            else if (x > gp.screenWidth - gp.tileSize)
                x = gp.screenWidth - gp.tileSize;
            if (y < 0)
                y = 0;
            else if (y > gp.screenHeight - gp.tileSize)
                y = gp.screenHeight - gp.tileSize;
        }
        weapon.update();
        System.out.println(x+" ");

    }


    public void draw(Graphics2D g2) {
        // g2.drawImage(image, x, y, gp.titleSize, gp.titleSize, null);
        // weapon.draw(g2);
        g2.setColor(Color.BLUE);
        g2.fillRect((gp.screenWidth - gp.tileSize)/2, (gp.screenHeight - gp.tileSize)/2, gp.tileSize, gp.tileSize);
    }

}