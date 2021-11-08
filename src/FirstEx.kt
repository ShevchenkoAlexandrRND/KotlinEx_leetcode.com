fun main(args: Array<String>) {

//      fizzBuzz(15)
//      print(fizzBuzzWhen(15))
//      print(reverse(123))
//     print(firstUniqChar("2223"))
}

fun fizzBuzz(n: Int): Unit {
    var answer: MutableList<String> = mutableListOf()
    var numBers: List<Int> = (1).rangeTo(n).toList()
    for (i in numBers) {

        if (i % 3 == 0 && i % 5 != 0) {
            answer.add("Fizz")
        }
        if (i % 5 == 0 && i % 3 != 0) {
            answer.add("Buzz")
        }

        if (i % 5 == 0 && i % 3 == 0) {
            answer.add("FizzBuzz")
        }
        if (i % 5 != 0 && i % 3 != 0) answer.add(i.toString())


    }




    return print(answer)

}

fun fizzBuzzWhen(n: Int): List<String> {

    var numBers: MutableList<String> = mutableListOf()

    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> numBers.add("FizzBuzz")
            i % 3 == 0 -> numBers.add("Fizz")
            i % 5 == 0 -> numBers.add("Buzz")

            else -> numBers.add(i.toString())

        }


    }
    return numBers
}

fun reverse(x: Int): Int {
    if (x >= -2147483648 || x <= 2147483647) {
        var str = x.toString()
        var strMinus: String

        if (str[0] == '0') {
            str.removeRange(0, 0)
            str = str.reversed()
        }
        if (str[0] == '-') {
            strMinus = str.substringAfter('-').toString()
            str = str[0] + strMinus.reversed()
        } else str = str.reversed()


        if (str.toLong() <= -2147483648 || str.toLong() >= 2147483647) {
            return 0
        } else return str.toInt()
    } else return 0

}

fun firstUniqChar(s: String): Int {


    var IndexArr: MutableList<Int> = mutableListOf()
    var it = 0
    var sum = 0
    if (s.length >= 1 && s.length <= 100000) {
        for (i in s) {
            for (j in 0..s.length - 1) {
                if (s[j] == i) sum++
                if (sum > 2) break
            }
            IndexArr.add(sum)
            sum = 0
        }
        for (i in IndexArr) {
            if (i == 1) {
                it = IndexArr.indexOf(i)
                break
            } else it = -1
        }
        return it
    }
    return -1
}



