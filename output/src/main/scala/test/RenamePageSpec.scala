package test

import org.scalatest._
import org.scalatestplus.selenium.Page

class RenamePageSpec extends FunSuite {

  test("test example") {
    class TestPage extends Page {
      val url = "https://www.artima.com/test.html"
    }
    succeed
  }
}
