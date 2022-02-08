# bazel-ijar-test

Bazel
=====
Install bazel - https://docs.bazel.build/versions/main/install.html

Run build with bazel
```
bazel build //ijar-test:ijartest
```

Buck
====

Download buck binary
```
curl https://jitpack.io/com/github/facebook/buck/0e72e40074e1731dd3c9068e5ed23ee10bcc75dd/buck-0e72e40074e1731dd3c9068e5ed23ee10bcc75dd.pex > buck.exe
chmod +x buck.exe
```

Run build with buck
```
./buck.exe build //ijar-test:ijartest
```

Differences
===========
Bazel iJar for scalactic - ijars/bazel/scalactic_2.11-3.0.5-ijar.jar

Buck iJar for scalactic - ijars/buck/scalactic-abi.jar

Examine bytecode using luyten decompiler
```
java -jar luyten-0.5.4.jar
```

Bazel iJar class
![Bazel iJar Class](bazel.png?raw=true "Bazel iJar Class")

Buck iJar class
![Buck iJar Class](buck.png?raw=true "Buck iJar Class")