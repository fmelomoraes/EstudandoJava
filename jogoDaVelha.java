import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char [][] tabuleiro = new char[3][3];
        char jogadorAtual = 'X';
        boolean jogoAcabou = false;

        inicializarTabuleiro(tabuleiro);

        Scanner scanner = new Scanner(System.in);

        while (!jogoAcabou) {
            imprimirTabuleiro(tabuleiro);

            System.out.print("Jogador " + jogadorAtual + " , informe a linha (1-3): ");
            int linha = scanner.nextInt() -1;

            System.out.print("Jogador " + jogadorAtual + " , informe a coluna (1-3): ");
            int coluna = scanner.nextInt() -1;

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                jogoAcabou = verificarVitoria(tabuleiro, jogadorAtual) || verificarEmpate(tabuleiro);
                jogadorAtual = (jogadorAtual == 'X') ? '0' : 'X';
            } else {
                System.out.println("Jogada inválida! Tente novamente. ");
            }

        }

        imprimirTabuleiro(tabuleiro);
        if (verificarVitoria(tabuleiro, jogadorAtual == 'X' ? '0' : 'X')) {
            System.out.println("Parabéns jogador " + (jogadorAtual == 'X' ? '0' : 'X') + ", você venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int linha = 0; linha <3; linha++){
            for (int coluna =0; coluna <3; coluna++){
                tabuleiro[linha][coluna] = ' ';
            }
        }

    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int linha = 0; linha < 3; linha++){
            System.out.println("| ");
            for (int coluna =0; coluna <3; coluna++){
                System.out.println(tabuleiro[linha][coluna]+ " | ");
            }
            System.out.println("\n-------------");
        }

    }
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }

    public static boolean verificarEmpate(char[][] tabuleiro){
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                if (tabuleiro[linha][coluna]==' '){
                    return false;
                }
            }
        }
        return true;
    }
}