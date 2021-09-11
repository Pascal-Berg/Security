package com.example.security.Entitys;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "User")
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "active", nullable = false)
    private boolean active;
    @Column(name = "role", nullable = false)
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.active = true;
        this.role = role;
    }

    public User() {

    }
}
