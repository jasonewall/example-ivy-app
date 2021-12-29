# example-ivy-app

This is an example application for demonstrating how "easy" it is to get an app up and running with the [ivy-cli](https://github.com/jasonewall/ivy-cli) wrapper.

## Starting the application

```
git clone git@github.com:jasonewall/example-ivy-app.git
cd example-ivy-app
ivy run jwol.example.Blarg
```

```
$ ivy run jwol.example.Blarg
...
...
cachepath output to .ivy_classpath
2021-12-28 12:56:44.145:INFO::main: Logging initialized @90ms
2021-12-28 12:56:44.188:INFO:oejs.Server:main: jetty-9.2.5.v20141112
2021-12-28 12:56:44.217:INFO:oejs.ServerConnector:main: Started ServerConnector@52d455b8{HTTP/1.1}{0.0.0.0:8080}
2021-12-28 12:56:44.218:INFO:oejs.Server:main: Started @203ms
CTRL-C to stop server
Checkout http://localhost:8080/
```

### What just happened?

The `ivy-cli` downloaded all project dependencies found in `ivy.xml` to your ivy cache, automatically compiled your project (ensuring all dependencies are in the compiler classpath), and then started the main class denoted by `jwol.example.Blarg` (see [Blarg.java](blob/main/src/jwol/example/Blarg.java)). The argument passed in to `ivy run` can be any fully qualified class name that defines a Java entry point method.
