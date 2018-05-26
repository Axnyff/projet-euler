(defn next
  [n]
  (if (even? n)
    (/ n 2)
    (inc (* 3 n))))



(def chain-length
  (memoize 
    (fn[n]
      (if (= 1 n)
        1
        (+ 1 (chain-length (next n)))))))

(defn solve
 []
 (->> (range 1 (* 1000 1000))
      (map (juxt chain-length identity))
      (apply max-key first)
      (second)))

(println (solve))
