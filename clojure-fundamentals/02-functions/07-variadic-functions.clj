(ns clojure-fundamentals.variadic-functions)

; Variadic functions

(defn messenger [greeting & who]
  (println greeting who))

(messenger "Hello" "world" "class")