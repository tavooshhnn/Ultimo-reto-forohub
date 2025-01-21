package com.forohub.tvs.domain.topicos;

public record DatosRespuestaTopico(Long id,
                                   String titulo,
                                   String mensaje,
                                   String nombreCurso,
                                   java.time.LocalDateTime fechaCreacion,
                                   String status,
                                   String autor) {
}