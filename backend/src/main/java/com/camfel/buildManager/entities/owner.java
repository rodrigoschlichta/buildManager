package com.camfel.buildManager.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_owner")
public class owner implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;

    public owner() {
    }

    public owner(String name, Long id, String phone, String email) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return id;
    }

    public void setCpf(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        owner owner = (owner) o;
        return Objects.equals(id, owner.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
