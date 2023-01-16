# Design

## Nouns

1. Lemurer
2. Djur (interface)
3. Inhängnad (class)
4. Butik (class)
5. Personal
6. Biljetter
7. Förtäring
8. Namn
9. Akvarium
10. Terrarium

## Verbs

1. Köpa biljett
2. Titta på djur
3. Äta
4. Ta betalt
5. Sälja
6. Mata djur
7. Städa
8. Vårda djur
9. Schemalägga personal
10. Betala ut löner


```mermaid
classDiagram
    Animal <|-- Lemur
    Lemur "+0..*" -- "1" Enclosure
    Personell "+1..*" -- "+0..*"  Enclosure
    Personell "+1..*" -- "+0..*" Animal
    class Animal {
        +eat():boolean
        +sleep():boolean
        +snuggle():String
    }
    class Lemur {
        -name:String
        -age:int
        -fluffiness:int
	    -hunger:int
	    -isHungry:boolean
	    -energyLevel:int
	    -isTired:boolean
	    -isDirty:boolean
        +speak():String
        +backflip():String
	    +getOld():int
	    +beatBox():String
    }
    class Enclosure {
        -size:double
        -dirty:boolean
        -temperatue:double
        +clean()
        +open()
        +close()
    }
    class Personell {
        -name:String
        -age:int
        -title:String
        -salary:int
        -balance:int
        +sell():boolean
        +feedAnimal():boolean
        +clean():boolean
        +acceptPayment()
        +washAnimal():boolean
    }
```
