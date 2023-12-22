package com.microservice.userservice.UserService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
/*@AllArgsConstructor*/
/*@NoArgsConstructor*/
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name= "ID")
    private int userId;
    private String name;
    private String email;
    private String about;
    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
