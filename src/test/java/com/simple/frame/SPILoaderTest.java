package com.simple.frame;


import com.simple.frame.spi.SPILoader;
import com.simple.frame.spi.Task;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SPILoaderTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        SPILoader<Task> task = SPILoader.getExtensionLoader(Task.class);
        System.out.println(task.getExtension("taskOne").getName());
        System.out.println(task.getExtension("taskTwo").getName());
        System.out.println(task.getSupportedExtensions());
        System.out.println(task.getDefaultExtensionName());
        //System.out.println(task.getAdaptiveExtension().getName(new URL(new HashMap<>())));
    }
}
