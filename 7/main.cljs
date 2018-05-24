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
  (loop [data (range) remaining input]
    (if (zero? remaining)
      (first data)
      (recur (drop-while #(not (is-prime %)) (rest data)) (dec remaining)))))

(println (solve 10001))
