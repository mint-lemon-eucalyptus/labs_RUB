package com.sfedu.lib;


import com.sfedu.impl.PropsInterface;

import java.io.*;
import java.util.Properties;

/**
 * Created by user00 on 3/24/14.
 */
public class PropertiesManager implements PropsInterface {
    OutputStream output = null;
    private String configFileLocation = null;
    private final String defaultLocation = "source/example.conf";
    private Properties properties = new Properties();

    public PropertiesManager() {
        String prop = System.getProperty("datasource.config");
        this.configFileLocation = (prop != null) ? prop : defaultLocation;
    }

    @Override
    public void append(Properties prop) {
        OutputStream output = null;

        try {

            output = new FileOutputStream(this.configFileLocation);
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    @Override
    public void read(String path) {
        InputStream input = null;
        try {
            input = new FileInputStream(path);
            this.properties.load(input);
            System.out.println(this.properties);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Properties getProperties() {
        if (this.properties != null) {
            read(this.configFileLocation);
        }
        return this.properties;
    }

}