import java.util.*;
class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
  
class pair{
    int num ;
    Node node;
    pair(Node _node, int val){
        num=val;
        node =_node;
    }}
public class T_22_left_view{
           static public LinkedList<Integer>  view(Node root){
      
     LinkedList<Integer> list=new LinkedList<Integer>();
     rightview(root,list,0);
     return list;
    }
    static public void rightview(Node root,List<Integer> list,int deft){
        if(root==null){return;}
        if(list.size()==deft)list.add(root.key);
        if(root.left!=null){rightview(root.left,list,deft+1);}
        if(root.right!=null){rightview(root.right,list,deft+1);}
    }


	public static void main(String[] args)
	{
	
		/*create root*/
		Node root = new Node(1);

		/* following is the tree after above statement

			1
			/ \
		null null	 */

		root.left = new Node(2);
		root.right = new Node(3);

		/* 2 and 3 become left and right children of 1
			1
			/	 \
		2	 3
		/ \	 / \
	null null null null */


		root.left.left = new Node(4);
		/* 4 becomes left child of 2
					1
				/	 \
			2		 3
			/ \	 / \
			4 null null null
		/ \
		null null
		*/
        LinkedList<Integer> list=view(root);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
