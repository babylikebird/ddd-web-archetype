# ddd-web-archetype
# ddd-web-archetype
## 安装archetype到本地
```
mvn clean
mvn install 
```

## 执行代码生成工程

```
mvn archetype:generate -DarchetypeRepository=你本地的仓库地址  -DgroupId=com.ddd.user -DartifactId=ddd-user -Dversion=1.0.0-SNAPSHOT -Dpackage=com.ddd.user -DarchetypeArtifactId=ddd-bone-archetype -DarchetypeGroupId=org.happy.archetype -DarchetypeVersion=1.0.0
```
如果powershell出现问题， 请用CMD
