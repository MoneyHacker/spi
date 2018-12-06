# spi
从dubbo中抽取的spi
详情看示例 SPILoaderTest.java

    @Test
    public void shouldAnswerWithTrue() {
        SPILoader<Task> task = SPILoader.getExtensionLoader(Task.class);
        System.out.println(task.getExtension("taskOne").getName());
        System.out.println(task.getExtension("taskTwo").getName());
        System.out.println(task.getSupportedExtensions());
        System.out.println(task.getDefaultExtensionName());
    }
