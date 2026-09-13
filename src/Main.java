public class Main {

    public static void main(String[] args) throws InterruptedException {
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ !";
        String certo = "Hello World!";
        String atual = "";

        while (!atual.equals(certo)) {
            for (int i = 0; i < letras.length(); i++) {
                char letra = letras.charAt(i);
                System.out.println(atual + letra);
                Thread.sleep(50);

                int posicaoAtual = atual.length();
                char letraCerta = certo.charAt(posicaoAtual);

                if (letra == letraCerta) {
                    atual += letra;
                    break;
                }
            }
        }

    }
}
