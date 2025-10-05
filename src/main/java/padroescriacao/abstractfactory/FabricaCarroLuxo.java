package padroescriacao.abstractfactory;

public class FabricaCarroLuxo implements FabricaDeCarro {
    @Override
    public Motor criarMotor() {
        return new MotorLuxo();
    }

    @Override
    public Roda criarRoda() {
        return new RodaLuxo();
    }

    @Override
    public Banco criarBanco() {
        return new BancoLuxo();
    }
}
