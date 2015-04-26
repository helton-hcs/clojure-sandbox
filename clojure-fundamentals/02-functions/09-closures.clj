(ns clojure-fundamentals.closures)

; Closures

(defn messenger-builder [greeting]
  (fn [who] (println greeting who))) ; closes over <greeting>

; greeting provided here, then goes out of scope
(def hello-er (messenger-builder "Hello"))

; greeting still available because hello-er is a closure
(hello-er "Helton")
;; => Hello Helton