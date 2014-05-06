(ns gen-floppy-image.asm) 


(defn register-name [reg]
  (reg {
        :ax "ax"
        :bx "bx"
        }))

(defn label [code name]
  (conj code (str name ":")))

(defn mov [code reg val]
  (conj code (clojure.string/join " " ["mov" (register-name reg) val])))
