import java.util.Scanner;

public class Tree {
	static int treeHeight;
	static int tempVar = 1;

	public static void main(String[] args) {		
		System.out.println("Specify the height of the tree:");
		Scanner s = new Scanner(System.in);
		treeHeight = s.nextInt();
		if(treeHeight == 0) {		
			System.out.println("Invalid height");
		}else {
			printTree(treeHeight);
		}		
	}
	public static void printTree(int desiredHeight){
        int[] elements = {1};
        int currentHeight = 0;
        while(currentHeight < desiredHeight) {
            int[] nextElements = new int[2*elements.length];
            printLevel(elements);
            for(int i = 0; i < elements.length; ++i) {
                //Left child node
                nextElements[i*2] = (i == 0) ? 1 : elements[i-1] + elements[i];
                //Right child node
                nextElements[i*2 + 1] = (i == (elements.length - 1)) ? 1 : elements[i] + elements[i+1];
            }
            elements = nextElements;
            currentHeight++;
        }
    }

    public static void printLevel(int[] list){
        for(int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
         }
        System.out.println("");
    }
	
}
