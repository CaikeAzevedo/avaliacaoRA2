/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab2;

/**
 *
 * @author eduar
 */
public class AVLNode {
    private int data, height;
    private AVLNode left, right;

    public AVLNode(int d) {
        this.data = d;
        this.height = 1;
        this.left = null;
        this.right = null;
    }

    // Getters
    public int getData() {
        return data;
    }

    public int getHeight() {
        return height;
    }

    public AVLNode getLeft() {
        return left;
    }

    public AVLNode getRight() {
        return right;
    }

    // Setters
    public void setData(int data) {
        this.data = data;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }
}