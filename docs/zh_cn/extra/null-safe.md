## 空安全
在类或方法上添加 ```nullsafe```、```nilsafe```、```s-nil``` 中的任意一个启用空安全

当关键字在类上时，其中的所有方法都会自动跳过对null对象的调用，不影响它作为传入其他方法的参数

在方法上时则只跳过这单个方法的null对象调用

```apsars
class NullSafeTestA {
    static nullsafe testA() {
        // codes here ...
    }

    static nilsafe testB() {
        // codes here ...
    }

    static s-nil testC() {
        // codes here ...
    }
}

class nilsafe NullSafeTestA {
    // 此处无需再声明
    static testA() {
        // codes here ...
    }

    static testB() {
        // codes here ...
    }
}
```
