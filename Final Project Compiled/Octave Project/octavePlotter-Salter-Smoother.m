#This plots my function y = mx + b which is  y = 1x + 2
x = 0:100;
m = 1;
b = 2'

y = m*(x)+b

#Plotting unmodified function
subplot(3,1,1)
plot(x,y)
title("Function y = mx + b")
xlabel('X-Axis')
ylabel('Y-Axis')




#Salting the function and plotting
ySalted = y + 10 *randn(size(y));
subplot(3,1,2)
plot(x,ySalted)
title("Salted Function y = mx + b")
xlabel('X-Axis')
ylabel('Y-Axis')


#Smoothing the function and plotting
ySmoothed = movmean(ySalted, 20)
subplot(3,1,3)
plot(x,ySmoothed)
title("Smoothed Function y = mx + b")
xlabel('X-Axis')
ylabel('Y-Axis')
