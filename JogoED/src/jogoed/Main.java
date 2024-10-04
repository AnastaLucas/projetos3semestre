/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogoed;

import java.util.Random;
import java.util.Scanner;
import jogoed.cartas.Foguinho;
import jogoed.cartas.Aguinha;
import jogoed.cartas.Agua;
import jogoed.cartas.Carta;
import jogoed.cartas.Fogo;
import jogoed.cartas.Aguona;
import jogoed.cartas.Fogao;
import jogoed.cartas.Plantinha;
import jogoed.cartas.Planta;
import jogoed.cartas.Normal;
import jogoed.cartas.Plantona;




public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = iniciar();
        Deck jogador1;
        System.out.println("Jogador 1, escolha suas cartas:");
        jogador1 = criaDeck(deck, sc);

        System.out.println("\n\nJogador 2, escolha suas cartas:");
        Deck jogador2 = criaDeck(deck, sc);

        Random random = new Random();
        boolean jogador1Escolhe;

        while (!jogador1.deckVazio() && !jogador2.deckVazio()) {
            jogador1Escolhe = random.nextBoolean();
            System.out.println("\nJogador " + (jogador1Escolhe ? 1 : 2) + " escolhe o atributo!");
            int atributo = escolherAtributo(sc);

            Carta cartaJg1 = escolherCarta(jogador1, sc, "Jogador 1");
            Carta cartaJg2 = escolherCarta(jogador2, sc, "Jogador 2");

            if (atributo == 1) {
                realizarCombate(cartaJg1, cartaJg2, jogador1, jogador2, true);
            } else {
                realizarCombate(cartaJg1, cartaJg2, jogador1, jogador2, false);
            }
        }

        if (jogador1.deckVazio()) {
            System.out.println("Jogador 1 perdeu o jogo!");
        } else {
            System.out.println("Jogador 2 perdeu o jogo!");
        }
    }

    private static void realizarCombate(Carta cartaJg1, Carta cartaJg2, Deck jogador1, Deck jogador2, boolean defesa) {
        int vencedor = defesa ? combateDef(cartaJg1, cartaJg2) : combateAtq(cartaJg1, cartaJg2);
        if (vencedor == 1) {
            jogador2.remover(cartaJg2);
            System.out.println("Jogador 2 perdeu a carta.");
        } else {
            jogador1.remover(cartaJg1);
            System.out.println("Jogador 1 perdeu a carta.");
        }
    }

    private static int escolherAtributo(Scanner sc) {
        int atributo;
        do {
            System.out.println("\nEscolha entre [1] - Defesa ou [2] - Ataque:");
            atributo = sc.nextInt();
        } while (atributo != 1 && atributo != 2);
        return atributo;
    }

    private static Carta escolherCarta(Deck jogador, Scanner sc, String nomeJogador) {
        jogador.imprimir();
        int escolha;
        do {
            System.out.println("\n" + nomeJogador + ", escolha sua carta (0 a " + (jogador.tamanho() - 1) + "):");
            escolha = sc.nextInt();
        } while (escolha < 0 || escolha >= jogador.tamanho());
        return jogador.escolher(escolha);
    }

    private static Deck iniciar() {
        Deck todas = new Deck();

        
        todas.insere(new Aguinha());
        todas.insere(new Agua());
        todas.insere(new Aguona());
        todas.insere(new Foguinho());
        todas.insere(new Fogo());
        todas.insere(new Fogao());
        todas.insere(new Plantinha());
        todas.insere(new Planta());
        todas.insere(new Plantona());
        todas.insere(new Normal());

        todas.imprimirStatus();
        System.out.println("\n");
        return todas;
    }

    private static Deck criaDeck(Deck deck, Scanner sc) {
        Deck deckJogador = new Deck();
        deck.imprimir();
        for (int i = 0; i < 6; i++) {
            
            System.out.print("\nEscolha a carta número " + (i + 1) + ": ");
            int escolha = sc.nextInt();
            Carta aux = deck.escolher(escolha).copia();
            deckJogador.insere(aux);
        }
        return deckJogador;
    }

    private static int combateAtq(Carta pokn1, Carta pokn2) {
        return calcularVencedor(pokn1, pokn2, true);
    }

    private static int combateDef(Carta pokn1, Carta pokn2) {
        return calcularVencedor(pokn1, pokn2, false);
    }

    private static int calcularVencedor(Carta pokn1, Carta pokn2, boolean ataque) {
        int v1 = 1, v2 = 1;
        int vantagem = calcularVantagem(pokn1, pokn2);
        if (vantagem == 1) {
            v1++;
        } else if (vantagem == 2) {
            v2++;
        }

        int stat1 = ataque ? pokn1.getAtq() * v1 : pokn1.getDef() * v1;
        int stat2 = ataque ? pokn2.getAtq() * v2 : pokn2.getDef() * v2;

        return stat1 > stat2 ? 1 : 2;
    }

    private static int calcularVantagem(Carta pokn1, Carta pokn2) {
        String tipo1 = pokn1.getTipo(), tipo2 = pokn2.getTipo();
        if (tipo1.equals("Normal") || tipo2.equals("Normal") ||tipo1.equals(tipo2)) {
            return 0;
        }

        if (tipo1.equals("Fogo") && tipo2.equals("Planta") || 
            tipo1.equals("Planta") && tipo2.equals("Agua") || 
            tipo1.equals("Agua") && tipo2.equals("Fogo")) {
            return 1;
        } else {
            
            return 2;
        }
    }
}
