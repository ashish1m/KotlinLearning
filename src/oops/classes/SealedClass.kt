package oops.classes

import java.util.*

fun main(args: Array<String>) {
    val entity = EntityFactory.create(EntityType.MEDIUM)
    val msg = when(entity){
        is Entity.Easy -> "Easy class"
        is Entity.Medium -> "Medium class"
        is Entity.Hard -> "Hard class"
        Entity.Help -> "Help class"
    }

    println(msg)
    println(entity.toString())
}

sealed class Entity {
    data class Easy(var id: String, var name: String) : Entity()
    data class Medium(var id: String, var name: String) : Entity()
    data class Hard(var id: String, var name: String, var multiplier: Float) : Entity()

    object Help :Entity(){
        var name = "Help"
    }
}

enum class EntityType{
    HELP, EASY, MEDIUM, HARD
}

object EntityFactory {

    fun create(type: EntityType):Entity {
        val id = UUID.randomUUID().toString()
        val name = type.name

        return when(type){
            EntityType.HELP -> Entity.Help
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
        }
    }
}