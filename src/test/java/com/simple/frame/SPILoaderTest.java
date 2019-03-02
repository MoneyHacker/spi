package com.simple.frame;


import com.simple.frame.spi.Protocol;
import com.simple.frame.spi.SPILoader;
import com.simple.frame.spi.Task;
import org.junit.Test;

import java.util.Map;

/**
 * Unit test for simple App.
 */
public class SPILoaderTest {
    //自定义协议
    static Protocol protocol = new Protocol(){

        @Override
        public String getParameter(String key) {
            return key;
        }

        @Override
        public boolean hasParameter(String key) {
            return false;
        }

        @Override
        public String getParameter(String key, String defaultValue) {
            return key;
        }

        @Override
        public Map<String, String> getParameters() {
            return null;
        }
    };

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        SPILoader<Task> task = SPILoader.getExtensionLoader(Task.class);
        System.out.println(task.getExtension("taskOne").getName());
        System.out.println(task.getExtension("taskTwo").getName());
        Task  taskThree = task.getActivateExtension(protocol,"taskThree").get(0);
        System.out.println(taskThree.getName());
        System.out.println(task.getSupportedExtensions());
        System.out.println(task.getDefaultExtensionName());
    }
}
