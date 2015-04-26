(ns clojure-fundamentals.multi-arity-functions)

; Multi-arity functions

(defn messenger
  ; no args, call self with the default message
  ([]    (messenger "Hello world!"))
  ; one arg, print it
  ([msg] (println msg)))

(messenger)
;; => Hello world!

(messenger "Hello class!")
;; => Hello class!