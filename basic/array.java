public class array{
    public static void main(String[] args) {
        int bank[][] = new int[2][100];
        bank[0][1] = 232523;
        bank[1][2] = 66541;
        System.out.println("output1 = " + bank[0][1]);
        System.out.println("output2 = "+ bank[1][2]);
    }
}