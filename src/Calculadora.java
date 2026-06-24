import java.util.Scanner;

void main() {
    double num1, num2;
    double result;
    Scanner scan = new Scanner(System.in);
    String recomeçar = "S";
    System.out.println("Bem vindo à minha calculadora simples.");
    // Loop do programa para caso o usuário queira fazer outra operação, ignorando se é maiúsculo ou minúsculo.
    while (recomeçar.equalsIgnoreCase("S")) {
        System.out.println("Digite o primeiro número:");
        // Validação se o que foi digitado é um int.
        while (!scan.hasNextDouble()) {
            System.out.println("Erro: Isso não é um número válido! Tente novamente:");
            scan.nextLine();
        }
        num1 = scan.nextDouble();
        scan.nextLine(); // Limpa o buffer do Enter após o nextInt().
        System.out.println("Qual operação você quer realizar? (+, -, x, /)");
        String operaçao = scan.nextLine();
        // Validação se o que foi digitado é exatamente uma das operações possíveis. Se não for, volta desde o começo.
        if(!operaçao.matches("[+x/-]")) {
            System.out.println("Operação inválida. Tentando novamente.");
            continue;
        }
        switch(operaçao) {
            case "+":
                System.out.println("Digite o número pelo qual você quer somar o primeiro:");
                // Validação se é um int.
                while (!scan.hasNextDouble()) {
                    System.out.println("Erro: Isso não é um número válido! Tente novamente:");
                    scan.nextLine();
                }
                num2 = scan.nextDouble();
                scan.nextLine();
                result = num1 + num2;
                System.out.println("O resultado da soma é: " + result);
                break;
            case "-":
                System.out.println("Digite o número pelo qual você quer subtrair do primeiro:");
                while (!scan.hasNextDouble()) {
                    System.out.println("Erro: Isso não é um número válido! Tente novamente:");
                    scan.nextLine();
                }
                num2 = scan.nextDouble();
                scan.nextLine();
                result = num1 - num2;
                System.out.println("O resultado da subtração é: " + result);
                break;
            case "x":
                System.out.println("Digite o número pelo qual você quer multiplicar o primeiro:");
                while (!scan.hasNextDouble()) {
                    System.out.println("Erro: Isso não é um número válido! Tente novamente:");
                    scan.nextLine();
                }
                num2 = scan.nextDouble();
                scan.nextLine();
                result = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + result);
                break;
            case "/":
                System.out.println("Digite o número pelo qual você quer dividir o primeiro:");
                while (!scan.hasNextDouble()) {
                    System.out.println("Erro: Isso não é um número válido! Tente novamente:");
                    scan.nextLine();
                }
                num2 = scan.nextDouble();
                scan.nextLine();
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                    break;
                }
                else{
                    result = num1 / num2;
                    System.out.println("O resultado da divisão é: " + result);
                    break;
                }

        }
        System.out.println("Você quer fazer outra operação? (S, N)");
        recomeçar = scan.nextLine();
        // Validação para caso o usuário coloque algo diferente de S ou N.
        while(!recomeçar.matches("[SsNn]")){
            System.out.println("Comando errado. Você quer fazer outra operação? (S = Sim, N = Não)");
            recomeçar = scan.nextLine();
        }
    }
    System.out.println("Obrigado por usar minha calculadora :)");
}