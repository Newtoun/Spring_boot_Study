package agiot.voll.api.cliente;
import agiot.voll.api.divida.DadosDivida;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCadastro(
        @NotBlank
        String nome,
        @NotBlank
        String idade,
        @NotBlank
        String genero,
        @NotBlank
        @Valid
        DadosDivida divida ) {


}

