记录一些有意思的代码

1、类加载过程 initprocess 包 (这段代码出自 coolshell.cn 中构造器的陷阱一文)
    
    有继承关系时,会优先初始化父类；静态变量随着类的加载而完成初始化
    
2、展示java虚拟机栈中的当前所有线程及其相关信息 showstacktrace 包( 这段代码出自深入理解jvm特性-jvm工具介绍 jstack)