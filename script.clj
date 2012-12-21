#!/usr/bin/env lein exec

(use '[clojure.string :only (join)])


(def out (agent *out*))

(defn writeln [^java.io.Writer w line]
  (doto w
    (.write (str line "\n"))
    .flush))

(defn analyze-line [line]
  (str line "   " (join "  " (map #(join ":" %) (sort-by val > (frequencies line))))))

(defn process-line [line]
  (send-off out writeln (analyze-line line)))

(loop []
  (let [line (read-line)]
    (when line
      (future (process-line line)))
      (recur)))
