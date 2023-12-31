package com.example.chesspuzzle.data
var knight = "0"
val knightMove = when(knight){
    "a1" -> listOf("b3","c2")
    "b1" -> listOf("a3","c3","d2")
    "c1" -> listOf("a2","b3","d3","e2")
    "d1"-> listOf("b2","c3","e3","f2")
    "e1"-> listOf("c2","d3","f3","g2")
    "f1"-> listOf("d2","e3","g3","f2")
    "g1"-> listOf("e2","f3","h3")
    "h1"-> listOf("f2","g3")

    "a2" -> listOf("b4","c3","c1")
    "b2" -> listOf("a4","c4","d3","d1")
    "c2" -> listOf("a3","b4","d4","e3","e1","a1")
    "d2"-> listOf("b3","c4","e4","f3","f1","b1")
    "e2"-> listOf("c3","d4","f4","g3","g1","c1")
    "f2"-> listOf("d3","e4","g4","h3","h1","d1")
    "g2"-> listOf("e3","f4","h4","11")
    "h2"-> listOf("f1","g4","f3")

    "a3"-> listOf("b1","c2","b5","c4")
    "b3"-> listOf("c1","d2","c5","d4","a5")
    "C3"-> listOf("d1","e2","d5","e4","b5","a4","a2","b1")
    "d3"-> listOf("e1","f2","e5","f4","c5","b4","b2","c1")
    "e3"-> listOf("f1","g2","f5","g4","d5","c4","c2","d1")
    "f3"-> listOf("g1","h2","g5","h4","e5","d4","d2","e1")
    "g3"-> listOf("h1","h5","f5","e4","e2","f1")
    "h3"->listOf("g1","g5","f2","f4")

    "a4"-> listOf("b2","c3","b6","c5")
    "b4"-> listOf("c2","d3","c6","d5","a6")
    "C4"-> listOf("d2","e3","d6","e5","b6","a5","a3","b2")
    "d4"-> listOf("e2","f3","e6","f5","c6","b5","b3","c2")
    "e4"-> listOf("f2","g3","f6","g5","d6","c5","c3","d2")
    "f4"-> listOf("g2","h3","g6","h5","e6","d5","d3","e2")
    "g4"-> listOf("h2","h6","f6","e5","e3","f2")
    "h4"->listOf("g2","g6","f3","f5")

    "a5"-> listOf("b3","c4","b7","c6")
    "b5"-> listOf("c3","d4","c7","d6","a7")
    "C5"-> listOf("d3","e4","d7","e6","b7","a6","a4","b3")
    "d5"-> listOf("e3","f4","e7","f6","c7","b6","b4","c3")
    "e5"-> listOf("f3","g4","f7","g6","d7","c6","c4","d3")
    "f5"-> listOf("g3","h4","g7","h6","e7","d6","d4","e3")
    "g5"-> listOf("h3","h7","f7","e6","e4","f3")
    "h5"->listOf("g3","g7","f4","f6")

    "a6"-> listOf("b4","c5","b8","c7")
    "b6"-> listOf("c4","d5","c8","d7","a8")
    "C6"-> listOf("d4","e5","d8","e7","b8","a7","a5","b4")
    "d6"-> listOf("e4","f5","e8","f7","c8","b7","b5","c4")
    "e6"-> listOf("f4","g5","f8","g7","d8","c7","c5","d4")
    "f6"-> listOf("g4","h5","g8","h7","e8","d7","d5","e4")
    "g6"-> listOf("h4","h8","f8","e7","e5","f4")
    "h6"->listOf("g4","g8","f5","f7")

    "a7"-> listOf("b5","c6","c8")
    "b7"-> listOf("c5","d6","d8","a5")
    "C7"-> listOf("d5","e6","e8","a8","a6","b5")
    "d7"-> listOf("e5","f6","f8","b8","b6","c5")
    "e7"-> listOf("f5","g6","g8","c8","c6","d5")
    "f7"-> listOf("g5","h6","h8","d8","d6","e5")
    "g7"-> listOf("h5","e8","e6","f5")
    "h6"->listOf("g5","f6","f8")
    else -> "error"

}

val rook = "0"
val rookMove = when(rook){
    "a1" -> listOf("a1","b1","c1","d1","e1","f1","g1","h1","a2","a3","a4","a5","a6","a7","a8")
    "b1" -> listOf("a2","b2","c2","d2","e2","f2","g2","h2","b2","b3","b4","b5","b6","b7","b8")
    "c1" -> listOf("a3","b3","c3","d3","e3","f3","g3","h3","c2","c3","c4","c5","c6","c7","c8")
    "d1" -> listOf("a4","b4","c4","d4","e4","f4","g4","h4","d2","d3","d4","d5","d6","d7","d8")
    else ->"error"
}