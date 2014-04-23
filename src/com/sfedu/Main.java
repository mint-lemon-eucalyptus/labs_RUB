package com.sfedu;

/**
 * Created by user00 on 3/24/14.
 */

import com.sfedu.test.Animal;
import com.sfedu.test.Cat;
import com.sfedu.test.Dog;
import com.sfedu.test.Domesticity;
import org.apache.log4j.Logger;

public class Main {
    public static void main(final String[] args) {
/*        String prop = System.getProperty("datasource.config");
        System.out.println("get prop " + prop);

        PropertiesManager pm = new PropertiesManager();
        Properties props = pm.getProperties();
        System.out.println(props);

/*        props.put("dbtype", "postgresql9.3");
        props.put("host", "localhost");
        props.put("dbname", "gatein");
        props.put("dbuser", "gatein");
        props.put("dbpassword", "12");
        pm.append(props);
  */
//        testInitConnection();

        Dog re=new Dog("dog 1");
        Domesticity dom = new Domesticity();
        dom.attach(new Cat("cat 1"));
        dom.attach(re);
        dom.attach(new Dog("dog 2"));
        dom.attach(new Cat("cat 3"));
        dom.attach(new Animal("Animal 1"));
        dom.noise();
//        dom.detach(9);
  //      dom.detach(2);
        dom.detach(re);
    }

    public static final Logger LOG = Logger.getLogger(Main.class);

    public static void testInitConnection() {
        DbConnection conn = new DbConnection();
        LOG.info("Hello World!");
    }
}
