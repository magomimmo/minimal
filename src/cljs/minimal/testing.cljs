(ns minimal.testing
  (:require [minimal :as minimal]))

(defn test-function [something]
  (reify minimal/AProtocol
    (foo [_] (str "I'm the foo reification of AProtocol"))
    (bar [_] (str "I'm the bar reification of AProtocol"))))
