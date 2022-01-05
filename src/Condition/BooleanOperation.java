package TypeData;

public class BooleanOperation {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 90;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 80;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);


    }
}
