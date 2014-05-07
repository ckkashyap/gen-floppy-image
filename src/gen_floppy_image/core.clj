(ns gen-floppy-image.core
(:require [gen-floppy-image.asm :as asm])
  )

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(def instruction (-> []
                     (asm/mov :ax 10)
                     (asm/mov :bx 10)
                     (asm/mov :cx 10)
                     (asm/label "dingo")
                     ))

(defn -main [& args] (println "Hello world"))


