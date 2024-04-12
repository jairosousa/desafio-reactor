package org.example;

import reactor.core.publisher.Mono;

/**
 * @Autor Jairo Nascimento
 * @Created 12/04/2024 - 14:55
 */
public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user) {
        return Mono.justOrEmpty(user)
                .filter(u -> u.password().length() > 8)
                .switchIfEmpty(Mono.defer(() -> Mono.error(new Exception())))
                .then();
    }
}
