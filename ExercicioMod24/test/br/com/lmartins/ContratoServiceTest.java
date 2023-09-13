package br.com.lmartins;

import br.com.lmartins.dao.ContratoDao;
import br.com.lmartins.dao.IContratoDao;
import br.com.lmartins.dao.mocks.ContratoDaoMock;
import br.com.lmartins.service.ContratoService;
import br.com.lmartins.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author lucas.martins
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Dados do contrato encontrados", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Contrato excluído com sucesso", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Contrato atualizado com sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
