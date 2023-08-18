public class KonversiNumber {
    public static void main(String[] args) {

        /*
        Konversi tipe data dapa dilakukan secara Otomatis (Widening Casting)
         */

        // Contoh Konversi Tipe data number secara otomatis

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;


        /*
        Konversi tipe data manual (Narrowing Casting)
         */

//        Long iniLong2 = 9_223_372_036_854_774_807L;
//        int iniInt2 = (int) Math.min(iniLong2, Integer.Max_VALUE);
//        short iniShort2 = (short) iniInt2;
//        byte iniByte2 = (byte) iniShort2;
//
//        System.out.println(iniByte2);

    }
}
