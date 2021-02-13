(ns bob
  (:require [clojure.string :as str])
)

(defn response-for [input] 
  (def s (str/trim input))
  (def all-caps 
    (let 
      [chars (apply str (filter #(Character/isLetter %) s))]
        (and
          (= (str/upper-case chars) chars)
          (> (count chars) 0)
        )
    )
  )
  (cond
    (= (count s) 0) "Fine. Be that way!"
    (and (str/ends-with? s "?") all-caps) "Calm down, I know what I'm doing!"
    (str/ends-with? s "?") "Sure."
    (= all-caps true) "Whoa, chill out!"
    :else "Whatever.")
)
