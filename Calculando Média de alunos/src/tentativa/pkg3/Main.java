/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tentativa.pkg3;

import java.util.Scanner; // Importa  a classe para a entrada de dados.

/**
 *
 * @author sabrinadesa
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de alunos que você deseja cadastrar? ");
        
//Essa parte é responsável por ler a quantidade de alunos a sere cadastrados.       
        int totalDeAlunos = scanner.nextInt();  

//Aqui criará um array para armazena o objeto aluno.         
        Aluno[] alunosArray = new Aluno[totalDeAlunos];

        
// Variáveis de contrale        
        int totalRun = totalDeAlunos;
        int numeroAluno = 1;
        int index = 0;

// Loop que cadastrá os alunos 
        do {

            System.out.println("---------- Aluno #: " + numeroAluno + "---------- ");

            System.out.println("Digite nome do aluno: ");
            String nomedoAluno = scanner.next();

            System.out.println("Digite RA do aluno: ");
            int rA = scanner.nextInt();

            System.out.println("Digite nota A1: ");
            int nota1 = scanner.nextInt();

            System.out.println("Digite nota A2: ");
            int nota2 = scanner.nextInt();

            System.out.println("Digite nota A3: ");
            int nota3 = scanner.nextInt();
                   
            
            alunosArray[index] = new Aluno(nomedoAluno, rA, new int[]{nota1, nota2, nota3});

            index++;
            numeroAluno++;
            totalRun--;

        } while (totalRun != 0);

    
        
// Essa parte imprime os resultados.        
        System.out.println("------------------------------ Lista de Alunos ------------------------------ ");

        
        for (Aluno alunosArray1 : alunosArray) {
            System.out.println(alunosArray1.toString());
        }

        
    }
}
