# Minimal

A minimal CLJS project for demonstrating the protocol issues with CLJS
r1978.

## How to use it

### Clone the project

```bash
git clone https://github.com/magomimmo/minimal.git
```

### Compile the project

```bash
lein compile
Compiling ClojureScript.
Compiling "dev-resources/public/js/whitespce.js" from ["src/cljs" "dev-resources/tools/repl"]...
Successfully compiled "dev-resources/public/js/whitespce.js" in 11.199011 seconds.
```

### Run the ring server

```clj
lein repl
Compiling ClojureScript.
nREPL server started on port 50868 on host 127.0.0.1
REPL-y 0.2.1
Clojure 1.5.1
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)

user=> (require '[ring.server :as http])
nil
user=> (http/run)
2013-10-29 17:14:33.266:INFO:oejs.Server:jetty-7.6.8.v20121106
2013-10-29 17:14:33.296:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:3000
#<Server org.eclipse.jetty.server.Server@c8a3c71>
user=>
```

### Launch the brepl

You now have two options to launch a browser connect REPL:

* using the traditional `lein trampoline cljsbuil repl-listen`
* using the [piggieback][1] lib by [Chas Emerick][2]

#### Traditional

Open a new terminal windows, `cd` in the main project directory, and issue:

```clj
iacomos-MacBook-Pro:minimal mimmo$ lein trampoline cljsbuild repl-listen
Running ClojureScript REPL, listening on port 9000.
"Type: " :cljs/quit " to quit"
WARNING: Wrong number of args (0) passed to cljs.core/array at line 169 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IEquiv is not a protocol at line 803 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IFn is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol Fn is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol cljs.core/IMeta is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol cljs.core/IWithMeta is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IFn is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol Fn is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol cljs.core/IMeta is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol cljs.core/IWithMeta is not a protocol at line 1007 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IHash is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol ISequential is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IReduce is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol ISeqable is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IEquiv is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IWithMeta is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IMeta is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IList is not a protocol at line 1828 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IHash is not a protocol at line 1882 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol ISequential is not a protocol at line 1882 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IReduce is not a protocol at line 1882 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol ISeqable is not a protocol at line 1882 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IEquiv is not a protocol at line 1882 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IWithMeta is not a protocol at line 1882 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IList is not a protocol at line 1882 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IHash is not a protocol at line 1959 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol ISequential is not a protocol at line 1959 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol ISeqable is not a protocol at line 1959 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IList is not a protocol at line 1959 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IPrintWithWriter is not a protocol at line 2012 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol INamed is not a protocol at line 2012 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IChunk is not a protocol at line 2147 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IChunkedNext is not a protocol at line 2179 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
WARNING: Symbol IChunkedSeq is not a protocol at line 2179 file:/Users/mimmo/.m2/repository/org/clojure/clojurescript/0.0-1978/clojurescript-0.0-1978.jar!/cljs/core.cljs
ClojureScript:cljs.user>
```

#### With Piggieback

If you use the Piggieback lib, you do not receive any
warnings.

Evaluate the following expression from the the REPL where you ran the
ring server:

```clj
user=> (browser-repl)
Type `:cljs/quit` to stop the ClojureScript REPL
nil
cljs.user=>
```

### Activate the brepl connection

Visit the [localhost:3000][3] url, wait a moment for the connection to
be establish and start BREPLing.

## License

Copyright (C) 2013 Giacomo (Mimmo) Cosenza aka Magomimmo

Distributed under the Eclipse Public License, the same as Clojure.

[1]: https://github.com/cemerick/piggieback
[2]: https://github.com/cemerick
[3]: http://localhost:3000
