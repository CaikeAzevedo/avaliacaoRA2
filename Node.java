/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab2;

/**
 *
 * @author eduar
 */
public class Node {
    private Integer data;
    private Node left, right;

    public Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
    
   public Node(){
        this.data = null;
        this.left = null;
        this.right = null;
   }

    // Getters
    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    // Setters
    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}