# TDD approach to a TIC-TAC-TOE game

[![MIT License](https://img.shields.io/badge/license-MIT%20License-green.svg)][1]
[![Java Platform](https://img.shields.io/badge/platform-Java-blue.svg)][2]

The **TIC-TAC-TOE Game** rules are:

- X always goes first
- players cannot play on a played position
- players alternate placing X’s and O’s on the board until either:
    - all nine squares are filled
    - one player has three in a row, horizontally, vertically or diagonally.

If all nine squares are filled and neither player has three in a row, the game is a **draw**.
If a player is able to draw three X’s or three O’s in a row, that player **wins**.

The goal of this project is to build a simple TIC-TAC-TOE game following a **[Test Driven Development][3]** approach.

> "Write a test first, then focus on writing just enough code to make the test pass, only using simple constructs. 
> Once the test is green, look for opportunities to make the code better, removing duplication, applying patterns, 
  and generalizing the code." ~ [Sandro Mancuso][4]

> Sandro Mancuso 


## Requirements

- Download and install [Java SE 8][5]
- Download and install [Maven 3.5.3][6]


## License

[The MIT License (MIT)][7]

````
Copyright (c) 2018 Solange Umuhire Gasengayire.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

````


[1]: https://github.com/SolangeUG/tic-tac-toe-game/blob/master/LICENSE
[2]: https://docs.oracle.com/en/java/
[3]: http://agiledata.org/essays/tdd.html
[4]: https://codurance.com/blog/author/sandro-mancuso/
[5]: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[6]: https://maven.apache.org/download.cgi
[7]: https://opensource.org/licenses/MIT
