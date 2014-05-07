(ns gen-floppy-image.asm) 

(defn label [code name]
  (conj code {:type :label :name name}))

(defn mov [code reg val]
  (conj code {:type :instruction :instruction :mov-val-to-register :register reg :value val}))
