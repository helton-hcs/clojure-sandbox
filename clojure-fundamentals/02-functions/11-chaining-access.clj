(ns clojure-fundamentals.chaining-access)

; Chaining access

; Obs.: This code don't work! It's just to demonstrate how to chaining access

; Java
person.getAddress().getZipCode()

; Closure
(.getZipCode (.getAddress person))

; Closure with syntax sugar
(.. person getAddress getZipCode)