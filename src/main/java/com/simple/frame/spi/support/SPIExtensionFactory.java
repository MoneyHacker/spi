
package com.simple.frame.spi.support;

import com.simple.frame.spi.SPIFactory;
import com.simple.frame.spi.annotation.SPI;
import com.simple.frame.spi.SPILoader;

/**
 * SpiExtensionFactory
 */
public class SPIExtensionFactory implements SPIFactory {

    @Override
    public <T> T getExtension(Class<T> type, String name) {
        if (type.isInterface() && type.isAnnotationPresent(SPI.class)) {
            SPILoader<T> loader = SPILoader.getExtensionLoader(type);
            if (!loader.getSupportedExtensions().isEmpty()) {
                return loader.getAdaptiveExtension();
            }
        }
        return null;
    }

}
