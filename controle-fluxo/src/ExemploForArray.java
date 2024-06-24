public class ExemploForArray {
    public static void main(String[] args) {
        //índice sempre inicia em 0
        String nomes [] = {"Isa", "Pedro", "Felipe", "Manuela"};

        for (int x = 0; x < nomes.length; x++) {
            System.out.println("O nome no índice x = " + x + " é " + nomes [x]);
        }
    }
}