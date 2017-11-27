/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author Pablo Durkheim
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** 
         * @param paramêtros a serem utilizados no futuros
         */
        
        int x1;     
        int x2;
        int x3;
        int x4;
        Scanner sc = new Scanner(System.in);
        
        /** Menu inicial usado para o usuário escolher algumas opções */
        System.out.println("---Olá, seja bem-vindo---");
        System.out.println("");
        System.out.println("1 - Para Somar números"+"\n"+"2 - Para Diminuir números"+"\n"+"3 - Para Multiplicar números"+"\n"+"4 - Para Dividir números"+"\n"+
                "5 - Para Concatenar"+"\n");
        
        System.out.println("Digite aqui: ");
        
        x1 = sc.nextInt();
        
        System.out.println("");
        
        if(x1 == 1){
            
            Somar s = new Somar();
            
            System.out.println("1 - Para Somar 2 números"+"\n"+"2 - Para Somar 3 números"+"\n"+"3 - Para Somar 4 números"+"\n");
            System.out.println("Digite aqui: ");
            
            x1 = sc.nextInt();
            System.out.println("");
            
            if(x1 == 1){
            
            System.out.println("Insira o 1º número:");
            x1 = sc.nextInt();
            
            System.out.println("Insira o 2º número:");
            x2 = sc.nextInt();
            
            s.somarDoisNumeros(x1, x2);
                
            }
            
            if(x1 == 2){
                
                System.out.println("Insira o 1º número:");
                x1 = sc.nextInt();
            
                System.out.println("Insira o 2º número:");
                x2 = sc.nextInt();
                
                System.out.println("Insira o 3º número:");
                x3 = sc.nextInt();
                
                s.somarTresNumeros(x1, x2, x3);
                
            }
            
            if(x1 == 3){
                
                System.out.println("Insira o 1º número:");
                x1 = sc.nextInt();
            
                System.out.println("Insira o 2º número:");
                x2 = sc.nextInt();
                
                System.out.println("Insira o 3º número:");
                x3 = sc.nextInt();
                
                System.out.println("Insira o 4º número:");
                x4 = sc.nextInt();
                
                s.somarQuatroNumeros(x1, x2, x3, x4);
                
                
            }
            
            
        }
        
        if(x1 == 2){
            
            Diminuir d = new Diminuir();
            
            System.out.println("1 - Para Diminuir 2 números"+"\n"+"2 - Para Diminuir 3 números"+"\n"+"3 - Para Diminuir 4 números"+"\n");
            System.out.println("Digite aqui: ");
            
            x1 = sc.nextInt();
            System.out.println("");
            
            if(x1 == 1){
            
            System.out.println("Insira o 1º número:");
            x1 = sc.nextInt();
            
            System.out.println("Insira o 2º número:");
            x2 = sc.nextInt();
            
            d.subtrairDoisNumeros(x1, x2);
                
            }
            
            if(x1 == 2){
                
                System.out.println("Insira o 1º número:");
                x1 = sc.nextInt();
            
                System.out.println("Insira o 2º número:");
                x2 = sc.nextInt();
                
                System.out.println("Insira o 3º número:");
                x3 = sc.nextInt();
                
                d.subtrairTresNumeros(x1, x2, x3);
                
            }
            
            if(x1 == 3){
                
                System.out.println("Insira o 1º número:");
                x1 = sc.nextInt();
            
                System.out.println("Insira o 2º número:");
                x2 = sc.nextInt();
                
                System.out.println("Insira o 3º número:");
                x3 = sc.nextInt();
                
                System.out.println("Insira o 4º número:");
                x4 = sc.nextInt();
                
                d.subtrairQuatroNumeros(x1, x2, x3, x4);
                
                
            }
            
        }
        
        if(x1 == 3){
            
            Multiplicar m = new Multiplicar();
            
            System.out.println("1 - Para Multiplicar 2 números"+"\n"+"2 - Para Multiplicar 3 números"+"\n"+"3 - Para Multiplicar 4 números"+"\n");
            System.out.println("Digite aqui: ");
            
            x1 = sc.nextInt();
            System.out.println("");
            
            if(x1 == 1){
            
            System.out.println("Insira o 1º número:");
            x1 = sc.nextInt();
            
            System.out.println("Insira o 2º número:");
            x2 = sc.nextInt();
            
            m.multiplicarDoisNumeros(x1, x2);
                
            }
            
            if(x1 == 2){
                
                System.out.println("Insira o 1º número:");
                x1 = sc.nextInt();
            
                System.out.println("Insira o 2º número:");
                x2 = sc.nextInt();
                
                System.out.println("Insira o 3º número:");
                x3 = sc.nextInt();
                
                m.multiplicarTresNumeros(x1, x2, x3);
                
            }
            
            if(x1 == 3){
                
                System.out.println("Insira o 1º número:");
                x1 = sc.nextInt();
            
                System.out.println("Insira o 2º número:");
                x2 = sc.nextInt();
                
                System.out.println("Insira o 3º número:");
                x3 = sc.nextInt();
                
                System.out.println("Insira o 4º número:");
                x4 = sc.nextInt();
                
                m.multiplicarQuatroNumeros(x1, x2, x3, x4);
                
                
            }
            
        }
        
        if(x1 == 4){
            
            Dividir D = new Dividir();
            
            System.out.println("1 - Para dividr 2 números"+"\n"+"2 - Para dividr 3 números"+"\n"+"3 - Para dividr 4 números"+"\n");
            System.out.println("Digite aqui: ");
            
            double d1 = sc.nextInt();
            System.out.println("");
            
            if(d1 == 1){
            
            System.out.println("Insira o 1º número:");
            d1 = sc.nextDouble();
            
            System.out.println("Insira o 2º número:");
           double  d2 = sc.nextDouble();
            
            D.dividirDoisNumeros(d1, d2);
                
            }
            
            if(d1 == 2){
                
                System.out.println("Insira o 1º número:");
                d1 = sc.nextDouble();
            
                System.out.println("Insira o 2º número:");
                double d2 = sc.nextInt();
                
                System.out.println("Insira o 3º número:");
                double d3 = sc.nextInt();
                
                D.dividirTresNumeros(d1, d2, d3);
                
            }
            
            if(d1 == 3){
                
                System.out.println("Insira o 1º número:");
                d1 = sc.nextDouble();
            
                System.out.println("Insira o 2º número:");
                double d2 = sc.nextDouble();
                
                System.out.println("Insira o 3º número:");
                double d3 = sc.nextDouble();
                
                System.out.println("Insira o 4º número:");
                double d4 = sc.nextDouble();
                
                D.dividirQuatroNumeros(d1, d2, d3, d4);
                
                
            }
            
        }
        
        if(x1 == 5){
            
            Concatenar c = new Concatenar();
            
            System.out.println("1 - Para Concatenar 2 palavras"+"\n"+"2 - Para Concatenar 3 palavras"+"\n"+"3 - Para Concatenar 4 palavras"+"\n");
            System.out.println("Digite aqui: ");
            
            x1 = sc.nextInt();
            System.out.println("");
            
            if(x1 == 1){
            
            System.out.println("Insira o 1º:");
            String s1 = sc.next();
            
            System.out.println("Insira o 2º:");
            String s2 = sc.next();
            
            c.concatenarDuasPalavras(s1, s2);
                
            }
            
            if(x1 == 2){
                
                System.out.println("Insira o 1º:");
                String s1 = sc.next();
            
                System.out.println("Insira o 2º:");
                String s2 = sc.next();
                
                System.out.println("Insira o 3º:");
                String s3 = sc.next();
                
                c.concatenarTresPalavras(s1, s2, s3);
                
            }
            
            if(x1 == 3){
                
                System.out.println("Insira o 1º:");
                String s1 = sc.next();
            
                System.out.println("Insira o 2º número:");
                String s2 = sc.next();
                
                System.out.println("Insira o 3º:");
                String s3 = sc.next();
                
                System.out.println("Insira o 4º:");
                String s4 = sc.next();
                
                c.concatenarQuatroPalavras(s1, s2, s3, s4);
                
                
            }
            
        }
        
    }
    
}
