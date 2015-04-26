(ns clojure-fundamentals.terse-fn-reader-macro)

; Terse fn Reader macro

; Single argument = %
; Multiple arguments = %1, %2, %3, ...
; Variadic: %& for remaninig args

; a function to invoke .length on arg
#(.length %)