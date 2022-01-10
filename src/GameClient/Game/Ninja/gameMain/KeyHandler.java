package GameClient.Game.Ninja.gameMain;

import java.awt.event.*;

public class KeyHandler implements KeyListener {
    public boolean upPressed, downPressed, leftPressed, rightPressed, attackPressed;

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = true;
            System.out.println("up");

        }
        if (code == KeyEvent.VK_S) {
            downPressed = true;
            System.out.println("down");
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = true;
            System.out.println("left");
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = true;
            System.out.println("right");
        }

        if (code == KeyEvent.VK_J) {
            attackPressed = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;

        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;

        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = false;
        }

        if (code == KeyEvent.VK_J) {
            attackPressed = false;
        }

    }

}