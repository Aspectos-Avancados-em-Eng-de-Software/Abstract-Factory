package padroescriacao.abstractfactory;

public class FabricaCarroBasico implements FabricaDeCarro {
    @Override
    public Motor criarMotor() {
        return new MotorBasico();
    }

    @Override
    public Roda criarRoda() {
        return new RodaBasica();
    }

    @Override
    public Banco criarBanco() {
        return new BancoBasico();
    }
}
