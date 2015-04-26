(ns clojure-fundamentals.function-examples)

(fn [message] (println message))
((fn [message] (println message)) "Hello Clojure")

(def messenger (fn [message] (println message)))
(messenger "Hello Clojure")

(defn messenger [message] (println message))
(messenger "Hello Clojure")

