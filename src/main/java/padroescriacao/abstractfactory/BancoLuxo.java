package padroescriacao.abstractfactory;

public class BancoLuxo implements Banco {
    @Override
    public String exibirTipo() {
        return "Banco de Couro com Aquecimento";
    }
}
