package com.manko.enums;

public enum Roles {

    ADMIN("ADMIN"),
    USER("USER");

    private String role;

    Roles(String role) {
        this.role = role;
    }

    public String role() {
        return role;
    }
}