package GameClient.Game.Ninja.map;

import java.io.*;
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
    KeyHandler keyH;

    Tile[] tiles;
    Tile[][] Maps;

    int col;
    int row;

    int Mapx;
    int Mapy;

    public Map(NinjaPanel gp, Player player, KeyHandler keyH) {
        System.out.println("Map da mo");
        this.keyH = keyH;
        this.player = player;
        tiles = new Tile[10];
        this.gp = gp;
        getTitle();
        setDefaultValues();
        loadMap();

    }

    public void setDefaultValues() {

        Mapx = 0;
        Mapy = 0;

        col = 21;
        row = 21;

        Maps = new Tile[row][col];
    }

    private void getTitle() {
        try {
            tiles[0] = new Tile();
            tiles[0].image = ImageIO.read(getClass().getResourceAsStream("./mapSprites/Map-Floor-1.png"));

            tiles[1] = new Tile();
            tiles[1].image = ImageIO.read(getClass().getResourceAsStream("./mapSprites/Map-Floor-2.png"));

            tiles[2] = new Tile();
            tiles[2].image = ImageIO.read(getClass().getResourceAsStream("./mapSprites/Map-wall-1.png"));

            tiles[3] = new Tile();
            tiles[3].image = ImageIO.read(getClass().getResourceAsStream("./mapSprites/Map-wall-2.png"));

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Loi nhap map");
        }
    }

    public void update() {
        
        if (keyH.upPressed) {
            Mapy += 8;
        } else if (keyH.downPressed) {
            Mapy -= 8;
        } else if (keyH.leftPressed) {
            Mapx += 8;
        } else if (keyH.rightPressed) {
            Mapx -= 8;
        }
    }

    public void loadMap() {

        try {

            InputStream is = getClass().getResourceAsStream("./mapSprites/Map.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            for (int i = 0; i < row; i++) {
                String line = br.readLine();
                for (int j = 0; j < line.length(); j++) {
                    int num = Integer.parseInt((String) (((int) line.charAt(j) - 48) + ""));
                    Maps[i][j] = tiles[num - 1];
                }
            }

            br.close();

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("loi load map");
        }

    }

    public void draw(Graphics2D g2) {
        update();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                g2.drawImage(Maps[i][j].image, Mapx + j * gp.tileSize / 2, Mapy + i * gp.tileSize / 2, gp.tileSize / 2,
                        gp.tileSize / 2, null);

            }
        }

    }

    public void drawWall(Graphics2D g2) {
        update();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (Maps[i][j] == tiles[2]) {
                    g2.drawImage(tiles[3].image, Mapx + j * gp.tileSize / 2,
                            Mapy + i * gp.tileSize / 2 - gp.tileSize / 2 * 2 / 3, gp.tileSize / 2, gp.tileSize / 2,
                            null);
                }

            }
        }

    }

}
