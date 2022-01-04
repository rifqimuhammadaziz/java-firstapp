package TypeData;

public class Number {
    public static void main(String[] args) {
        byte iniByte = 100; // -128 ~ 127
        short iniShort = 1000; // -32768 ~ 32767
        int iniInt = 1000000; // -2,147,483,648 ~ 2,147,483,647
        long iniLong = 100000000; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long iniLong2 = 100000000L;

        float iniFloat = 10.12F;
        double iniDouble = 10.12;

        int decimalInt = 290;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        int amount = 1_000_000_000; // underscore = dot
    }
}
