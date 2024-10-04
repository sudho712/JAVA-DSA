package com.nonlinear;
public class AVL{
    ABN root;
    public AVL(){
        root=null;
    }

    int getHeight(ABNode node)
    {
        if (node==null){
            return 0;

        }
        else{
            return node.height;

        }
    }

    
    int getBalanceFactor(ABNode node)
    {
        return getHeight(node.left)-getHeight(node.right);
    }
}