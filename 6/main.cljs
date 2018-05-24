(defn square [n]
  (* n n))

(defn solve
  []
  (-
   (square 
     (->> (range 101)
          (apply +)))

   (->> (range 101)
        (map square)
        (apply +))))

(println (solve))
