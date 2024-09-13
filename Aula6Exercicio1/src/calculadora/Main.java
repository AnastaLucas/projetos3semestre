/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucas.amsantos4
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            
            System.out.print("Digite n1: ");
            double x = sc.nextDouble();
            
            System.out.print("Digite n2: ");
            double y = sc.nextDouble();
            
            calcular(x, y);
            
        }catch(SinalNaoExiste ex){
            String resposta = "Sinal nao correspondente.";
            System.out.println(resposta);
            ex = new SinalNaoExiste(resposta);
            escreverTxt(ex);
            
        }catch(InputMismatchException ex){
            String resposta = "Valor inserido invalido!";
            System.out.println(resposta);
            ex = new InputMismatchException(resposta);
            escreverTxt(ex);
            
        }catch(ArithmeticException ex){
            String resposta = "Nao e possivel dividir por 0.";
            System.out.println(resposta);
            ex = new ArithmeticException(resposta);
            escreverTxt(ex);
            
        }catch(Exception ex){
            String resposta = "Algo deu errado.";
            ex = new Exception(resposta);
            escreverTxt(ex);
            System.out.println(resposta+"\n"+ex);
            
        }
    }
    
    public static void calcular(double x, double y)throws SinalNaoExiste{
        Calculos calculo = new Calculos(x, y);
        
        System.out.println("""
                           Digite 
                           [+] [-] [*] [/]""");
        
        Scanner sc = new Scanner(System.in);
        
        calculo.setOperacao(sc.next());
        
        switch (calculo.getOperacao()) {
            case "+":
                calculo.adicao();
                break;
            case "-":
                calculo.subtracao();
                break;
            case "*":
                calculo.multiplicacao();
                break;
            case "/":
               calculo.divisao();
                break;
            
            default:
                throw new SinalNaoExiste();
        }
        String r = String.format("\n "
                + "%.2f %s %.2f = %.2f"
                + "\n\n",calculo.getX(),calculo.getOperacao(),calculo.getY(),calculo.resultado());
        System.out.print(r);      
    }
    
    public static File criarTxt(){
        try {
            int i = 1;
            while(true){
                i++;
                File myObj = new File(String.format("logs/logs%d.txt",i));
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                    return myObj;
                } else {
                    System.out.print(".");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new File("");
        
    }
    
    public static void escreverTxt(Exception erro){
        
        String nome = criarTxt().getName();
        try {
            FileWriter myWriter = new FileWriter(String.format("logs/%s", nome));
            myWriter.write(erro.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
