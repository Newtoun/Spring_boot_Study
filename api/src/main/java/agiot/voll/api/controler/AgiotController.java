package agiot.voll.api.controler;

import agiot.voll.api.cliente.DadosCadastro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agiotas")
public class AgiotController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastro dados){
        System.out.println(dados);

    }
}
