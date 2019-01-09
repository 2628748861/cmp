package com.app.cmp.config.db.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class Test {
    @Id(autoincrement = true)
    Long id;

    @Generated(hash = 1270528455)
    public Test(Long id) {
        this.id = id;
    }

    @Generated(hash = 372557997)
    public Test() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
