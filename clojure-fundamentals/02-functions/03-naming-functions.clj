(ns clojure-fundamentals.naming-functions)

; Naming functions

(def messenger (fn [msg] (println msg)))
;; => #'clojure-fundamentals.naming-functions/messenger

(defn messenger [msg] (println msg))
;; => #'clojure-fundamentals.naming-functions/messenger

(messenger "Hello world!")
;; => Hello world!"