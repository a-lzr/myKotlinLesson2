class Daughter(name: String, age: Int, hobby: String, countСhildrens: Int?) :
    Mother(name, age, hobby, countСhildrens) {
    override fun say() {
        println(sayOfWoman(name, age, hobby) + " I'm daughter." + sayOfMother(countСhildrens))
    }
}