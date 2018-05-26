(defn- test-prime
  [x]
  (loop [iter 2 top (int (Math/sqrt x))]
    (if (> iter top)
      true
      (if (= 0 (mod x iter))
        false
        (recur (inc iter) top)))))

(defn is-prime
  [x]
  (if (< x 2)
    false
    (test-prime x)))

(defn solve
  [input]
  (apply + (filter is-prime (range 2 (inc input)))))

(println (solve 10))
(println (solve (* 2 1000 1000)))
