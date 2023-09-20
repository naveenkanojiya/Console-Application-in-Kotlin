package ShopApp

fun main(){
    println("Welcome to My Toy Shop")
    val toyList= arrayListOf<ShopProduct>()

    toyList.add(ShopProduct("LEGO Classic Bricks Set", 30))
    toyList.add(ShopProduct("Barbie Dreamhouse", 160))
    toyList.add(ShopProduct("Hot Wheels 20 Car Gift Pack", 20))
    toyList.add(ShopProduct("Nerf N-Strike Elite Disruptor Blaster", 13))
    toyList.add(ShopProduct("Melissa & Doug Wooden Jigsaw Puzzles", 12))
    toyList.add(ShopProduct("Fisher-Price Baby Bouncer",  40))
    println("-------------------------------------------------------------------")
    println("Product :")
    for (items in toyList){
        println("${items.name} Rate :${items.price}")
    }
    println("-------------------------------------------------------------------")
    println("What you want to purchase?")
    val a = readln()
    println("How many $a you want to buy?")
    val q  = readln()
    val qq  =  q.toInt()
    var price  = 0

    when (a){
        "LEGO Classic Bricks Set" ->{
            price = 30

        }
        "Barbie Dreamhouse" -> {

            price = 160
        }
        "Hot Wheels 20 Car Gift Pack" ->{
            price =20

        }
        "Nerf N-Strike Elite Disruptor Blaster" ->{
            price = 13

        }
        "Melissa & Doug Wooden Jigsaw Puzzles" ->{
            price = 12

        }
        "Fisher-Price Baby Bouncer"->{
            price = 40

        }
        else->{
            price =0
        }
    }

    val finalBill = price * qq
    println("Pay ${finalBill*qq} and take your Product")


}