
# neural-style

This is a repackage of the [neural style transfer example of Mxnet.](https://github.com/apache/incubator-mxnet/tree/master/contrib/clojure-package/examples/neural-style) 

# Run 

```
# usage
# lein run <content-image> <style-image>

# example
lein run annecy.jpg starry_night.jpg 
```

# Single jar file

```
lein uberjar
java -jar target/neural-style-0.1.0-SNAPSHOT-standalone.jar annecy.jpg starry_night.jpg 
```

# Example 

```
lein run annecy.jpg starry_night.jpg 
```

With content image ...
![](annecy.jpg)

And style image ...

![](starry_night.jpg)

Result keeping blur after 30 iterations ...

![](out_28.png)

FInal result no blur

![](final.png)