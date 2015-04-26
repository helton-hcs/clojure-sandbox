(ns clojure-fundamentals.let)

; let

(let [x 10
      y 21]
  (+ x y))

(defn messenger [msg]
  (let [a 7
        b 5
        c (capitalize msg)]
    (println a b c)
  ) ; end of 'let' scope
) ; end of function