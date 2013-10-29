(ns minimal.macros)

(defmacro defined? [x]
  (list 'js* "(typeof ~{} != 'undefined')" x))
