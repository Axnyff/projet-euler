(defn palyndrome? [n]
  (let [string (str n)]
    (= (seq string) (reverse string))))

(defn solve
  []
  (->>
    (for [x (range 100 1000)
          y (range 100 1000)]
      (* x y))
    (filter palyndrome?)
    (apply max)))

(println (solve))
