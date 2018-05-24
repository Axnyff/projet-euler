(def input 600851475143)

(defn solve
  [input]
  (loop [input input max-prime 0 n 2]
    (if (= 1 input)
      max-prime
      (if (zero? (mod input n))
        (recur (/ input n) n n)
        (recur input max-prime (inc n))))))

(print (solve input))
