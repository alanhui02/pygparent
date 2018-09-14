package com.pyg.pojo;

import java.io.Serializable;

public class ContentCategory implements Serializable {
    private static final long serialVersionUID = 8697686257761424116L;
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}