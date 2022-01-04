package TypeData;

public class NumberConversion {
    public static void main(String[] args) {
        // automatic conversion to higher type data range
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // manual conversion to lower type data range
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // number overflow
    }
}
