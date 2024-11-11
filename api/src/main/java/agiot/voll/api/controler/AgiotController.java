package agiot.voll.api.controler;

import agiot.voll.api.cliente.Agiota;
import agiot.voll.api.cliente.AgiotaRepository;
import agiot.voll.api.cliente.DadosCadastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agiotas")
public class AgiotController {

    @Autowired
    private AgiotaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastro dados){
        repository.save(new Agiota(dados));
    }
}
