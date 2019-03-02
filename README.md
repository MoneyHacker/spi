# 一 通用SPI ,Java SPI, Dubbo SPI
从dubbo中抽取的spi 详情看示例 SPILoaderTest.java
# 二 使用,具体可参见测试类(SPILoaderTest)
 @Test
 public void shouldAnswerWithTrue() {
     SPILoader<Task> task = SPILoader.getExtensionLoader(Task.class);
     System.out.println(task.getExtension("taskOne").getName());
     System.out.println(task.getExtension("taskTwo").getName());
     System.out.println(task.getSupportedExtensions());
     System.out.println(task.getDefaultExtensionName());
 }
# 三  交流(QQ群：51567067) 支持
<img src="https://github.com/MoneyHacker/simple/blob/master/simple_wx.jpg" alt="微信" width="300px" height="300px"/><img src="https://github.com/MoneyHacker/simple/blob/master/simple_zfb.png" alt="支付宝" width="300px" height="300px"/>




