#!/bin/bash lein exec

(loop [x 1N]
  (println (str x " " (rand)))
  (recur (inc x)))
