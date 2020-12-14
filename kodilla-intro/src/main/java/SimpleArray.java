public class SimpleArray { //Utworzenie klasy o nazwie SimpleArray
    public static void main(String[] args){ //Klasa main, definicja?????
        String[] RandomThings = new String[5]; //stworzenie tablicy na 5 elementów (Czy zmienna "new" jest tutaj niezbędne?????
        RandomThings[0]="Samochod"; //wariant nr 1
        RandomThings[1]="Ksiazka"; //wariant nr 2
        RandomThings[2]="Patryk"; //wariant nr 3
        RandomThings[3]="Ferie"; //wariant nr 4
        RandomThings[4]="Zima"; //wariant nr 5

        String Przedmiot = RandomThings [1]; //wybór elementu o numerze 1
        System.out.println(Przedmiot); //pokazanie wyników w konsoli

        String WyczekiwanyMoment = RandomThings [3]; //wybór elementu o numerze 3
        System.out.println(WyczekiwanyMoment); //pokazanie wyników w konsoli

        int numberOfElements = RandomThings.length; // liczba elementów w tabeli
        System.out.println("Moja tablica zawiera numberOfElements elementów."); //pokazanie wyniku w konsoli ?????

        for (int i = 0; i < RandomThings.length; i++) { //pokazywanie wszystkich elementów
            System.out.println(RandomThings[i]);
        }
        for (int i = RandomThings.length - 1; i >- 0 ; i--) { //pokazywanie wszystkich elementów od końca; nie pokazał się element o liczbie 0 ?????
            System.out.println(RandomThings[i]);
        }

    }

}
