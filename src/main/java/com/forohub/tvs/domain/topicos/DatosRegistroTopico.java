package com.forohub.tvs.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(

        @NotBlank(message = "El título es obligatorio")
        String titulo,

        @NotBlank(message = "El mensaje es obligatorio")
        String mensaje,

        @NotBlank(message = "El nombre del curso es obligatorio")
        String nombreCurso,

        @NotBlank(message = "El autor es obligatorio")
        String autor
) {
}