import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

  Funcionario f = new Funcionario();
  Scanner sc = new Scanner(System.in);

  System.out.println("Digite seu nome completo: ");
  String nome = sc.nextLine();

  System.out.println("Digite a sua matrícula: ");
  int matricula = sc.nextInt();

  System.out.println("Digite seu salário bruto: ");
  double salarioBruto = sc.nextInt();

  double descontoINSS = salarioBruto* f.porcentagemINSS;
  double calculoSalario = salarioBruto - descontoINSS;


    System.out.println("----Dados do Funcionário----" +
    "\nMatrícula: "+ matricula +
    "\nNome completo: "+ nome +
    "\nSalário Bruto: "+ salarioBruto +
    "\nDesconto INSS: "+ descontoINSS +
    "\nSalário Líquido: "+ calculoSalario);
  }
}
