package com.gu.sqlite

object TestDatabase extends SQLite("test") with App {

  def addRow(id: String, value: String) {
    database("insert or replace into test_table values ('%s', '%s')".format(id, value))
  }

  if (!database.tableNames().contains("test_table")) {
    database("create table test_table(id varchar(18), value varchar(4196))")
  }

  TestDatabase.addRow("1", "It was many and many a year ago,")
  TestDatabase.addRow("2", "In a kingdom by the sea,")
  TestDatabase.addRow("3", "That a maiden there lived whom you may know")
  TestDatabase.addRow("4", "By the name of Annabel Lee;")
  TestDatabase.addRow("5", "And this maiden she lived with no other thought")
  TestDatabase.addRow("6", "Than to love and be loved by me.")
}
