(ns gen-floppy-image.asm) 

(defn label [code name]
  (conj code {:type :label :name name}))

(defn move [code from to]
  (conj code {:type :instruction :instruction :mov :from from :to to}))

(defn jump [code label]
  (conj code {:type :instruction :instruction :jmp :label label}))


