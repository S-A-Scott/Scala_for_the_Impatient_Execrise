import scala.beans.BeanProperty
class Student(@BeanProperty var name: String,
              @BeanProperty var id: Long) {

}

// scalac ex5_5.scala
// javap -private Student.class
