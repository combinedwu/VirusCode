# VirusCode
viruscode
代码思路：<br>
1、Main主类中，在main中调用调用三个方法，分别为initHospital(); initPanel(); initInfected();<br>
2、initHospital()函数，对医院类Hospital进行初始化，主要是设定医院的展示参数和床位取返函数；<br>
3、initInfected(); 初始化感染者；这里涉及到Person类和PersonPool类，为本程序核心代码。<br>
     Person类抽象了个人的基本信息，主要是健康状态，以及两个主要行为函数，分别是健康人的移动函数action()；和更新个人状态函数update()，包含感染模拟<br>
     PersonPool类会生成一个Person列表，每个人的初始位置和所在城市信息都将被保存；<br>
4、initPanel(); 涉及到MyPanel类，初始化画布，画出医院和城市人群分布，显示各类人群统计；<br>
     同时一个重要地方，是设置时间，规定每0.1秒重绘一次画布，每重绘10次算一天；<br>
5、每重绘一次画布，城市中的人移动一定距离，可能改变自身状态（被感染）；<br>

运行结果：<br>
![image](https://user-images.githubusercontent.com/80262489/110530566-94961880-8155-11eb-8f0c-3ddff66a65e2.png)
