package pkg1
package pkg2

import scala.annotation.experimental2

class Foo {
  @experimental2
  def foo = "1"

  @annotation.experimental2
  def bar = "1"
}
