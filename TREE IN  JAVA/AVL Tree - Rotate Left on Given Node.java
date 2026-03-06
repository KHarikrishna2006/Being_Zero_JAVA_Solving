import java.util.*;
import java.io.*;

class AVLNode{
    public int data;
    public AVLNode left, right;
    public AVLNode(int d){
        data = d;
        left = right = null;
    }
};

class BeingZero {
    public void rotateLeft(AVLNode root){
        AVLNode a=root;
        AVLNode c=root.right.right;  
        AVLNode b=root.right;
        AVLNode t2=b.left;
        AVLNode t1=a.left;
        int t=a.data;
        a.data=b.data;
        b.data=t;
        b.left=t1;
        b.right=t2;
        a.left=b;
        a.right=c;
    }
}
