/**
 * Created by meme_macpro on 2017. 8. 3..
 */

fun main(args: Array<String>) {
    println("hello kotlin")
    sum(a = 1, b = 2)
}

fun sum(a: Int, b: Int): Unit {
    println(str1)

    println(max(a=1, b=4))

    var data: Int? = null
    data?.let {
        print(data)
    }
    data ?: print("there is null")

    val str4 = "d"
    str4.spaceToCamel()

    Resource.name
}

var str0 = 0
var str1 = "${str0} is zero"

fun max(a: Int, b: Int) = if (a>b) {
        a
    } else {
        b + a
    }

fun describe(obj: Any) =
        when (obj) {
            1           -> "one"
            is String   -> "is String"
            !is Int     -> "not Int"
            else        -> "default"
        }

fun String.spaceToCamel() {

}

object Resource {
    val name = "Name"
}