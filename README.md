# Utility Framework: *实用框架*

[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

-------

## 它能干嘛

_Utility Framework_ 是一个易于被使用的框架，旨在能够结合各种框架，让架构生活化、业务专一化、程序简单化，整体实用化。

依托 Utility Framework 创建应用无需从 0 至 1 开始，只需要添加相应配置，就可以将应用搭建在各大程序员创建的地基上，借此，您只需要精心设计或选择出喜欢的瓷砖、楼梯、门窗······

_Utility Framework_ 目前提供了如下功能：

* **WEB**

  WEB 项目往往基于 MVC 架构搭建而成，其中我们对 Controller 进行了增强和解耦，将其划分为参数校验、业务逻辑、统一响应以及全局异常捕捉。

  **生活例子**
  ：小明正在家里烹饪美食，打算饱餐一顿。整体步骤包括，在厨房的水槽上洗菜洗肉，一旦发现有坏的，我们会丢到垃圾桶里；煮菜、吃饭，如果没煮熟，小明不会选择吃；如果吃的时候才发现仍然有坏的，那就是意料之外的事，小明会警惕起来，不会继续再吃；饱腹完之后，小明会回到洗碗池洗碗和收拾餐桌。
  其中如果边吃边洗菜，亦或者边吃边煮菜······是不妥的，也是耦合的。
  
  因此其中操作可以类比为：
  - 洗菜洗肉——参数校验；
  - 洗菜洗肉时丢弃坏的、没煮熟不吃——手动抛出异常；
  - 煮菜吃饭——业务操作；
  - 吃出坏肉——中断业务操作，BUG 提醒；
  - 洗碗和收拾餐桌——设置响应头、体和状态；
  - 边吃边洗菜——一边业务操作一边参数校验，耦合。

  **参数校验**：您只需要像使用 @Controller、@RequestMapping 注解一样使用 @Validator、@ValidateMapping 就可以完成 Controller 层的参数校验。

  **统一响应**：您只需要实现 ControllerReturnResponse 和 ControllerExceptionResponse 接口并注入 Spring 容器中即可。

  **全局异常捕捉**：您只需要秉持预料之内和非预料之内的思想进行异常的抛出，凡是您手动抛出来的异常，我们都将其视为预料之内的异常，反之视为 BUG。其中您可以结合工具类 Throw 进行异常抛出。

  **异常定制处理**：这就像干垃圾和湿垃圾的处理方式均不相同，处理时也并不会与我们的生活耦合。

* **Mybatis**

## 快速开始

[快速开始](doc/快速开始.md)

## 贡献

todo

## 联系

* Email: 1262917629@qq.com
* Wechat: rovingsea
