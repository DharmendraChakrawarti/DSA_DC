
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
public class T_23_Tree_is_Symeetric_or_not{
           static public boolean symetric(Node root){
     
     return (root==null)||rightview(root.left,root.right);
    }
    static public boolean rightview(Node left,Node right){
        if(left==null||right==null)return left==right;
        if(left.key!=right.key)return false;
      return rightview(left.left,right.right)&& rightview(left.right,right.left);
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
       
            System.out.print(symetric(root));
        
    }
}