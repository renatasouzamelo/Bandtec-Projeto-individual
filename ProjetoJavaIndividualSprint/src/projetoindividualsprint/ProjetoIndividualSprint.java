package projetoindividualsprint;

import java.util.Scanner;

public class ProjetoIndividualSprint {

    public static void main(String[] args) {

        Scanner leitorGastosAtuais = new Scanner(System.in);
        Scanner leitorComInternetMais = new Scanner(System.in);
        Scanner leitorPassos = new Scanner(System.in);
        Scanner leitorInternet = new Scanner(System.in);
        Scanner leitorBrinde = new Scanner(System.in);

        System.out.println("Conheça a Internet Mais seu novo e mais sofisticado provedor de internet! \n"
                + "Informe qual valor você paga atualmente e te damos 20% nos 6 primeiros meses!");

        Double gastosComOutrasEmpresas = leitorGastosAtuais.nextDouble();
        Double desconto = gastosComOutrasEmpresas * 0.2;
        Double economia = gastosComOutrasEmpresas - desconto;

        System.out.println("Escolha um dos passos"
                + "\n1 - Realizar um orçamento"
                + "\n2 - Escolher um plano"
                + "\n3 - Brinde"
                + "\n4 - Sair");
        Integer opcoes = leitorPassos.nextInt();

        switch (opcoes) {

            case 1:
                System.out.println("Qual valor você paga atualmente? \n");
                System.out.println(String.format("Você gasta atualmente!R$ %.2f\n"
                        + "Contratando nossos serviços você terá uma econômia de: R$ %.2f mensais \n"
                        + "Com nosso serviço você passará a gastar mensalmente R$ %.2f \n",
                        gastosComOutrasEmpresas, desconto, economia));

            case 2:
                System.out.println("Digite a quantidade de Megas que você deseja:\n"
                        + "200 MEGAS \n300 MEGAS \n400 MEGAS");
                Integer quantidaMegas = leitorInternet.nextInt();

                if (quantidaMegas == 0) {
                    System.out.println("Numero inválido!");
                    break;
                } else if (quantidaMegas == 200) {
                    System.out.println("Parabéns você escolheu o plano de 200 MEGAS \n"
                            + "você irá pagar R$ 99,99/mês.");
                } else if (quantidaMegas == 300) {
                    System.out.println("Parabéns você escolheu o plano de 300 MEGAS \n"
                            + "você irá pagar R$ 119,99/mês");
                } else if (quantidaMegas == 400) {
                    System.out.println("Parabéns você escolheu o plano de 400 3MEGAS \n"
                            + "você irá pagar R$ 159,99/mês");
                }

            case 3:
                System.out.println("Ao adquirir nossos serviços você ganha um brinde esclusivo! \n");
                System.out.println("Escolha um brinde surpresa"
                        + "\n1 - Brinde 1"
                        + "\n2 - Brinde 2"
                        + "\n3 - Brinde 3");
                Integer brinde = leitorBrinde.nextInt();

                if (brinde >= 1) {
                    System.out.println("Parabéns você ganhou 6 meses gratuitos de manutenção"
                            + "ao adquirir nosso planos");

                } else if (brinde >= 2) {
                    System.out.println("Parabéns você ganhou um modem totalmente gratuito"
                            + " caso adquira nossos planos!");
                } else {
                    System.out.println("Parabéns você ganhou uma viagem para"
                            + " Gramado totalmente gratuita! caso adquira nosso plano");
                }

            case 4:
                System.out.println("Até logo");
                break;

        }
    }
}
