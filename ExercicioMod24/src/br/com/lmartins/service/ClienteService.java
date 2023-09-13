package br.com.lmartins.service;

import br.com.lmartins.dao.ClienteDao;
import br.com.lmartins.dao.ClienteDaoMock;
import br.com.lmartins.dao.IClienteDao;

/**
 * @author lucas.martins
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
