## IntelligentPotBeta3

第一个版本没传，第二个版本在之前的项目列表可找到。

重制这个项目的原因不仅为了锻炼自己编程的能力，还为了能拿下接下来的比赛。

会把每一天做到的工作做一个小小的总结。

*19-6-1*

完成了载入界面的编写：利用Animator。

登录界面的UI的编写：XML文件。

今天目标完成的工作：做剩下界面的UI。

*19-6-3*

2号有局，耽搁了项目的事。

今天把主界面的UI大致写了下，包括标题以及选项按钮的设计。

以上就是今天关于这个项目的内容了。

*19-6-5*

4号大创答辩，耽误了项目的是。

今天把一个碎片的UI画好了。

在按键处理上尝试进行解耦：

在activity中传入两个arrayList，分别存放button对应的view以及对应的碎片，在点击处理时通过对button的actived状态的改变实现选定效果得实现，以及根据对应下标将碎片取出。

比较麻烦的一点是每次切换碎片时需要新增事务trancsion(好像是这么拼)，但根据系统gc的原理，trancsion在下一个trancsion创建后不被任何对象引用，所以会在gc过程中被回收掉，不会造成内存泄漏的情况。上述对于内存会造成一定影响（内存抖动），所以目前仍在探索能够解决这一问题的方法。

==DACHUNG==
