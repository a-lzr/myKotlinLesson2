class Son(name: String, age: Int, occupation: String, hasFamily: Boolean) : Father(name, age, occupation, hasFamily) {
    override fun say() {
        println(sayOfMan(name, age, occupation) + " I'm son." + sayOfFather(hasFamily))
    }
}