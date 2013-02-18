Scala SQLite
============

Example of using [SQLite][sqlite] from Scala with the [Slick][slick] library and
the [Xerial SQLiteJDBC driver][xerial].

Does not require SQLite to be installed.

Run the example using:

    ./sbt012 run

A SQLite database called `test.db` will be created. It can be examined using `sqlite3` for example:

    $ sqlite3 test.db
    sqlite> select * from test_table;
    1|It was many and many a year ago,
    2|In a kingdom by the sea,
    3|That a maiden there lived whom you may know
    4|By the name of Annabel Lee;
    5|And this maiden she lived with no other thought
    6|Than to love and be loved by me.



[sqlite]: http://www.sqlite.org/
[slick]: http://slick.typesafe.com/
[xerial]: https://www.xerial.org/trac/Xerial/wiki/SQLiteJDBC