'''
from abc import ABC,abstractmethod
class Demo(ABC):
      @abstractmethod
      
      def play(self):
          a =(int)(input("enter number"))
          for i in range(1,11):
              print(a,"*",i,"=",a*i)

              
class Number(Demo):
       def play(self):
         print("calculating")
d=Number()
d.play()

'''
class Number:
  @staticmethod
  def static(a):
   for i in range(1,11):
    print(a,"*",i,"=",a*i)

a =int(input("enter number"))
Number.static(a)

