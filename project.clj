(defproject minimal "0.0.1-SNAPSHOT"
  :description "Leiningen template for ClojureScript lib"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}

  :min-lein-version "2.2.0"

  :source-paths ["src/clj"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1978"]]

  :plugins [[lein-cljsbuild "1.0.0-SNAPSHOT"]]

  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds {:white
            {:source-paths ["src/cljs" "dev-resources/tools/repl"]
             :compiler
             {:output-to "dev-resources/public/js/whitespce.js"
              :optimizations :whitespace
              :pretty-print true}}}}

  :profiles {:dev {:clean-targets ["out"]
                   :source-paths ["dev-resources/tools/http"]
                   :resources-paths ["dev-resources"]

                   :dependencies [[com.cemerick/piggieback "0.1.0"]
                                  [ring "1.2.0"]
                                  [compojure "1.1.5"]]

                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
                   :injections [(require '[cljs.repl.browser :as brepl]
                                         '[cemerick.piggieback :as pb])
                                (defn browser-repl []
                                  (pb/cljs-repl :repl-env
                                                (brepl/repl-env :port 9000)))]}})