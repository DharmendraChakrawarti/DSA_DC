
import java.util.*;
public class T_32_construct_Btree_from_inorder_and_postorder {
    public Node buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||postorder==null||inorder.length!=postorder.length){
            return null;
  }
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return natasha(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hm);
    }
    private Node natasha(int[] inorder,int is,int ie, int[] postorder,int ps,int pe,HashMap<Integer,Integer> hm){
        if(is>ie||ps>pe)return null;
        Node root=new Node(postorder[pe]);
        int inroot=hm.get(postorder[pe]);
        int numsleft=inroot-is;
        root.left=natasha(inorder,is,inroot-1,postorder,ps,ps+numsleft-1,hm);
        root.right=natasha(inorder,inroot+1,ie,postorder,ps+numsleft,pe-1,hm);
        return root;
    }
}
