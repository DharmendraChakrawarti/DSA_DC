
import java.lang.Math;

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
    }
}
public class T_13_DiameterOfTree{
    static public int diameter(Node root,int []diametera){
      if(root==null){return 0;}
      int lh=diameter(root.left,diametera);
      int rh=diameter(root.right,diametera);
      
      diametera[0]=Math.max(diametera[0],(lh+rh));
      return Math.max(lh, rh)+1;
    }

    static public int dia(Node toot){
int [] diametera = new int[1];
diameter(toot,diametera);
return diametera[0];
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
     System.out.println(dia(root));
}
}