package GameClient;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.BorderFactory.*;
import java.sql.*;
import Main.*;

import java.util.ArrayList;
import java.util.logging.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import FRAMELOGIN.*;
import GameClient.Game.G2048.G2048Game;
import GameClient.Game.Snake.SnakeGame;
public class GameClient extends javax.swing.JFrame {

    LOGIN LI;
    public ArrayList<USER> USERS;
    public int thutu;

    public GameClient(LOGIN LI, ArrayList<USER> USERS, int thutu) {
        this.thutu = thutu;
        this.USERS = USERS;
        this.LI = LI;
        

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setBackground(new Color(38, 38, 38));
        this.setUndecorated(true);
        this.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ninjabtn = new javax.swing.JButton();
        g2048btn = new javax.swing.JButton();
        snakebtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        initComponents();
    }
    public GameClient() {
        initComponents();
    }

    private void initComponents() {

        

        

        jPanel2.setBackground(new Color(248, 148, 6));

        jLabel2.setFont(new Font("Noto Sans Mono", 1, 36)); 
        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setText("Game Client ");

        jButton2.setBackground(new Color(255, 30, 30));
        jButton2.setFont(new Font("Ubuntu", 0, 18)); 
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(250, 250, 0));
        jButton3.setFont(new Font("Ubuntu", 0, 18)); 
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1420, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 80));

        jPanel1.setBackground(new Color(38, 38, 38));

        jPanel3.setBackground(new Color(38, 38, 38));
        jPanel3.setLayout(new GridLayout(2, 2, 20, 20));

        ninjabtn.setBackground(new Color(45, 45, 45));
        ninjabtn.setFont(new Font("Noto Sans Mono", 0, 36)); 
        ninjabtn.setForeground(new Color(255, 255, 255));
        ninjabtn.setIcon(new ImageIcon(getPlayerImage("./Logo/Assasin.png")));
        ninjabtn.setText("<html>Ninja<br>Best record: <html>"+USERS.get(thutu).getRecord1());
        ninjabtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ninjabtn.setFocusPainted(false);
        ninjabtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        jPanel3.add(ninjabtn);

        g2048btn.setBackground(new Color(45, 45, 45));
        g2048btn.setFont(new Font("Noto Sans Mono", 0, 36)); 
        g2048btn.setForeground(new Color(255, 255, 255));
        g2048btn.setIcon(new ImageIcon(getPlayerImage("./Logo/g2048.png")));
        g2048btn.setText("<html>2048<br>Best score: <html>"+USERS.get(thutu).getRecord2());
        g2048btn.setToolTipText("");
        g2048btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        g2048btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                G2048Action(evt);
            }
        });
        jPanel3.add(g2048btn);

        snakebtn.setBackground(new Color(45, 45, 45));
        snakebtn.setFont(new Font("Noto Sans Mono", 0, 36)); 
        snakebtn.setForeground(new Color(255, 255, 255));
        snakebtn.setIcon(new ImageIcon(getPlayerImage("./Logo/snake.png")));
        snakebtn.setText("<html>Snake<br>Best score: <html>"+USERS.get(thutu).getRecord3());
        snakebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        snakebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                snakeAction(evt);
            }
        });
        jPanel3.add(snakebtn);

        jButton6.setBackground(new Color(45, 45, 45));
        jButton6.setFont(new Font("Noto Sans Mono", 0, 36)); 
        jButton6.setForeground(new Color(255, 255, 255));
        jButton6.setText("Coming soon...");
        jButton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jPanel3.add(jButton6);

        username.setFont(new Font("Ubuntu", 0, 36)); 
        username.setForeground(new Color(250, 250, 250));
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText(this.USERS.get(thutu).getIngame());

        jButton7.setBackground(new Color(244, 23, 23));
        jButton7.setFont(new Font("Ubuntu", 0, 36)); 
        jButton7.setForeground(new Color(255, 255, 255));
        jButton7.setText("Log out");
        jButton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(username, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 1767, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 657, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1900, 860));

        pack();
    }

       
    public Image getPlayerImage(String Path) {

        try {

            return ((Image)ImageIO.read(getClass().getResourceAsStream(Path))).getScaledInstance(300,300,0);

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("loi file anh");

        }

        return null;
    }

    private void G2048Action(ActionEvent evt){
        new G2048Game(this).setVisible(true);
        this.dispose();
    }
    
    private void snakeAction(ActionEvent evt){
        new SnakeGame(this).setVisible(true);
        this.dispose();
    }
    
    private void jButton2ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        this.LI.setVisible(true);
        this.dispose();
    }

    public void updateRecord(int magame,int score) {
        try {
            Connection conn = new ConnectSQL().getConnection();
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE accout SET record"+magame+" = "+score+" where username = '"+USERS.get(thutu).getUsername()+"'");
            switch (magame) {
                case 1:
                    USERS.get(thutu).setRecord1(score);
                    break;
                case 2:
                    USERS.get(thutu).setRecord2(score);
                    break;
                case 3:
                    USERS.get(thutu).setRecord3(score);

                    break;
                case 4:
                    USERS.get(thutu).setRecord4(score);
                    break;
            
                default:
                    break;
            }
            initComponents();
            System.out.println("updateRecord successful");

        } catch (SQLException e) {
            System.out.println("Add accout error");
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    private JButton ninjabtn;
    private JButton jButton2;
    private JButton jButton3;
    private JButton g2048btn;
    private JButton snakebtn;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel username;

}
