(ns clojure-fundamentals.apply)

; Apply

(defn f [a b c d] 
  (println a)
  (println b)
  (println c)
  (println d))

; this will invoke (f 1 2 3 4) => the '(3 4) will be "unpacked"
; be careful: apply just unpack the last argument
(let [a 1  
      b 2
      more '(3 4)]
  (apply f a b more))

; & puts the rest of args into sequence
(defn messenger [greeting & who]
  ; apply gets args out of sequence
  (apply println greeting who))

(messenger "Hello" "world" "class")
;; => Hello world class

(def numbers-sum
  (let [numbers '(1 2 3)]
    (apply + numbers)))

(println numbers-sum)