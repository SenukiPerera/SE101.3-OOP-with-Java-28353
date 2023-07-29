package com.mycompany.lifegame;
public class Lifegame 
{
    public static void main(String[] args) 
    {
        RegularPlayer rp = new RegularPlayer();
        rp.moveUp();
        rp.moveDown();
        rp.moveLeft();
        rp.moveRight();

        OppositePlayer op = new OppositePlayer();
        op.moveUp();
        op.moveDown();
        op.moveLeft();
        op.moveRight();

        JumpingPlayer jp = new JumpingPlayer();
        jp.moveUp();
        jp.moveDown();
        jp.moveLeft();
        jp.moveRight();

        CrouchingPlayer cp = new CrouchingPlayer();
        cp.moveUp();
        cp.moveDown();
        cp.moveLeft();
        cp.moveRight();
    }
}
