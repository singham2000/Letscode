public class SwapNumbers {
    public static void main(String[] args) {
        int i = 10, j = 20;
        System.out.println("First number = " + i);
        System.out.println("Second number = " + j);
        int temp = i;
        i = j;
        j = temp;
        System.out.println("Swap successful");
        System.out.println("First number = " + i);
        System.out.println("Second number = " + j);
    }
}