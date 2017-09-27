var sum= 0
for (ch<- "Hello")
  sum+= ch

for(i<- 1 to 3;from=4-i;j<- from to 3) print((10*i+j)+" ")

var c= -1
if(c>0){1
} else if(c==0)0 else -1

println("Answer:" + 42)

printf("Hello %s,you are %d years old.\n","Akshay",22)

for(i <- 1 to 10)yield i % 3

for(c <- "Hello"; i <- 1 to 3)yield (c+i).toChar

def decorate(str: String="Hello",left: String= "[",right: String="]")= {
    left + str + right
}
decorate( "akshay")
decorate( "akshay","(",")")

val x: String = decorate("Raj")

def sum(args: Int*) {
  var result=0
  for(arg<- args) result+= arg
}
val s=sum(1, 4, 9, 15, 16, 25)
print(s)

def signum(a: Int)={
  if(a>0){1
  }else if(a<0){-1
  }else 0
}
signum(2)
signum(-5)
signum(0)

