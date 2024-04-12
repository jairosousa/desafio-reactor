package org.example;

/**
 * @Autor Jairo Nascimento
 * @Created 12/04/2024 - 14:54
 */
public record User(
        Long id,
        String name,
        String email,
        String password,
        Boolean isAdmin
) {
}
