package integracao.bancodedados.contatos;

import integracao.bancodedados.model.ContatoModel;
import integracao.bancodedados.repository.ContatoRepository;
import org.aspectj.apache.bcel.classfile.ConstantString;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolationException;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatosRepositoryIntegrationTeste {

    @Autowired
    private ContatoRepository contatoRepository;

    @Rule
    private final ExpectedException expectedException = ExpectedException.none();

    private ContatoModel contato;

    @Before
    public void start(){
        contato = new ContatoModel("0y", "9xxxxxx9", "chefe");
    }

    @Test
    public void saveComDDNuloDeveLancarException() throws Exception {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("o ddd deve ser preenchido");

        contato.setDdd(null);
        contatoRepository.save(contato);
    }


}
