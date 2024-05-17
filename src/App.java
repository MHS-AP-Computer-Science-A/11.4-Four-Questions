import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // BUILD YOUR TREE
        TreeNode<String> root = new TreeNode<String>("Replace this with your first question");




        // PLAY GAME
        Scanner input = new Scanner(System.in);
        
        TreeNode<String> current = root;
        
        System.out.println(current.getValue());
        String answer = input.getNext();

    }

}
