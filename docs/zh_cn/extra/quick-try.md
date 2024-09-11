# quick-try（快速try）

不定义catch的目标列表而使用关键字替代特定需求

有```ignored```、```print```、```deliver```用于不同场景

## ignored

```apsars
class QuickTryTest {
    test() {
        try {
            // Something will be throws...
        } ignored ; // 这会直接忽略异常
    }
}
```

### print

```apsars
class QuickTryTest {
    test() {
        try {
            // Something will be throws...
        } print ; // 这会直接打印异常堆栈
    }
}
```

它等效与以下Java代码：

```java
class QuickTryTest {
    private void test() {
        try {
            // Something will be throws...
        } catch (Throwable ex) {
            ex.printStackTrace();
        } // 这会直接打印异常堆栈
    }
}
```

## deliver

```apsars
class QuickTryTest {
    statif final LOGGER: Logger = LogManager.getLogger();

    test() {
        try {
            // Something will be throws...
        } deliver LOGGER::warn ; 
        // deliver 会向 LOGGER 的 warn 方法传递这个异常，类型是Throwable
        
        try {
            // Something will be throws...
        } deliver this::instanceHandler ; 
        // 它可以指向自己的方法来处理异常
        
        try {
            // Something will be throws...
        } deliver QuickTryTest::staticHandler ; 
        // 它可以指向一个静态方法来处理异常
    }
    
    instanceHandler(err: Throwable) {
        // Custom handling.
    }
    
    static staticHandler(err: Throwable) {
        // Custom handling.
    }
}
```

它等效与以下Java代码：

```java
class QuickTryTest {
    private static final Logger LOGGER = LogManager.getLogger();

    private void test() {
        try {
            // Something will be throws...
        } catch (Throwable ex) {
            LOGGER.warn(ex);
        }
        // deliver 会向 LOGGER 的 warn 方法传递这个异常，类型是Throwable

        try {
            // Something will be throws...
        } catch (Throwable ex) {
            this.instanceHandler(ex);
        }
        // 它可以指向自己的方法来处理异常

        try {
            // Something will be throws...
        } catch (Throwable ex) {
            QuickTryTest.staticHandler(ex);
        }
        // 它可以指向一个静态方法来处理异常
    }

    private void instanceHandler(Throwable throwable) {
        // Custom handling.
    }

    private static void staticHandler(Throwable throwable) {
        // Custom handling.
    }
}
```

此外，```deliver```还可以使用```with```关键字将一个参数放置在异常前：

```apsars
class QuickTryTest {
    statif final LOGGER: Logger = LogManager.getLogger();
  
    test() {
        try {
            // Something will be throws...
        } deliver LOGGER::warn with "Message"; 
        // deliver with会将后面传递的内容置于异常前面，仅限一个
    }
}
```

它等效与以下Java代码：

```java
class QuickTryTest {
    private static final Logger LOGGER = LogManager.getLogger();

    private void test() {
        try {
            // Something will be throws...
        } catch (Throwable ex) {
            LOGGER.warn("Message", ex);
        }
        // deliver with会将后面传递的内容置于异常前面，仅限一个
    }
}
```
