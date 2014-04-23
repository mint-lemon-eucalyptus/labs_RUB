package com.sfedu;

import com.sfedu.entity.Entity;
import com.sfedu.impl.DbConnInterface;
import com.sfedu.lib.PropertiesManager;

import java.util.Properties;

/**
 * Created by user00 on 3/24/14.
 */
public class DbConnection implements DbConnInterface {
    private String host = null;
    private String dbname = null;
    private String dbuser = null;
    private String dbpassword = null;

    public DbConnection() {
        PropertiesManager pm = new PropertiesManager();
        Properties p = pm.getProperties();
        this.dbname = p.getProperty("dbname");
        this.dbuser = p.getProperty("dbuser");
        this.dbpassword = p.getProperty("dbpassword");
        this.host = p.getProperty("host");
    }

    @Override
    public void delete(int id) {

    }


    @Override
    public void insert(Entity e) {

    }

    @Override
    public void update(Entity e) {

    }
}
