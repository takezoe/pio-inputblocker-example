pio-inputblocker-example
========

An example project of PredictionIO input blocker plugin.

Put the plugin jar file to `$PIO_HOME/plugins`.

```
$ sbt package
$ cp target/scala-2.10/pio-inputblocker-example_2.10-0.0.1-SNAPSHOT.jar $PIO_HOME/plugins
```

And run the event server.

When events are regsitered via event server API, `InputBlockerPlugin.process()` is called for each event.　You can stop event registraion by throwing an exception in this method.　Then the event server returns 500 error such as:

```
HTTP/1.1 500 Internal Server Error
Server: spray-can/1.3.3
Date: Mon, 19 Jun 2017 06:51:59 GMT
Content-Type: application/json; charset=UTF-8
Content-Length: 23

{"message":"Exception message"}
```

