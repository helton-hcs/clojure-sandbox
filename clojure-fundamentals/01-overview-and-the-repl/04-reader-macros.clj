(ns clojure-fundamentals.reader-macros)

; Reader Macros

; I'm using the representation
;  <reader macro>
;  <expanson>
; Obs.: This code don't work! It's just to demonstrate macro expansions

'foo
(quote foo)

#'foo
(var foo)

@foo
(deref foo)

#(+ % 5)
(fn [x] (+ x 5))

^{:key val} foo
(with-meta foo {:key val})

^:key foo
(with-meta foo {:key true})