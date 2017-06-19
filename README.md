pio-inputblocker-example
========

An example project of PredictionIO input blocker plugin.

Put the plugin jar file to `$PIO_HOME/plugins`.

```
$ sbt package
$ cp target/scala-2.10/pio-inputblocker-example_2.10-0.0.1-SNAPSHOT.jar $PIO_HOME/plugins
```

And run the event server.

When events are regsitered via event server API, `InputBlockerPlugin.process()` is called for each event.
You can stop event registraion by throwing an exception in this method.

