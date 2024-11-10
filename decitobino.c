#include<stdio.h>
void main(){
    int number,a[34],i=0,rem;
    printf("enter te number:");
    scanf("%d",&number);
    while(number){
        rem=number%2;
        number=number/2;
        a[i]=rem;
        i++;
    }
    for(int j=i-1;j>=0;j--){
        printf("%d",a[j]);
    }

}