package br.com.bnp.teste.movimento_manual.repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.bnp.teste.movimento_manual.entity.Movimento;

@Repository
@Transactional(readOnly = true)
public class MovimentoRepositoryImpl implements MovimentoRepositoryCustom {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Movimento> getAllMovimento() {
		List<Movimento> retorno = new ArrayList<>();
		Query query = entityManager.createNativeQuery(
				"SELECT dat_mes, dat_ano, cod_produto , des_produto,num_lancamento ,des_descricao ,val_valor FROM  testebnp.proc_movimentos()");
		List<Object[]> objects = query.getResultList();
		objects.stream().forEach(obj -> {
			Movimento movimento = new Movimento();
			if (obj[0] != null) {
				movimento.setDatMes((Integer) obj[0]);
			}
			if (obj[1] != null) {
				movimento.setDatAno((Integer) obj[1]);
			}
			if (obj[2] != null) {
				movimento.setCodProduto(obj[2].toString());
			}
			if (obj[3] != null) {
				movimento.setDesProduto(obj[3].toString());
			}
			if (obj[4] != null) {
				movimento.setNumLancament(((BigInteger) obj[4]).longValue());
			}
			if (obj[5] != null) {
				movimento.setDesDescricao(obj[5].toString());
			}
			if (obj[6] != null) {
				movimento.setValValor((BigDecimal) obj[6]);
			}
			retorno.add(movimento);
		});
		return retorno;
	}

}
