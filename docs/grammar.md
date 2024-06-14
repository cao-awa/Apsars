# Apsars 语法

## 类

如下方式定义一个类：

```apsars
class TheName {
} 
```

## 方法

最简单的方法无需任何修饰符：

```apsars
class TheName {
    theMethodName() {
    }
}
```

### 参数

使用 ```<名称>: <类型>``` 的格式定义方法参数，以逗号分隔

```apsars
class TheName {
    theMethodName(name: ArgType) {
    }
    
    otherMethodName(name: ArgType, xxx: String) {
    }
}
```

可以使用 ```<名称>: <类型> default <值>``` 的格式定义预设值，可以在调用此方法时使用 ```default``` 关键字占位来省略传入的参数直接使用此值

```apsars
class TheName {
    theMethodName(xxx: int default 12345) {
    }
    
    theMethodName(xxx: int default 12345, yyy: int default 654321) {
    }
}
```

### 返回类型

在参数定义的后面使用冒号跟随类型以设定返回类型，目前有返回类型的方法必须有返回值，未来将无需强制存在返回语句（引用类型自动返回null，基本类型自动返回类型默认值）

```apsars
class TheName {
    theMethodName(): ArgType {
        return null;
    }
}
```

### 主方法

main方法格式：

```apsars
class TheName {
    public static main(args: String[]) {
    }
}
```

## 域（成员）

成员的定义有两种方式，第一种是apsars的写法 ```<名称>: <类型> = <值>```，第二种是原生java的写法 ```<类型> <名称> = <值>```

```apsars
class TheName {
    // 定义时可以赋值
    apsarsName: int = 123;
    int javaNamer = 456;
    
    // 也可以不赋值
    xxx: long;
    long yyy;

    public static main(args: String[]) {
    }
}
```

# 扩展语法

[safepoint](extra/safepoint.md)

