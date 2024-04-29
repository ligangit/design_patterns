# 设计模式
本仓库是设计模式示例代码仓库
## 简单工厂设计模式
simplefactory 
![img.png](img/simplefactory/img.png) 
## 策略模式
strategy 
![img.png](img/strategy/img.png) 
## 单例模式
singleton 
![img.png](img/singleton/img.png) 
可参考文章：https://zhuanlan.zhihu.com/p/677327799 
## 代理模式
proxy 
![img.png](img/proxy/img.png)  
## 原型模式
prototype 
原型模式，可以理解为克隆，基于某对象复制一份新的对象 
优点： 
1. 基于内存二进制流拷贝，性能比新建对象好 
2. 可使用深克隆的方式，保存对象的状态，简化创建对象的过程，或者实现撤销的操作 
缺点： 
1. 需要给每个类都实现clone方法，也违背了开闭原则  
2. java支持浅克隆，但是深克隆时，每层对象都需要支持深克隆  
类结构图 
![img.png](img/prototype/img.png) 

## 适配器模式
adapter 
适配器模式：将一个类的接口转换为客户希望的另外的一个接口 
优点： 
1. 让原本的接口不兼容、不能一起工作的类可以一起工作，可以透明的调用目标接口  
2. 重用、复用适配器类，不用修改原先的代码 
3. 目标类和适配器类解耦 
缺点：
1. 编写的过程需要结合业务，系统的复杂性高 
2. 降低代码可读性 
类结构适配器模式图（耦合度要比对象的高，需要知道组件库中的内部结构） 
![img.png](img/adapter/img.png) 
对象结构适配器模式图（一般采用这种模式） 
![img.png](img/adapter/img_1.png) 

## 装饰模式
Decorator Pattern 
装饰模式：在不改变现有对象结构的情形下，动态的给一个对象去扩展功能，做到即插即用 
优点： 
1. 在不改变现有对象结构的情形下，动态的给一个对象去扩展功能 
2. 通过使用不同的装饰类、装饰类排列组合，实现不同的效果 
3. 完全遵守排列组合 
缺点： 
1. 增加了很多子类，增加程序的复杂性 
类结构图 
   ![img.png](img/decorator/img.png) 


## 桥接模式
Bridge Pattern
桥接模式：将抽象和实现做一个完整的分离，能够让他们独立变化，降低耦合性 
优点： 
1. 抽象和实现分离，扩展能力强 
2. 符合开闭原则 
3. 符合合成复用原则 
4. 实现细节对客户透明 
缺点： 
1. 要求开发者正确识别系统中两个变化的维度，要求开发者对业务需求、要求的理解度有高要求 
类结构图 
![img.png](img/bridge/img.png) 
   
## 外观模式
Facade  
外观模式：封装底层接口，提供统一的接口 
优点： 
1. 迪米特法则的典型应用，让客户端和子系统的耦合度 
2. 对客户端屏蔽了子系统的组件，对客户端来说也减少了对象的数量 
3. 减少了客户端编译依赖性 
缺点： 
1. 无法很好的限制使用子系统的类 
2. 增加子系统时，依旧需要修改外观类，违背了开闭原则 
类结构图 
![img.png](img/facade/img.png) 

## 享元模式
Flyweight 
创建大量的对象，存在资源的消耗，这也是一个优化点，如果把相同的部分提取出来共享，也是可以提升性能的 
内部状态：对象共享出来的信息，存在享元信息的内部，不会随环境的变化而变化 
外部状态： 对象依赖的标记，随环境的变化而变化 
如连接池：数据库用户名是内部状态；连接状态为外部状态 
优点： 
1. 用共享技术较少对象的创建，增加对象的复用，相同对象只需要保存一份，减少对象的创建，减轻内存的压力 
缺点： 
1. 需要将外部状态抽离处理，增加系统的复杂度 
2. 系统的运行会变得更长 
类结构图 
![img.png](img/flyweight/img.png) 

## 组合模式
Composite 
优点： 
1. 让客户端一致的处理单个对象和组合对象，无需关心是处理组合对象还是单个对象，减少了代码 
2. 满足开闭原则 
缺点： 
1. 设计比较复杂  
2. 限制构件比较麻烦 
3. 继承麻烦 
类结构图 
左图为“透明模式”，右图为“安全模式”，左图叶子节点有“增删操作”  
![img.png](img/composite/img.png) 
   
## 模板方法模式
TemplateMethod
模板方法模式：定义了一个算法的步骤，允许子类在不改变算法结构的基础上重新定义算法中的某些步骤。 
如人的一天：银行工作人员，上班打卡，存取前；程序员，上班打卡，写代码 
优点： 
1. 封装了不变的部分（封装在父类中），扩展了可变的部分（子类继承去实现）  
2. 父类提取了公共代码，提高代码复用 
3. 子类去扩展，满足了开闭原则 
缺点： 
1. 每个不同的实现都需要定义不同的子类，增加系统实现的复杂度  
2. 父类的抽象方法，是由子类去实现的，子类的执行结果影响了父类结果，是反向的结构，提高代码阅读的难度 
3. 由于继承，父类添加方法，子类都需要去改一遍 
类结构图  
![img.png](img/templatemethod/img.png) 
   
