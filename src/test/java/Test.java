import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
public class Test {

    @org.junit.Test
    public void test01(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }

    @org.junit.Test
    public void test02(){
        Logger logger = LoggerFactory.getLogger(Person.class);
        logger.debug("信息：");
    }

    @org.junit.Test
    public void test03(){
        StringBuilder stringBuilder = new StringBuilder("hello,world!");
        System.out.println(stringBuilder);
    }
}
