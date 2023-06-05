#giving input string

import scala.io.Source
object sc{
  def main(args.Array[string]){
    val ip = "hi nmit cse nmit banglore nmit cse"
    val wordCount = scala.Collection.mutable.Map[string,int]()
    for(word <- ip.split(" "))
    wordCount(word) = if(wordCount.contains(word) )
                         wordCount(word)+1 
                        else
                         1
    println(wordCount)
    }
}
#with giving file as input

import scala.io.Source

object sc{
    def main(args:Array[String])
    {
        val wordCount = scala.Collection.mutable.Map[string, int]()
        for(line <- Source.fromFile("5.txt").getLines)
        for(word <- line.split(" "))
            wordCount(word) = if(wordCount.conatins(word))
                                wordCount(word)+1 
                                else
                                1 
        for((k,v) <- wordCount)
            printf("word %s occurs %d times \n", k,v);
    }
}
