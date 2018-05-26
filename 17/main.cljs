(def units
  (count "onetwothreefourfivesixseveneightnine"))

(def tens
  (count "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen"))

(def twenty
  (+ units  (* 10 (count "twenty"))))

(def thirty
  (+ units  (* 10 (count "thirty"))))

(def forty
  (+ units  (* 10 (count "forty"))))

(def fifty
  (+ units  (* 10 (count "fifty"))))

(def sixty
  (+ units  (* 10 (count "sixty"))))

(def seventy
  (+ units  (* 10 (count "seventy"))))

(def eighty
  (+ units  (* 10 (count "eighty"))))

(def ninety
  (+ units (* 10 (count "ninety"))))

(def hundred
  (+ units tens twenty thirty forty fifty sixty seventy eighty ninety))

(def total
  (+ (count "onethousand")
     (* 10 hundred)
     (* 100 units)
     (* 900 (count "hundred"))
     (* 891 (count "and"))))

(println total)
