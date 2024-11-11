package agiot.voll.api.cliente;

import agiot.voll.api.divida.Divida;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Table(name = "agiota")
@Entity(name = "Agiota")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= "id")
public class Agiota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;
    private String genero;

    @Embedded
    private Divida divida;


    public Agiota(DadosCadastro dados) {
        this.nome = dados.nome();
        this.idade = dados.idade();
        this.genero = dados.genero();
        this.divida = new Divida(dados.divida());
    }
}
