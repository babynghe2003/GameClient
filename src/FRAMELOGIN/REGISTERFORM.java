
package FRAMELOGIN;

import javax.swing.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.ArrayList;
import java.awt.*;
import java.sql.*;
import Main.*;

public class REGISTERFORM extends JFrame {

    LOGIN LI;

    USER user;
    ArrayList<USER> USERS;

    JTextField IngameField = new JTextField();
    JLabel Mess = new JLabel();
    JPasswordField PasswordField = new JPasswordField();
    JPasswordField PasswordField2 = new JPasswordField();
    JTextField UserNameField = new JTextField();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();

    public REGISTERFORM(LOGIN LI, ArrayList<USER> USER) {
        this.USERS = USER;
        this.LI = LI;
        initComponents();
    }

    public REGISTERFORM() {
        initComponents();
    }

    private void initComponents() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(38, 38, 38));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new Color(248, 148, 6));

        jLabel2.setFont(new Font("Noto Sans Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setText("Register");

        jButton2.setBackground(new Color(255, 30, 30));
        jButton2.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(250, 250, 0));
        jButton3.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 569, Short.MAX_VALUE)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 39,
                                                GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE)));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 80));

        jPanel3.setBackground(new Color(38, 38, 38));

        jLabel1.setFont(new Font("Noto Sans Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new Color(254, 254, 254));
        jLabel1.setText("Tên đầy đủ:");

        jLabel3.setBackground(new Color(247, 247, 247));
        jLabel3.setFont(new Font("Noto Sans Mono", 0, 24)); // NOI18N
        jLabel3.setForeground(new Color(254, 254, 254));
        jLabel3.setText("Tên đăng nhập:");

        jLabel4.setFont(new Font("Noto Sans Mono", 0, 24)); // NOI18N
        jLabel4.setForeground(new Color(254, 254, 254));
        jLabel4.setText("Mật khẩu: ");

        jLabel5.setFont(new Font("Noto Sans Mono", 0, 24)); // NOI18N
        jLabel5.setForeground(new Color(254, 254, 254));
        jLabel5.setText("Nhập lại mật khẩu: ");

        IngameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                IngameFieldActionPerformed(evt);
            }
        });

        UserNameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UserNameFieldActionPerformed(evt);
            }
        });

        PasswordField.setFont(new Font("Ubuntu", 0, 24)); // NOI18N

        PasswordField2.setFont(new Font("Ubuntu", 0, 24)); // NOI18N

        jButton1.setBackground(new Color(60, 168, 50));
        jButton1.setFont(new Font("Noto Sans Mono", 0, 24)); // NOI18N
        jButton1.setForeground(new Color(254, 254, 254));
        jButton1.setText("Đăng kí");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new Color(248, 148, 6));
        jButton4.setFont(new Font("Noto Mono", 0, 24)); // NOI18N
        jButton4.setForeground(new Color(254, 254, 254));
        jButton4.setText("Đăng nhập");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Mess.setFont(new Font("Noto Mono", 0, 18)); // NOI18N
        Mess.setForeground(new Color(255, 0, 0));
        Mess.setText("lỗi");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addGroup(jPanel3Layout
                                                                        .createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING,
                                                                                jPanel3Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel3Layout
                                                                                                .createParallelGroup(
                                                                                                        GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(jLabel1)
                                                                                                .addComponent(jLabel3))
                                                                                        .addGap(14, 14, 14))))
                                                        .addGroup(GroupLayout.Alignment.TRAILING,
                                                                jPanel3Layout.createSequentialGroup()
                                                                        .addGap(163, 163, 163)
                                                                        .addComponent(jLabel4,
                                                                                GroupLayout.PREFERRED_SIZE, 140,
                                                                                GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(PasswordField)
                                                        .addComponent(IngameField)
                                                        .addComponent(UserNameField)
                                                        .addComponent(PasswordField2, GroupLayout.Alignment.TRAILING,
                                                                GroupLayout.PREFERRED_SIZE, 434,
                                                                GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(244, 244, 244)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 171,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(144, 144, 144)
                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 177,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(115, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Mess, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(IngameField, GroupLayout.PREFERRED_SIZE, 58,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(UserNameField, GroupLayout.PREFERRED_SIZE, 58,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44,
                                                        Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(PasswordField, GroupLayout.PREFERRED_SIZE, 53,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(PasswordField2, GroupLayout.PREFERRED_SIZE, 52,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(Mess, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 77,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 77,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 870, 590));

        pack();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        if (UserNameField.getText().length() == 0 ||
                IngameField.getText().length() == 0 ||
                String.valueOf(PasswordField.getPassword()).length() == 0 ||
                String.valueOf(PasswordField2.getPassword()).length() == 0) {
            Mess.setText("Please type full");
        } else {
            if (findUser(UserNameField.getText()) == -1) {
                if (String.valueOf(PasswordField.getPassword()).equals(String.valueOf(PasswordField2.getPassword()))) {
                    String username = UserNameField.getText();
                    String ingame = IngameField.getText();
                    String password = String.valueOf(PasswordField.getPassword());
                    System.out.println(username + ingame + password);
                    addAccout(username, ingame, password, 0, 0, 0, 0);
                } else
                    Mess.setText("Password do not match!");
            } else {
                Mess.setText("Username exist");
            }
            System.out.println(findUser(UserNameField.getText()));

        }

    }

    private void IngameFieldActionPerformed(ActionEvent evt) {
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        this.LI.setVisible(true);
        this.dispose();
    }

    private void UserNameFieldActionPerformed(ActionEvent evt) {

    }

    public void addAccout(String username, String ingame, String password, int record1, int record2, int record3,
            int record4) {
        try {
            Connection conn = new ConnectSQL().getConnection();
            Statement st = conn.createStatement();
            // st.executeQuery("Select * from accout");
            st.executeUpdate("INSERT INTO accout(username,ingame,password,record1,record2,record3,record4)"
                    + "VALUES ('" + username + "','" + ingame + "','" + password + "',0,0,0,0)");
            USERS.add(new USER(username, ingame, password));
            JOptionPane.showMessageDialog(this, "Register successful!");

        } catch (SQLException e) {
            System.out.println("Add accout error");
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public int findUser(String username) {

        for (int i = 0; i < USERS.size(); i++) {
            if (this.USERS.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

}
