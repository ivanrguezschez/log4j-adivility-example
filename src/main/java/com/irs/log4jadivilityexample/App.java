package com.irs.log4jadivilityexample;

import com.irs.log4jadivilityexample.bar.BarBean;
import com.irs.log4jadivilityexample.foo.FooBean;
import org.apache.log4j.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        FooBean fooBean = new FooBean();
        BarBean barBean = new BarBean();
        
        logger.debug("Hello there from App class!");
        
        fooBean.sayHello();
        barBean.sayHello();
    }
}
