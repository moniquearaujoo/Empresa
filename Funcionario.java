public class Funcionario {

  int matricula;
  private String monique;
  String nome = monique;
  double porcentagemINSS = 0.15;
  double salarioBruto;
  double salarioLiquido;
  double descontoINSS;

  public void totalDesconto(double porcentagemINSS, double salarioBruto) {
    descontoINSS = salarioBruto*porcentagemINSS;
  }

}
