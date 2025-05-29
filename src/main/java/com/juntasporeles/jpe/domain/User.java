package com.juntasporeles.jpe.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "password")
    private String Password;
    
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User(String login, String Password, UserRole role) {
        this.login = login;
        this.Password = Password;
        this.role = role;
    }
    
    
}
