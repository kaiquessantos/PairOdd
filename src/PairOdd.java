public class PairOdd {

    public static void main(String[] args) {



        var scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número para verificação de par ou ímpar: ");
        int numero = Integer.parseInt(scanner.nextLine());

        String numEscolhido = switch (numero)
        {
            case 0 -> "Zero";
            case 17 -> "Dezessete";
            default -> {
                if (numero % 2 == 0)
                {
                    yield "Par";
                }
                else {
                    yield "Ímpar";
                }

            }
        };

        scanner.close();

        System.out.println(numEscolhido);



    }

}
