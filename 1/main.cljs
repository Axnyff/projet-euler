(defn get-sum-of-multiples
  [bound]
  (->> (range 0 bound)
       (filter #(or (zero? (mod % 5)) (zero? (mod % 3))))
       (apply +)))

(println (get-sum-of-multiples 10))
(println (get-sum-of-multiples 1000))
