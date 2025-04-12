public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Reultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
