(defn square
  [x]
  (* x x))

(defn solve
  []
  (first
         (for [x (range 1 1000)
               y (range 1 1000)
           :let [z (- 1000 x y)]
           :when (and
                      (> z 0)
                      (= (square z) (+ (square y) (square x))))]
           (* x y z)
           )))

(println (solve))
