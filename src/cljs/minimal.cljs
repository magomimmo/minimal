(ns minimal
  (:require-macros [minimal.macros :as mm]))

(defprotocol AProtocol
  (foo [content] "I'm foo")
  (bar [content] "I'm bar"))

(extend-protocol AProtocol
  string
  (foo [s] (str "Calling foo with arg " s))
  (bar [s] (str "Calling bar with arg " s)))

(if (mm/defined? js/NodeList)
  (extend-type js/NodeList
    ICounted
    (-count [nodelist] (. nodelist -length))))
