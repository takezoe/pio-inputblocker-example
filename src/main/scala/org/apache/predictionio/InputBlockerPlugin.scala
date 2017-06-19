package org.apache.predictionio

import org.apache.predictionio.data.api._

class InputBlockerPlugin extends EventServerPlugin {

  override val pluginName = "pio-inputblocker-example"
  override val pluginDescription = ""
  override val pluginType = "inputblocker"

  override def start(context: EventServerPluginContext): Unit = {
    ???
  }

  override def process(eventInfo: EventInfo, context: EventServerPluginContext): Unit = {
    println(eventInfo.event)
    throw new RuntimeException("invalid!!")
  }

  override def handleREST(appId: Int, channelId: Option[Int], arguments: Seq[String]): String = {
    ???
  }


}
