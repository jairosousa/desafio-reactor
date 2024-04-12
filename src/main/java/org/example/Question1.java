package org.example;

import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 12/04/2024 - 14:53
 */
public class Question1 {

    /*
    Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados
     */
    public Flux<Long> inc(final List<Long> numbers) {
        return Flux.fromIterable(numbers)
                .map(n -> n + 1);
    }
}
