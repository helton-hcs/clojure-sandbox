(ns clojure-fundamentals.invoking-Java-code)

; Invoking Java code

; I'm using the representation
;  <task>
;  <Java code>
;  <Clojure code>
; Obs.: This code don't work! It's just to demonstrate how invoke Java code

<Instantiate>
new Widget("foo")
(Widget. "foo")

<Instance method>
rnd.nextInt()
(.nextInt rnd)

<Instance field>
object.field
(.-field object)

<Static method>
Math.sqrt(25)
(Math/sqrt 25)

<Static field>
Math.PI
Math/PI