package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 12/04/2024 - 14:54
 */
public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        return Flux.fromIterable(users)
                .filter(user -> user.isAdmin())
                .count();
    }

}
