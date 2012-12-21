(ns log-parser.core
  (:gen-class :main true))

(defn -main
  "I don't do a whole lot."
  []
  (loop []
    (let [line (read-line)]
      (println line)
      (recur))))
