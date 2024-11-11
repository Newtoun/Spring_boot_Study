package agiot.voll.api.divida;

import jakarta.validation.constraints.NotBlank;

public record DadosDivida(
        @NotBlank
        String valor,
        @NotBlank
        String taxa) {

}
