# safepoint（安全点）

safepoint关键字用于方法，它通过 ```Thread.sleep(0)``` 创建一个JVM safepoint以增加可能的GC频率

```apsars
class SafepointTest {
    static safepoint test() {
        // codes here ...
    }
}
```