package exercicio7;

import javax.swing.JOptionPane;

public class Exercicio7 {

    public static void main(String[] args) {
        int qtafuncionarios, i;
        double media = 0;
        double salario, mediaSalarial = 0;
        qtafuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários da empresa: "));
        for ( i = 1 ; i <= qtafuncionarios ; i++){
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do " + i + "° funcionário:" ));
            media = media + salario;
        }
        mediaSalarial = media/qtafuncionarios;
        
        System.out.println("A média salarial da empresa EVOLUA é: "+mediaSalarial);
    }
}
