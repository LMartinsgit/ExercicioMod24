package br.com.lmartins.service;

import br.com.lmartins.dao.IContratoDao;

/**
 * @author lucas.martins
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Dados do contrato encontrados";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Contrato excluído com sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Contrato atualizado com sucesso";
    }
}
