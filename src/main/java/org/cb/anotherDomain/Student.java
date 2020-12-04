package org.cb.anotherDomain;

import javax.persistence.Id;

public class Student {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
