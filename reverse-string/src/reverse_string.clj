(ns reverse-string
  (:require [clojure.string :as str])
)

(defn reverse-string [s]
  (str/reverse s)
)

;; (defn reverse-string [s]
;;   (apply str (reverse s))
;; )
