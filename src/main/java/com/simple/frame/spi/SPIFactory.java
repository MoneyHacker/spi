
package com.simple.frame.spi;
import com.simple.frame.spi.annotation.SPI;

/**
 * ExtensionFactory
 */
@SPI
public interface SPIFactory {

    /**
     * Get extension.
     *
     * @param type object type.
     * @param name object name.
     * @return object instance.
     */
    <T> T getExtension(Class<T> type, String name);

}
