(defn count-divisor
  [n]
  (count
    (set
      (apply concat
        (for
          [i (range 1 (inc (Math.sqrt n)))
           :when (zero? (mod n i))]
          [i (/ n i)])))))

(defn solve
  [input]
  (loop [curr 0 n 1]
    (if (> (count-divisor curr) input)
      curr
      (recur (+ curr n) (inc n)))))

(println (solve 500))
