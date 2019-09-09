## 编译
```
把algs4.jar放到JAVA_HMOE\jre\lib\ext
mkdir out
javac -d out\ src\com\learn\*.java src\com\learn\uf\*.java
```
## 运行
```
cd out
java com.learn.Main < ..\data\tinyUF.txt
```
## 总结
### 复杂度

order of growth for N sites (worst case)
| algorithm | constructor | union | find |
|----|----|----|----|
| quick-find | N | N | 1 |
| quick-union | N | tree height | tree height |
| weighted quick-union | N | lg N | lg N |
| weighted quick-union with path compresson | N very, very nearly, but not quite 1 (amortized) (see Exercise 1.5.13)|
| impossible | N | 1 | 1 |
Performance characteristics of union-find algorithms