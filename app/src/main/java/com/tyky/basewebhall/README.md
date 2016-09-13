## 项目目录介绍

## 两个App相关文件

> - [App各种Key相关] → [AppConfig.java]
>  - 缓存Key
>  - 授权Key
>  - SP文件Key
>  - 各种Key

> - [Activity生命周期相关] → [AppManager.java]
>  - 添加Activity到堆栈 *addActivity*
>  - 获取当前Activity *currentActivity*
>  - 结束当前Activity *finishActivity*
>  - 结束所有Activity *finishAllActivity*
>  - 退出应用程序 *AppExit*

**1. adapter**
- fragment，recyclerview等适配器目录

**2. api**
- 数据传输协议处理目录

**3. base**
- 封装的基类

**4. bean**
- 对象

**5. fragment**

**6. interf**
- 抽象接口

**7. service**
- 服务目录

**8. ui**
- 界面activity目录

**9. util**
- 常用的工具类

**10. util.widget**
- dialog弹框等小部件

```
目录结构要实现业务逻辑和界面相关的都在service、fragment、ui页面，其他目录要实现多项目通用（待完善）
```