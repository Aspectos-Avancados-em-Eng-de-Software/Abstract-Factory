package padroescriacao.abstractfactory;

public interface FabricaDeCarro {
    Motor criarMotor();
    Roda criarRoda();
    Banco criarBanco();
}
