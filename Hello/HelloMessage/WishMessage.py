a= int(input("Enter lower range: "))  
#upper = int(input("Enter upper range: "))  

for i in range(1,a+1):
        ct=0
        for j in range(1,i+1):
            if i%j==0:
                ct=ct+1
                
        if ct==2:
            print(i)