package com.amano.springBoot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * create by amano
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String mail;

    private String code;

    private String staus;

    @Column(name = "count", columnDefinition = "long default 0")
    private Long count = 0l;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", code='" + code + '\'' +
                ", staus='" + staus + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}