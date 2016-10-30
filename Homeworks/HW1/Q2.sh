
find . -name '*.txt' | xargs -I{} tail -n 5 {} >>allmixedLast5

 

