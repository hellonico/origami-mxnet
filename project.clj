(let [properties (select-keys (into {} (System/getProperties)) ["os.name"])
      platform (apply format "%s" (vals properties))
      mxnet (case platform
              "Mac OS X" '[org.apache.mxnet.contrib.clojure/clojure-mxnet-osx-cpu "1.4.0"]
              '[org.apache.mxnet.contrib.clojure/clojure-mxnet-linux-cpu "1.4.0"])]

  (defproject neural-style "0.1.0-SNAPSHOT"
    :description "Neural Style Transfer with MXNet"
    :repositories [["mxnet"      {:url "https://repository.apache.org/content/repositories/staging"}]
                   ["vendredi"   {:url "https://repository.hellonico.info/repository/hellonico/"}]]
    :dependencies [[org.clojure/clojure "1.9.0"]
                   ~mxnet
                   [origami "4.3.0-8"]]
    :main neural-style.core))