import Entidades.Funcionario;
import Entidades.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o numero de funcionarios: ");
        int n = scanner.nextInt();

        List<Funcionario> funcionarioList = new ArrayList<>();

        for (int i = 1; i<=n; i++){
            System.out.println("");
            System.out.println("Dados do " + i + "# funcionario: ");
            System.out.print("Terceirizado? (s/n): ");
            String tipoFuncionario = scanner.next();

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Horas: ");
            int horas = scanner.nextInt();

            System.out.print("Valor por Hora: ");
            double valorPorHora = scanner.nextDouble();


            if (tipoFuncionario.contains("s")){
                System.out.print("Valor adicional: ");
                double valorAdicional = scanner.nextDouble();
                Funcionario funcionario = new Terceirizado(nome, horas, valorPorHora, valorAdicional);
                funcionarioList.add(funcionario);
            }else{
            Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                funcionarioList.add(funcionario);
            }

            System.out.println("");
            System.out.println("Pagamentos: ");
        }
        for (Funcionario x: funcionarioList) {
            System.out.println(x.toString());
        }
    }
}