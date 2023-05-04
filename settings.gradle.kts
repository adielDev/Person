
rootProject.name = "person"

sourceControl {
    val url = "https://github.com/adielDev/Person.git"
    gitRepository(java.net.URI(url)) {
        producesModule("com.andriel:person")
    }
}