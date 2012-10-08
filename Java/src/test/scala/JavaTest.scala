package bingo.java.test

import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter

import main.java.bingo.java.demo.Test

class JavaTest extends FunSpec with BeforeAndAfter {
 describe("Java test") {
    it("demo") {
      assert(Test.getValue() == 1)
    }
  }
}