package com.yhh.spring.data.jpa.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -682249945382220765L;
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    private String username;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }
}
