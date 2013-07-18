#!/usr/bin/env groovy

def output(Integer number) {
  1.upto(number) { num ->
    def output = ""
    if (num % 3 == 0) { output = output + "Fizz " }
    if (num % 5 == 0) { output = output + "Buzz" }
    if (output == "") { output = num.toString() }
    println output
  }
}
output(42)
