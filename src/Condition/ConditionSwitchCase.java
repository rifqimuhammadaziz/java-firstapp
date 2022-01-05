package Condition;

public class ConditionSwitchCase {
    public static void main(String[] args) {
        var nilai = "C";

        switch (nilai) {
            case "A":
                System.out.println("Nilai Anda Sangat Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda B dan Cukup");
                break;
            default:
                System.out.println("Anda harus mengulang");
                break;
        }

        // switch lambda (java 14++)
        switch (nilai) {
            case "A" -> System.out.println("Nilai Anda Sangat Baik!");
            case "B", "C" -> System.out.println("Nilai Anda Baik dan Cukup");
            case "D" -> System.out.println("Nilai Anda D");
            default -> {
                System.out.println("Anda salah jurusan!");
            }
        }


        // switch yield (java 14++)
        var pesan = switch (nilai) {
            case "A":
                yield "Nilai Anda Sangat Baik!";
            case "B", "C":
                yield "Nilai Anda Baik dan Cukup";
            case "D":
                yield "Nilai Anda D";
            default:
                yield "Anda salah jurusan!";
        };
        System.out.println(pesan);
    }
}
