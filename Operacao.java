public abstract class Operacao {
    protected char simbolo;

    public abstract float calcular(float op1, float op2);

    public char getSimbolo() {
        return this.simbolo;
    }

}