## 命令模式
Command 
命令模式：方法的请求者和实现者有紧密的耦合，如对某个方法进行撤销，如遥控器。
将一个请求封装为一个对象，让发出请求的责任和处理请求的责任进行分隔，通过命令对象进行分割、管理等。 
优点： 
1. 降低系统的耦合性 
2. 扩展性好，可以很好的实现，可以和组合模式一起使用，封装为一个组合命令 
缺点： 
1. 每个具体的操作都需要设计一个命令类，增加整个系统的复杂度 
2. 命令模式的结果（执行方的结果），使用命令的形式架构，在理解上增加了难度 
类结构图  
![img.png](img/command/img.png) 
   
## 责任链模式
ChainOfResponsibility
责任链模式：解耦请求的处理，将节点的处理者组成了链式形式，让请求流动起来。避免请求发送者和多个请求处理者耦合在一起 
具体场景：审批流程 
优点： 
1. 降低了对象的耦合度，处理者和发送者不需要知道明确的信息 
2. 增强了系统的可扩展性 
3. 增强了给对象指派职责的灵活性，可以无限扩容或者流程改变
4. 简化了对象之间的连接，避免了很多if-else 
5. 责任分担，每个节点都只需要处理自己职责部分，符合单一职责原则 
缺点： 
1. 不能保证一定能被处理
2. 责任链过长时，请求处理会涉及很多处理对象，会影响性能 
3. 责任链的建立需要客户端来保证 
类结构图  
![img.png](img/chainofresponsibility/img.png) 
   
## 状态模式
State
状态模式：不同对象根据不同情况做出不同的行为，对于有状态的编程，在控制对象的状态转换时，把判断逻辑剥离出来，用各个不同的内容表示，让其有雷同结构。 
优点： 
1. 满足单一职责原则，结构清晰，不同状态分隔 
2. 状态转换的显示化，减少状态之间的依赖，让状态转换更加明确 
3. 职责明确，每个状态只干状态职责内的事情，不会出现都写在一块的地方 
缺点：
1. 增加了跟多的类 
2. 状态模式的结构更加复杂，如果使用不当会导致代码混乱 
3. 对开闭原则的支持不太友好，违背了开闭原则 
类结构图  
![img.png](img/state/img.png) 
   
## 观察者模式
observer
观察者模式：观察到数据变更时，更新自己的状态 
优点： 
1. 降低了目标和观察者之间的耦合程度，符合依赖倒置原则 
2. 目标和观察者之间建立了触发机制，所以订阅的人都能通知到 
缺点： 
1. 目标和观察者之间的依赖关系并没有完全解除 
2. 当观察者对象比较多的时候，通知时的耗时可能比较久，影响效率 
类结构图  
![img.png](img/observer/img.png) 
   
## 中介者模式
Mediator 
中介者模式：定义了中介者对象封装了一些列对象行为的交互，让耦合松散 
优点： 
1. 各个类各司其职，符合迪米特原则 
2. 降低了对象之间的耦合度 
3. 对象之间的1对多的关系变为了1对1的关系 
缺点： 
1. 当同事类越来越多的时候，中介者越来越臃肿，越来越复杂
类结构图  
![img.png](img/mediator/img.png) 
   
## 迭代器模式
Iterator 
迭代器模式：在客户访问类和聚合类之间插入一个迭代器，分类聚合对象和遍历行为。 
基本上不会自己去写这个模式。 
优点： 
1. 访问聚合对象的内容不用暴露内部表达 
2. 遍历的任务交给了迭代器去完成，简化了聚合类 
3. 支持以不同的方式遍历一个聚合，甚至自定义迭代器 
缺点： 
1. 增加了类的个数，提高了系统的复杂度 
类结构图 
![img.png](img/iterator/img.png) 
   
## 访问者模式
Visitor 
访问者模式：处理对象比较稳定，但访问方式多种多样。把处理方法和数据结构进行分离，可根据需要增加新的方法，提高扩展性。 
优点： 
1. 扩展性比较好 
2. 复用性比较好 
3. 灵活，数据结构、作用、操作进行了解耦 
4. 符合单一原则 
缺点： 
1. 增加元素比较困难，违背开闭原则 
2. 破坏了封装，依赖了具体的类，知道细节 
3. 非凡了依赖倒置原则，依赖了具体的类而不是抽象 
类结构图 
![img.png](img/visitor/img.png) 
   
## 备忘录模式（快照模式）
memento 
备忘录模式（快照模式）：记录一个对象的内部状态，当用户后悔的时候，能够撤消当前的操作，恢复到原先的状态。 
在不破坏封装性的前提下，我们去捕获对象的内部状态，并且在对象之外去保存这个状态。便于恢复到原先保存的状态。 
优点： 
1. 提供了一种恢复状态的机制，便于恢复到历史的某一时刻 
2. 实现了内部状态的封装，除了发起人，没有其他角色可以修改、访问“状态” 
3. 简化发起人的备份操作，发起人无需管理、保存各个备份，所有的信息都是在备忘录里面，都是有管理者进行管理的，符合单一职责原则 
缺点： 
1. 资源的消耗比较大，特别是保存得比较频繁时 
类结构图 
![img.png](img/memento/img.png) 
   
## 解释器模式
解释器模式：评估语言的语法或表达式的方式，即解释文本，它属于行为型模。 
用的比较少。 
优点： 
1. 扩展性比较好，可以使用继承扩展文法 
缺点： 
1. 执行效率比较低，解释器模式中会出现大量循环和递归，代码调试也比较麻烦 
2. 会引起类的膨胀，每条规则都需要一个类，规则多的时候就比较麻烦 
3. 用的场景比较少 
类结构图 
![img.png](img/interpreter/img.png) 