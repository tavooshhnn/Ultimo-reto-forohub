package com.forohub.tvs.domain.topicos;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(

        @NotNull
        Long id,

        String titulo,

        String mensaje,

        String nombreCurso,

        Estado status,

        String autor
) {
}