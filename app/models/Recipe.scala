package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current

case class Recipe (id: Long, name: String)

object Recipe {
//  def all(): List[Recipe] = DB.withConnection() { implicit c =>
//    SQL("SELECT * FROM recipe").as(recipe *)
//  }
}