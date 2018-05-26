(defn fact
  [n]
  (apply * (range 1 (inc n))))

(defn binomial
  [n k]
  (/ (* (fact n))(* (fact (- n k))(fact k))))

(println (binomial 40 20))
