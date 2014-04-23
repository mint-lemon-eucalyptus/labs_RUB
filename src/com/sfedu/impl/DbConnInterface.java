package com.sfedu.impl;

/**
 * Created by user00 on 3/24/14.
 */
public interface DbConnInterface {

    public void delete(int id);



    public void insert(com.sfedu.entity.Entity e);

    public void update(com.sfedu.entity.Entity e);
}
