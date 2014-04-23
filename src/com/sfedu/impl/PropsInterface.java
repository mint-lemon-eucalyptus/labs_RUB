package com.sfedu.impl;

import java.util.Properties;

/**
 * Created by user00 on 3/24/14.
 */
public interface PropsInterface {
    public void read(String path);

    public void append(Properties prop);
    //   public void save(Properties prop);
}
