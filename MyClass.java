/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class MyClass {
  public static void main(String args[]) {
 
    
    //Variáveis
    int idade = 16; //números inteiros
    double salario = 1.75; //números quebrados
    char letra = 'M'; //letra ou Símbolo
    boolean estudante = true; // true or false
    String nome = "Maria"; // texto
    
    
    System.out.println("Minha idade é " + idade);
    System.out.println("O salário é " + salario);
    System.out.println("A letra é " + letra);
    System.out.println("Você é estudante? " + estudante);
    System.out.println("Meu nome é " + nome);
    
    //Operadores Aritméticos
   
    
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    
    System.out.println ("Soma: " + soma);
    System.out.println ("Subtração: " + sub);
    System.out.println ("Multiplicação: " + mult);
    System.out.println ("Divisão: " + div);
    
    
    //Cálculo da área de um retângulo
    //largura * comprimento 
    
    double largura = 7.5;
    double comprimento = 3.0;
    double area = largura * comprimento;
    
    System.out.println ("Área: " + area);
   
   ///Cálculo do desconto
   
   double valor = 100;
   double desconto = 15;
   double valorDesc = valor * (desconto /100);
   double valorFinal = valor - valorDesc;
   System.out.println ("A pagar: " + valorFinal);
    
  }
}