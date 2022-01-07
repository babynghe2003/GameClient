
package FRAMELOGIN;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

import GameClient.*;

public class LOGIN extends JFrame {
    USER user = new USER();
    ArrayList<USER> USERS;
    public LOGIN(ArrayList<USER> users) {
        this.USERS = users;
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    JButton Login = new JButton();
    JLabel StartRegister = new JLabel();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPasswordField jPasswordField1 = new JPasswordField();
    JTextField jTextField1 = new JTextField();


    public void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new Color(248, 148, 6));

        jLabel2.setFont(new Font("Noto Sans Mono", 1, 24)); 
        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setText("Login");

        jButton2.setBackground(new Color(255, 30, 30));
        jButton2.setFont(new Font("Ubuntu", 0, 18)); 
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(250, 250, 0));
        jButton3.setFont(new Font("Ubuntu", 0, 18)); 
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 60));

        jPanel2.setBackground(new Color(38, 38, 38));
        jPanel2.setForeground(new Color(254, 254, 254));

        jLabel4.setFont(new Font("Noto Sans Mono", 0, 24)); 
        jLabel4.setForeground(new Color(254, 254, 254));
        jLabel4.setText("Tên đăng nhập : ");

        jLabel5.setFont(new Font("Noto Mono", 0, 24)); 
        jLabel5.setForeground(new Color(254, 254, 254));
        jLabel5.setText("Mật khẩu: ");

        jTextField1.setFont(new Font("Noto Sans Mono", 0, 24)); 
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new Font("Noto Sans Mono", 0, 24));

        Login.setBackground(new Color(248, 148, 6));
        Login.setFont(new Font("Noto Mono", 0, 24)); 
        Login.setText("Đăng nhập");
        Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        StartRegister.setFont(new Font("Noto Mono", 0, 24));
        StartRegister.setForeground(new Color(254, 254, 254));
        StartRegister.setText("Chưa có tài khoản? Đăng kí");
        StartRegister.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                StartRegisterMouseClicked(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(StartRegister)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Login, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(StartRegister)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 690, 460));

        pack();
    }

    public void jTextField1ActionPerformed(ActionEvent evt) {
        
    }
    public void jButton2ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    public void jButton3ActionPerformed(ActionEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    public void StartRegisterMouseClicked(MouseEvent evt) {
        REGISTERFORM gs = new REGISTERFORM(this,USERS);
        gs.setVisible(true);
        gs.pack();
        gs.setLocationRelativeTo(null);
        gs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }

    public void LoginActionPerformed(ActionEvent evt) {
        if (findUser(jTextField1.getText()) != -1){
            user = USERS.get(findUser(jTextField1.getText()));
            int thutu = findUser(jTextField1.getText());
            System.out.println("*"+(String.valueOf(jPasswordField1.getPassword()))+"*");
            System.out.println("*"+user.getPassword()+"*");
            String pass2 = String.valueOf(jPasswordField1.getPassword());
            System.out.println((user.getPassword().equals(pass2)));

            if (user.getPassword().equals(String.valueOf(jPasswordField1.getPassword()))){
                GameClient gs = new GameClient(this,USERS,thutu);
                gs.setVisible(true);
                gs.pack();
                gs.setLocationRelativeTo(null);
                gs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(false);
            } else{
                System.out.println("Sai Mat Khau");
                JOptionPane.showMessageDialog(this,"Wrong password");
            }

        } else {
            JOptionPane.showMessageDialog(this,"Username does not exist");
        }
        
    }

    public int findUser(String username){
        
        for (int i = 0; i < USERS.size(); i++){
            if (this.USERS.get(i).getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }

}
