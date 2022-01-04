package TypeData;

public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3]; // String[] arrayString = new String[3];
        arrayString[0] = "Rifqi";
        arrayString[1] = "Muhammad";
        arrayString[2] = "Aziz";

        String[] myName = {
                "Rifqi", "Muhammad", "Aziz"
        };

        int[] arrayInt = new int[] {
                1, 24, 23, 90, 12, 111
        };
        arrayInt[0] = 2; // change array value
        System.out.println(arrayInt.length); // array length

        Long[] arrayLong = {
                10L, 22L, 8L, 6L, 21L
        };
        arrayLong[0] = null; // change array value (not deleted)
        System.out.println(arrayLong[0]);

        // nested array
        String[][] users = {
                {"Rifqi", "Muhammad", "Aziz"},
                {"Bagas", "Dwi", "Yulianto"},
                {"Ahmad", "Kurnia", "Muhtar"}
        };
        System.out.println(users[0][0]); // Rifqi
        System.out.println(users[1][0]); // Bagas
        System.out.println(users[2][1]); // Kurnia
    }
}
