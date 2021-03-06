
package com.simple.frame.spi.support;


import com.simple.frame.spi.annotation.Adaptive;
import com.simple.frame.spi.SPIFactory;
import com.simple.frame.spi.SPILoader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * AdaptiveExtensionFactory
 */
@Adaptive
public class AdaptiveSPIFactory implements SPIFactory {
    private final List<SPIFactory> factories;

    public AdaptiveSPIFactory() {
        SPILoader<SPIFactory> loader = SPILoader.getExtensionLoader(SPIFactory.class);
        List<SPIFactory> list = new ArrayList<>();
        for (String name : loader.getSupportedExtensions()) {
            list.add(loader.getExtension(name));
        }
        factories = Collections.unmodifiableList(list);
    }

    @Override
    public <T> T getExtension(Class<T> type, String name) {
        for (SPIFactory factory : factories) {
            T extension = factory.getExtension(type, name);
            if (extension != null) {
                return extension;
            }
        }
        return null;
    }

}
