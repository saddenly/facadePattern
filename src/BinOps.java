public class BinOps {
    public String sum(String a, String b) {
        return Integer.toBinaryString((Integer.parseInt(a) + Integer.parseInt(b)));
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString((Integer.parseInt(a) * Integer.parseInt(b)));
    }
}