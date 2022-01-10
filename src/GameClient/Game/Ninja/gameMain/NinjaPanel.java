package GameClient.Game.Ninja.gameMain;


import javax.swing.*;

import GameClient.Game.Ninja.entity.Player;
import GameClient.Game.Ninja.entity.Weapon;
import GameClient.Game.Ninja.map.Map;

import java.awt.*;

public class NinjaPanel extends JPanel implements Runnable {

    public final int originalTileSize = 32;
    public final int scale = 3;

    public final int tileSize = originalTileSize * scale;
    public final int maxScreenWidth = 16;
    public final int maxScreenHeight = 12;
    public final int screenWidth = tileSize*maxScreenWidth;
    public final int screenHeight = tileSize*maxScreenHeight; // 768*576 px

    KeyHandler  keyH = new KeyHandler();;
    Thread      gameThread;
    Player      player;
    Map         map;

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 8;

    int mouth = 300;
    public int step;

    int FPS;
    public long timer = 0;
    public long currentTime;

    public NinjaPanel() {
        System.out.println("panel");
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(new Color(133, 58, 4));
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        start();
    }

    public void start() {

        
        player = new Player(this, keyH);
        map = new Map(this, player, keyH);

        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / 60;
        double delta = 0;
        long lastTime = System.nanoTime();
        int drawCount = 0;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;
            if (delta > 0) {
                Update();
                repaint();
                delta--;
                drawCount++;
            }
            if (timer >= 1000000000) {
                FPS = drawCount;
                drawCount = 0;
                timer = 0;
            }

        }
    }

    public void Update() {
        player.update();
        

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        map.draw(g2);

        player.draw(g2);

        map.drawWall(g2);
            

        

    }

}