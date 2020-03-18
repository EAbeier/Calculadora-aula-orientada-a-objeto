//CLASSE Calculadora:

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;



/**
 *
 * @author alu2018210474
 */
public class Calculadora {
    private int op1,op2,result;
    private char operacao;
    private Operacao[] operacoes;

    public Calculadora(){
        this.operacoes= new Operacao[4];
        this.operacoes[0] = new Soma();
        this.operacoes[1] = new Soma();
        this.operacoes[2] = new Soma();
        this.operacoes[3] = new Soma();
    }

    private void escolheOperacao(){
        int i;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("Informe operador : (+ - / *)");
        this.operacao = scan.next().charAt(0);
    }

    private void entrada1(){
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Informe operando 1:");
        this.op1 = scan.nextInt();
    }

    private void entrada2(){
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Informe operando 2:");
        this.op2 = scan.nextInt();
    }
    private float calcular() {
        float ret = 0;
        switch (this.operacao) {
            case '+':
                ret = (this.op1 + this.op2);
                break;
            case '-':
                ret = (this.op1 - this.op2);
                break;
            case '*':
                ret = (this.op1 * this.op2);
                break;
            case '/':
                ret = (this.op1 / this.op2);
                break;
            default:
                System.out.println("Operação Não conhecida");
        }
        return ret;
    }
        private String descreverOperacao(){
            return (this.op1+" "+this.operacao + " "+this.op2+ " = ");
        }
        public void run() {
            this.entrada1();
            this.escolheOperacao();
            this.entrada2();

            System.out.println(this.descreverOperacao()
                    +this.operacoes[0].calcular(op1, op2)
            );



        }
}
