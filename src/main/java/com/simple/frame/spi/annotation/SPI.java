package com.simple.frame.spi.annotation;

        import java.lang.annotation.*;

/**
 * Created by lvxiang@ganji.com 2018/8/15 9:54
 * 扩展点的名称
 *
 * @author <a href="mailto:278076999@qq.com">simple</a>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SPI {
    String value() default "";
}
