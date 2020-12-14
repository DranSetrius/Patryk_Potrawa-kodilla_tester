public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) { //wyrażanie początkowe i=0; warunkiem jest i mniejsze bądź równe zero, warunkiem końcowym jest i+1
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i = i + 1) { //to samo co wyżej - zmieniony zapis
            System.out.println(i);
        }
    }

    String[] Numbers = new String[5];
    Numbers[0] = "6"; //wariant nr 1
    Numbers[1] = "8"; //wariant nr 2
    Numbers[2] = "7"; //wariant nr 3
    Numbers[3] = "1"; //wariant nr 4
    Numbers[4] = "5"; //wariant nr 5
}