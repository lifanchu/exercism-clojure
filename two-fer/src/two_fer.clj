(ns two-fer)

(defn make-string [input]
  (str "One for " input ", one for me.")
)

(defn two-fer
  ([input] (make-string input))
  ([] (make-string "you"))
 )

;; (defn two-fer 
;;   ([input] (str "One for " input ", one for me."))
;;   ([] (str "One for you, one for me."))
;; )


