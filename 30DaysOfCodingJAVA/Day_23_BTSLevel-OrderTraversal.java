
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
    //Write your code here
    LinkedList<Node> queue = new LinkedList<>();
    queue.addLast(root);
      
    while(queue.size() != 0){
        Node current = queue.remove(0);
        System.out.print(current.data + " ");
          
        if(current.left != null){
            queue.addLast(current.left);
        }
        if(current.right != null){
          queue.addLast(current.right);
        }
    }
}

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            sc.close();
        }
}
