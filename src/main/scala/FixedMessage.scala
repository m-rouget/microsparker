import spray.json.DefaultJsonProtocol

/**
 * Created by matt on 11/04/15.
 */

case class FixedMessage(origin: String, service: String, date: String, id: String)


object FixedMessageJsonProtocol extends DefaultJsonProtocol {
  implicit val fixedMessageFormat = jsonFormat4(FixedMessage)
}

