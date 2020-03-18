public class Soma extends Operacao {

    public Soma() {
        simbolo = '+';
    }
    @Override
    public float calcular(float op1, float op2) {
        return op1 + op2;
    }

}
