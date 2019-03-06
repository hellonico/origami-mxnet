(let [properties (select-keys (into {} (System/getProperties))
                              ["os.name"])
      platform (apply format "%s" (vals properties))
      
      ; https://stackoverflow.com/questions/4688336/what-is-an-elegant-way-to-set-up-a-leiningen-project-that-requires-different-dep
      mxnet (case platform
      "Mac OS X" '[org.apache.mxnet.contrib.clojure/clojure-mxnet-osx-cpu "1.4.0"]
      '[org.apache.mxnet.contrib.clojure/clojure-mxnet-linux-cpu "1.4.0"]
      )
      _ (println (str platform mxnet))
      ]

(defproject neural-style "0.1.0-SNAPSHOT"
  :description "Neural Style Transfer with MXNet"
  :repositories [
  ["staging" {:url "https://repository.apache.org/content/repositories/staging"                  :snapshots true
                             :update :always}]
  ["vendredi" {:url "https://repository.hellonico.info/repository/hellonico/"}]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 ; [org.apache.mxnet.contrib.clojure/clojure-mxnet "1.4.0"]
                 ~mxnet
                 [origami "4.0.0-6"]]
  :main neural-style.core)

)