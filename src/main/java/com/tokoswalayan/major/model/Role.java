/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tokoswalayan.major.model;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;


@Data
@Entity
@Table(name = "roles")
public class Role {
    
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(nullable = false, unique = true)
    @NotEmpty
    private String name;
    
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
