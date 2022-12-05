
#This octaveSmoother is programmed to take my csv file from previous program to be smoothed
ind = csvread("Salted Plotted Excel.csv")
x = 10
y = 2
yPoints = ind(:, y)
saltedy = yPoints;

#using movmean to get a moving average of the salted yvalues
#this function was learned by me from
#(https://docs.octave.org/v6.2.0/Statistics-on-Sliding-Windows-of-Data.html)
smoothing = movmean(saltedy, x)

lineChart = [saltedy, smoothing]


#plotting both salted yvalues and smoothed yvalues to compare
plot(lineChart)
title ("Salted and Smoothed  y = mx + b");
legend("Salted", "Smoothed")
xlabel("X Axis")
ylabel("Y Axis")




