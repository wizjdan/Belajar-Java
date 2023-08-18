public class Array {
    public static void main(String[] args) {
        //ArrayString
        String[] nama = {
                "Pangestu", "Nugraha","Wizjdan"
        };
        System.out.println(nama[0]);

        //ArrayNumber
        int[] nomor = {
                1,2,3,4,5
        };

        //Contoh 1 Pembuatan Array

        String[] arrayString1;
        arrayString1 = new String[3];
        arrayString1[0] = "Pangestu"; // data array ke 1
        arrayString1[1] = ""; // data array ke 2
        arrayString1[2] = "Nugraha"; //data array ke 3

        System.out.println(arrayString1[2]); //cara memanggil data dalam array

        //Contoh 2 Pembuatan Array

        String[] arrayString2 = new String[3];

        //Array Initializer

        //Contoh 1 Array Initializer
        int[] contohArray1 = new int[]{
          10, 20, 30
        };

        //Contoh 2 Array Initializer
        int[] contohArray2 = {
                10, 20, 30, 40, 50
        };
    }
}
