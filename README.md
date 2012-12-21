# log-parser

A proof of concept of a parallel capable log file parser that reads in
lines from standard input, and parses them using Clojure's futures, and
writes them back out to standard output using an agent

This uses the lein exec plugin of of Leiningen to be able to run Clojure
files as executables on the command line of *nix enviornments.

## Usage
To run with a sample test input file, run

tail test_input | ./script.clj

To generate a random set of inputs it can be run by:

./log-generation.clj | ./script.clj

## License

Copyright © 2012 Proctor

Distributed under the Eclipse Public License, the same as Clojure.
