import java.util.Scanner;

public class GenerateTree {
	static int treeHeight;
	static int tempVar = 1;
	static int condition;

	public static void main(String[] args) {		
		System.out.println("Specify the height of the tree:");
		Scanner s = new Scanner(System.in);
		treeHeight = s.nextInt();
		if(treeHeight == 0) {		
			System.out.println("Invalid height");
		}else {
			generateTree(treeHeight);
		}		
	}
	public static void generateTree(int desiredHeight){
        int[] elements = {1};
        int currentHeight = 0;
        condition = (int) (Math.pow(2, desiredHeight-1));
        while(currentHeight < desiredHeight) {
            int[] nextElements = new int[2*elements.length];
            printLevel(elements,desiredHeight);
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
//prints the tree level by level in ascii format
//ascii format for now is looks good only if the solution is in single digits, double digit take more space 
//and that is not taken into account at this point.
    public static void printLevel(int[] list, int n){
    	
        for(int j = 0; j < list.length; ++j) {
        	if(j==0) {
        		for(int i=0;i<condition-1;++i) {
        			System.out.print(" ");
        		}
        		System.out.print(list[j] + " ");
        	}
        	else {
        		for(int i=0;i<(2*condition)-2;++i)
        			System.out.print(" ");
        		System.out.print(list[j] + " ");
        	}        		
         }
        condition = condition/2;      
        System.out.println("");       
    }	
}
