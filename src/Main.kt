class Main

fun main() {
    val father = Father("Sergey", 45, "engineer", true)
    val mother = Mother("Olga", 42, "dancing", 2)
    val son = Son("Vadim", 22, "student", false)
    val daughter = Daughter("Svetlana", 19, "study", null)

    father.say()
    mother.say()
    son.say()
    daughter.say()

    val members = ArrayList<Human>()
    members.add(father)
    members.add(mother)
    members.add(son)
    members.add(daughter)

    members.sortBy {
        it.age
    }

    members.forEach {
        println(it.name + " " + it.age)
    }
}