package oops.classes

/**
 * There are four visibility modifiers in kotlin
 *
 * 1. public or default - By default each class, variable or function is public final in kotlin
 * 2. private - limits the visibility of class to same file function or method to same class
 *              and variable to same class
 * 3. internal - limits the visibility to same module only
 * 4. protected - limits the visibility to derived class only
 */
open class PublicClass {

    private var privateVar = ""
    var pubicVar = ""
    protected var protectedVar = ""
    internal var internalVar = ""
}

class Test1 : PublicClass() {

    init {
        protectedVar = "protected"
        pubicVar = "public"
        internalVar = internalVar
        // privateVar can not be accessed here as it is defined as private
    }
}

class Test2 {
    init {
        var publicClass = PublicClass()
        publicClass.internalVar = "internal"
        publicClass.pubicVar = "public"
        // protectedVar of PublicClass cannot be accessed here as it is defined protected
        // which means it can not be accessed from any other class apart from derived class
    }
}