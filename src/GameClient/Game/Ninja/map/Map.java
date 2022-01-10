package GameClient.Game.Ninja.map;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

import GameClient.Game.Ninja.entity.Player;
import GameClient.Game.Ninja.gameMain.KeyHandler;
import GameClient.Game.Ninja.gameMain.NinjaPanel;

import java.util.ArrayList;

import java.awt.*;

public class Map {

    Player player;
    NinjaPanel gp;
    Tile[] Maps;
    KeyHandler keyH;

    int Mapx;
    int Mapy;

    public Map(NinjaPanel gp, Player player,KeyHandler keyH) {
        this.keyH = keyH;
        this.player = player;
        Maps = new Tile[10];
        this.gp = gp;
        getTitle();
        setDefaultValues();

    }

    public void setDefaultValues() {

        Mapx = 0;
        Mapy = 0;
    }

    private void getTitle() {
        try {
            Maps[0] = new Tile();
            Maps[0].image = ImageIO.read(getClass().getResourceAsStream("./Map-Floor-1.png"));

            Maps[1] = new Tile();
            Maps[1].image = ImageIO.read(getClass().getResourceAsStream("./Map-Floor-2.png"));

            Maps[2] = new Tile();
            Maps[2].image = ImageIO.read(getClass().getResourceAsStream("./Map-wall-1.png"));

            Maps[3] = new Tile();
            Maps[3].image = ImageIO.read(getClass().getResourceAsStream("./Map-wall-2.png"));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Loi nhap map");
        }
    }

    public void update(){
        Mapx=gp.screenWidth - player.x - gp.tileSize*2; 
        Mapy=gp.screenHeight - player.y - gp.tileSize*2; 
    }

    public void draw(Graphics2D g2) {
        update();

        g2.drawImage(Maps[2].image, Mapx + 0, Mapy + 0, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + 0, Mapy + 0, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 1, Mapy + 0, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 2, Mapy + 0, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 3, Mapy + 0, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 4, Mapy + 0, gp.tileSize / 2, gp.tileSize / 2, null);

        g2.drawImage(Maps[2].image, Mapx + 0, Mapy + gp.tileSize / 2*1, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[1].image, Mapx + gp.tileSize / 2 * 1, Mapy + gp.tileSize / 2*1, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[0].image, Mapx + gp.tileSize / 2 * 2, Mapy + gp.tileSize / 2*1, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[1].image, Mapx + gp.tileSize / 2 * 3, Mapy + gp.tileSize / 2*1, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*1, gp.tileSize / 2, gp.tileSize / 2, null);

        g2.drawImage(Maps[2].image, Mapx + 0, Mapy + gp.tileSize / 2*2, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[1].image, Mapx + gp.tileSize / 2 * 1, Mapy + gp.tileSize / 2*2, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[0].image, Mapx + gp.tileSize / 2 * 2, Mapy + gp.tileSize / 2*2, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[1].image, Mapx + gp.tileSize / 2 * 3, Mapy + gp.tileSize / 2*2, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*2, gp.tileSize / 2, gp.tileSize / 2, null);

        g2.drawImage(Maps[2].image, Mapx + 0, Mapy + gp.tileSize / 2*3, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[1].image, Mapx + gp.tileSize / 2 * 1, Mapy + gp.tileSize / 2*3, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[0].image, Mapx + gp.tileSize / 2 * 2, Mapy + gp.tileSize / 2*3, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[1].image, Mapx + gp.tileSize / 2 * 3, Mapy + gp.tileSize / 2*3, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*3, gp.tileSize / 2, gp.tileSize / 2, null);

        g2.drawImage(Maps[2].image, Mapx + 0, Mapy + gp.tileSize / 2*4, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 1, Mapy + gp.tileSize / 2*4 , gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 2, Mapy + gp.tileSize / 2*4 , gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 3, Mapy + gp.tileSize / 2*4 , gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[2].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*4 , gp.tileSize / 2, gp.tileSize / 2, null);

        g2.drawImage(Maps[3].image, Mapx + 0, Mapy + 0 - 45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + 0, Mapy + 0 - 45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 1, Mapy + 0 - 45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 2, Mapy + 0 - 45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 3, Mapy + 0 - 45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 4, Mapy + 0 - 45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + 0, Mapy + gp.tileSize / 2*1 -45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*1-45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + 0, Mapy + gp.tileSize / 2*2-45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*2-45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + 0, Mapy + gp.tileSize / 2*3-45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*3-45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + 0, Mapy + gp.tileSize / 2*4-45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 1, Mapy + gp.tileSize / 2*4 -45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 2, Mapy + gp.tileSize / 2*4 -45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 3, Mapy + gp.tileSize / 2*4 -45, gp.tileSize / 2, gp.tileSize / 2, null);
        g2.drawImage(Maps[3].image, Mapx + gp.tileSize / 2 * 4, Mapy + gp.tileSize / 2*4 -45, gp.tileSize / 2, gp.tileSize / 2, null);



    }

}
