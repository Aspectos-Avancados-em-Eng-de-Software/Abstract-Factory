package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MontadoraTest {

    @Test
    void testMontadoraComFabricaCarroBasico() {
        FabricaDeCarro fabricaBasica = new FabricaCarroBasico();
        Montadora carroBasico = new Montadora(fabricaBasica);

        assertNotNull(carroBasico);
        assertTrue(carroBasico.exibirComponentes().contains("Motor 1.0 Flex"));
        assertTrue(carroBasico.exibirComponentes().contains("Roda de Aço 14 polegadas"));
        assertTrue(carroBasico.exibirComponentes().contains("Banco de Tecido Simples"));
        assertEquals("Carro montado com: Motor 1.0 Flex, Roda de Aço 14 polegadas, e Banco de Tecido Simples.", carroBasico.exibirComponentes());
    }

    @Test
    void testMontadoraComFabricaCarroLuxo() {
        FabricaDeCarro fabricaLuxo = new FabricaCarroLuxo();
        Montadora carroLuxo = new Montadora(fabricaLuxo);

        assertNotNull(carroLuxo);
        assertTrue(carroLuxo.exibirComponentes().contains("Motor V6 Turbo"));
        assertTrue(carroLuxo.exibirComponentes().contains("Roda de Liga Leve 18 polegadas"));
        assertTrue(carroLuxo.exibirComponentes().contains("Banco de Couro com Aquecimento"));
        assertEquals("Carro montado com: Motor V6 Turbo, Roda de Liga Leve 18 polegadas, e Banco de Couro com Aquecimento.", carroLuxo.exibirComponentes());
    }

    @Test
    void testFabricaCarroBasicoCriaProdutosCorretos() {
        FabricaDeCarro fabricaBasica = new FabricaCarroBasico();
        Motor motor = fabricaBasica.criarMotor();
        Roda roda = fabricaBasica.criarRoda();
        Banco banco = fabricaBasica.criarBanco();

        assertTrue(motor instanceof MotorBasico);
        assertTrue(roda instanceof RodaBasica);
        assertTrue(banco instanceof BancoBasico);

        assertEquals("Motor 1.0 Flex", motor.exibirTipo());
        assertEquals("Roda de Aço 14 polegadas", roda.exibirTipo());
        assertEquals("Banco de Tecido Simples", banco.exibirTipo());
    }

    @Test
    void testFabricaCarroLuxoCriaProdutosCorretos() {
        FabricaDeCarro fabricaLuxo = new FabricaCarroLuxo();
        Motor motor = fabricaLuxo.criarMotor();
        Roda roda = fabricaLuxo.criarRoda();
        Banco banco = fabricaLuxo.criarBanco();

        assertTrue(motor instanceof MotorLuxo);
        assertTrue(roda instanceof RodaLuxo);
        assertTrue(banco instanceof BancoLuxo);

        assertEquals("Motor V6 Turbo", motor.exibirTipo());
        assertEquals("Roda de Liga Leve 18 polegadas", roda.exibirTipo());
        assertEquals("Banco de Couro com Aquecimento", banco.exibirTipo());
    }

    @Test
    void testMontadoraComFabricaNula() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            new Montadora(null);
        });
        assertNotNull(exception);
    }
}
