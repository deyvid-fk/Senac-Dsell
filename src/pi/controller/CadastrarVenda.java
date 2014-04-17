package pi.controller;

import java.util.ArrayList;
import java.util.List;
import static java.util.UUID.randomUUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.annotation.Resource;
import static javax.swing.JOptionPane.showMessageDialog;
import pi.dao.DaoVenda;
import static pi.dao.DaoVenda.getVENDAS;
import pi.model.ModelVenda;
import static util.GeraString.getAno;
import static util.GeraString.getMesDoAno;
import static util.Time.getDate;

public class CadastrarVenda extends DaoVenda {

    private static final Logger LOG = getLogger(CadastrarVenda.class.getName());

    /**
     * Define o trimestre do ano que desejar obter a rentabilidade.
     *
     * @param m1 1º mês
     * @param m2 2º mês
     * @param m3 3º mês
     * @param ano ano
     * @return
     */
    public static double getRendimentoVendaPorTrimestre(int m1, int m2, int m3, int ano) {
        if (getVENDAS() != null) {
            List<ModelVenda> vendas = new ArrayList<>(getVENDAS());
            double rendimento = 0.0;
            for (int i = 0; i < vendas.size(); i++) {
                while (vendas.get(i).getMes() == m1 && vendas.get(i).getAno() == ano || vendas.get(i).getMes() == m2 && vendas.get(i).getAno() == ano || vendas.get(i).getMes() == m3 && vendas.get(i).getAno() == ano) {
                    vendas.remove(i);
                    if (i == vendas.size()) {
                        break;
                    }
                }
            }

            for (ModelVenda modelVenda : vendas) {
                rendimento += modelVenda.getPrecoFinal();
            }
            return rendimento;
        }
        return 0;
    }

    public boolean cadastrar(Integer txtIdProduto, Integer txtIdComprador, Double txtPreco, Integer txtDesconto) {
        try {
            ModelVenda instancePJ = new ModelVenda();
            int newId = (getVENDAS().size() - 1) + 1;
            instancePJ.setId(newId);
            instancePJ.Guid = randomUUID().toString();
            instancePJ.setIdProduto(txtIdProduto);
            instancePJ.setIdComprador(txtIdComprador);
            instancePJ.setPreco(txtPreco);
            instancePJ.setDesconto(txtDesconto);
            instancePJ.setPrecoFinal(instancePJ.getPrecoFinal());
            instancePJ.setDataDaVenda(getDate());
            instancePJ.setMes(getMesDoAno());
            instancePJ.setAno(getAno());
            getVENDAS().add(instancePJ);
            createXml(getVENDAS());
            return true;
        } catch (Exception e) {
            showMessageDialog(null, e.getMessage());
            getLogger(Resource.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
}
