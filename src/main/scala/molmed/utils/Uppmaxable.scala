package molmed.utils

import org.broadinstitute.sting.commandline.Hidden
import org.broadinstitute.sting.commandline.Argument

trait Uppmaxable {

  @Argument(doc = "Uppmax qos flag", fullName = "quality_of_service", shortName = "qos", required = false)
  var uppmaxQoSFlag: Option[String] = None

  @Argument(doc = "Uppmax project id", fullName = "project_id", shortName = "upid", required = false)
  var projId: String = ""

  @Argument(doc = "Project name", fullName = "project_name", shortName = "name", required = false)
  var projectName: Option[String] = None

}