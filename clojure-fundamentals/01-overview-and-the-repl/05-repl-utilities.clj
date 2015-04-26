(ns clojure-fundamentals.repl-utilities)

; REPL Utilities

; import <clojure.repl> to the current namespace
(use 'clojure.repl)

; find the documentation of <when> function
(doc when)

; find documentations that use <sequence> word
(find-doc "sequence")

; all the definitions that have <map> on name
(apropos "map")

; find the source code of function <take>
(source take)

; print all the definitions available on <clojure.repl> namespace
(dir clojure.repl)