package scalikejdbc.globalsettings

sealed trait IgnoredParamsValidation

object NoCheckForIgnoredParams extends IgnoredParamsValidation

object InfoLoggingForIgnoredParams extends IgnoredParamsValidation

object WarnLoggingForIgnoredParams extends IgnoredParamsValidation

object ExceptionForIgnoredParams extends IgnoredParamsValidation
