package br.com.lmartins;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author lucas.martins
 */

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");
        cli.adicionarNome1("Rodrigo");

        Assert.assertEquals("Rodrigo", cli.getNome());
    }
}
