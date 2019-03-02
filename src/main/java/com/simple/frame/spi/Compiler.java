package com.simple.frame.spi;

import com.simple.frame.spi.annotation.SPI;

/**
 * Compiler. (SPI, Singleton, ThreadSafe)
 * default implement is javassist
 */
@SPI("javassist")
public interface Compiler {

    /**
     * Compile java source code.
     *
     * @param code          Java source code
     * @param classLoader   classloader
     * @return              Compiled class
     */
    Class<?> compile(String code, ClassLoader classLoader);

}
