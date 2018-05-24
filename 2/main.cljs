(def fibo
  (memoize
    (fn [n]
      (if (< n 2)
        1
        (+ (fibo (dec n)) (fibo (- n 2)))))))


(defonce BOUND (* 4 1000 1000))

(defn solve
  []
  (->> (range)
       (map fibo)
       (filter even?)
       (take-while #(< % BOUND))
       (apply +)))

(println (solve))
