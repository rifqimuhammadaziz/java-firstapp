package Condition;

public class ConditionIf {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 90;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 80;

        // 2 var must be true
        if (lulusAbsen && lulusNilai) {
            System.out.println("Lulus");
        } else {
            System.out.println("Nilai Anda kurang");
        }

        if (absen >= 80 && nilaiAkhir >= 80) {
            System.out.println("Nilai A");
        } else if (absen >= 70 && nilaiAkhir >= 70) {
            System.out.println("Nilai B");
        } else if (absen >= 60 && nilaiAkhir >= 60) {
            System.out.println("Nilai C");
        } else {
            System.out.println("Anda Harus mengulang");
        }
    }
}
