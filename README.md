 #protocolBuffer
简单教学如果使用Protocol Buffer(版本2.x及版本3.x)生成Java的实体类

</p>花5分仔细查看教程,是为了节约你更多时间


## v2 使用方法

> <li> 1.在目录 com.demo.v2 下创建项目所需  .proto文件  <br>
 [文件的编写教材 参考](https://blog.csdn.net/xiaofei0859/article/details/53169687)
 <br> 
 [官网](https://developers.google.com/protocol-buffers/docs/javatutorial)

> <li> 2.找到com/demo/v2/protoc.exe文件,在把 .proto文件放置相同目录

> <li> 3.在cmd命令窗口下 执行命令: protoc.exe --java_out=./ Person.proto,及可以在当前目录生成对应的java类

> <li> 4.具体测试,请看 com.demo.v2.client.Client和 com.demo.v2.server.Server, 先启动Server,在启动Client,模拟真实环境序列化/反序列化

`特别注意`<br>
1. 在写 .proto文件的时候, 需要把 package `com.demo.v2`; 路径变成项目中实体类的真实路径,然后把生成的类复制到自己的项目即可 <br>
2. 在使用v2版本编译的时候,不能引入 lib/protobuf-java-3.5.1.jar 这个包(删除即可),反之,在使用v3的时候,不能引入lib/protobuf-java-2.5.0.jar
<br>


## v3使用方法 (非中文路径)
> <li> 1.在v3中没有 `protocv2.exe` 类似工具,(目前还没有做好),感兴趣的,可以自己看看 
[编译教程](https://blog.csdn.net/blackbattery/article/details/78250119?locationNum=6&fps=1) 

> <li> 2. 解压resources/Csharp.zip 到  非中文路径
> <li> 3. 将所需的 .proto文件放入 /proto3 目录下
> <li> 4. 执行 /GenerateAll-3.bat 文件,即可在 /GenerateJAVA 目录下生成所需的文件
> <li> 5. 测试代码参考 com.demo.v3.server.Server 以及 com.demo.v3.client.Client

`特别注意`<br>
1 v3版本的 .proto文件编写和v2版本编写略有不同

## 在项目的使用
> <li> 1.maven 项目 ,依赖  
     <dependency>
       <groupId>com.google.protobuf</groupId>
       <artifactId>protobuf-java</artifactId>
       <version>3.5.1</version>
     </dependency>
> <li> 2.普通项目,添加lib目录下的包即可

