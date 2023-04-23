package com.formosa1544.sample

import org.scalatest.wordspec._

class SampleSpec extends AnyWordSpec {
  "The sample code" should {
    "say hello" in {
      assert(Sample.greeting.startsWith("h"))
    }
  }
}
