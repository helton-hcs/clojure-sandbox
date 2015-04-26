(ns clojure-fundamentals.metadata)

; Metadata

(with-meta [1 2 3] {:example true})

(meta (with-meta [1 2 3] {:example true}))