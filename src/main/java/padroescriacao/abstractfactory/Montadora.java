package padroescriacao.abstractfactory;

public class Montadora {
    private Motor motor;
    private Roda roda;
    private Banco banco;

    public Montadora(FabricaDeCarro fabrica) {
        this.motor = fabrica.criarMotor();
        this.roda = fabrica.criarRoda();
        this.banco = fabrica.criarBanco();
    }

    public String exibirComponentes() {
        return "Carro montado com: " +
                motor.exibirTipo() + ", " +
                roda.exibirTipo() + ", e " +
                banco.exibirTipo() + ".";
    }
}
