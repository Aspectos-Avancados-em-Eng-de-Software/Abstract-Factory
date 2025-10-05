package padroescriacao.abstractfactory;

public class BancoBasico implements Banco {
    @Override
    public String exibirTipo() {
        return "Banco de Tecido Simples";
    }
}
