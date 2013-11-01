(ns rekvur.core
  (:require [clojure.math.numeric-tower :as math]))

(defn powerof [x po]
  "Calculates the x power of po"
  (reduce * (repeat po x)))

(defn discriminant 
  "Calculates discriminant"
  [a b c] 
  (let [b2 
        (powerof b 2)]
    (- b2 (reduce * [4 a c]))))

(defn rekvur-x1 
  [a b c m]
  (let 
      [D (math/sqrt (discriminant a b c)) 
       delimeter (* a 2)
       rad (* m b)]
    ( / (- rad D) delimeter)))

(defn -main 
  [& args]
  (println "X1:"(rekvur-x1 1  3 -4 -1))
  (println "X2:"(rekvur-x1 1  3 -4  1))
)
