package br.com.lmartins;

import br.com.lmartins.dao.ClienteDao;
import br.com.lmartins.dao.ClienteDaoMock;
import br.com.lmartins.dao.IClienteDao;
import br.com.lmartins.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author lucas.martins
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = (IClienteDao) new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
