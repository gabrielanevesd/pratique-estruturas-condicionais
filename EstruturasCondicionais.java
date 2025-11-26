//Escreva um programa que solicite ao usuário dois números inteiros.

//Depois, verifique qual é o maior número.

//Imprima no console o maior número, sendo o formato da mensagem o seguinte: "O maior número é: {numero}.". Exemplo: O maior número é: 7.

//Caso os números sejam iguais, imprimir a mensagem: "Os números são iguais!"

//Observação:
//Utilizar o scanner para a entrada de dados dos dois números.
//Para as condições, utilizar: if, else if, else.
//Compartilhe o link do repositório na plataforma para a correção dos tutores.

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //Solicitar ao usuário dois números int: vou usar scanner e int
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite outro número: ");

        int segundoNumero = scanner.nextInt();

        //Qual número é maior?

        if (primeiroNumero > segundoNumero) {

            System.out.println("O maior número é: " + primeiroNumero);
        }

        else if (primeiroNumero < segundoNumero) {

            System.out.println("O maior número é: " + segundoNumero);
        }

        else {
            System.out.println("Os números são iguais!");
        }

    scanner.close();

    }
}