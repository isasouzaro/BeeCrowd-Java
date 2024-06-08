// Aprendendo a criar váriaveis e métodos 
public static void main (String [] args) {
    String primeiroNome = "Isabela";
    String segundoNome = "Souza";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

