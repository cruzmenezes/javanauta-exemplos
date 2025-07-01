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


        boolean temDinheiro = true;

       // if (temDinheiro == true){
           // System.out.println("compra comida");
       // }else {
           // System.out.println("come o que tem");
        //}


        System.out.println("ternaria");
        String mensagem = (temDinheiro) ? "compra comida" : "come o que tem";

        System.out.println(mensagem);



    }
}
