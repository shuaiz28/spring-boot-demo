package com.example.demo.Infrastructures.Repositories.Entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;

    @Column(name = "user_name")
    private String name;

    private String password;
}
