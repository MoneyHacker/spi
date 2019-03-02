package com.simple.frame.spi;
import com.simple.frame.spi.annotation.Adaptive;
import com.simple.frame.spi.annotation.SPI;

/**
 * Created by 278076999@qq.com 2018/8/15 14:36
 *
 * @author <a href="mailto:278076999@qq.com">simple</a>
 */
@SPI("taskThree")
@Adaptive
public interface Task {

    String getName();
    @Adaptive({"taskOne"})
    String getName(Protocol url);
}
