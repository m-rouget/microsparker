/**
 * Created by matt on 11/04/15.
 */

import spray.json._
import DefaultJsonProtocol._ // if you don't supply your own Protocol (see below)

import FixedMessage._
import FixedMessageJsonProtocol._

object Generator {
  def main(args: Array[String]): Unit = {
    println("Generator have started")

    /*
    { "origin":"ALPH", "service":"ASTART", "id": "452c624c-e08c-11e4-946b-6cf04927244f", "date":"2015-04-11T16:27:10+0200", "infos": { "type": "gold" }}
     */

    val myMessage = FixedMessage("ALPH", "ASTART", "452c624c-e08c-11e4-946b-6cf04927244f", "2015-04-11T16:27:10+0200")


    val myMessageJson = myMessage.toJson

    println(myMessage)
    println(myMessageJson.prettyPrint)

    println("Generator have terminated")
  }
}
