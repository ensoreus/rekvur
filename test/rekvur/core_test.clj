(ns rekvur.core-test
  (:require [clojure.test :refer :all]
            [rekvur.core :refer :all]))

(deftest D-test
  (testing "Descriminant calculations wrong"
    (is (= (discriminant 1 3 -4) 25))))

(deftest powerof-test
  (testing "power of P calcs wrong" 
    (is (= (powerof 2 2) 4))))

(deftest rekvur-x1-test
  (testing "X1 calculations"
    (is (= (rekvur-x1 1  3 -4 -1) -4)))
  (testing "X2 calculations" 
    (is (= (rekvur-x1 1 3 -4 1) 1)))
)

