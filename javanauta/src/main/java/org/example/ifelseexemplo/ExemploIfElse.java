package org.example.ifelseexemplo;

public class ExemploIfElse {
    public static void main(String[] args) {

        //exemplo de if else
        int idade = 17;
        if (idade >= 18 ){
            System.out.println("vc e maior de idade");
        }else {
            System.out.println("vc e menor de idade");
        }

        int salario = 1500;

        if (salario <= 2000){
            System.out.println("seu salario e menor que R$: 2500 vc esta isento de irr");
        }else {
            System.out.println("vc tem que declara imposto de renda!!!");
        }

    }
}
