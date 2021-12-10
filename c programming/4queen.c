#include<stdio.h>
#include<stdlib.h>
int place(int row, int column);
void printslo(int n);
int x[16],c;
void Nqueen(int row, int n)
{
     int column;
     for (column = 1; column <=n; ++column)
     {
         if(place(row,column))
         {
             x[row]=column;
             if(row==n)
                printslo(n);
            else
                Nqueen(row+1,n);
         }
     }
}

int place(int k, int i)
{
    int j;
    for (j = 1; j <=k-1;++j){
        if(x[j]==1 || abs(x[j]-i)==abs(j-k) )
        return 0;
    }
    return 1;
}

int main()
{
    int n, j,i;
    void Nqueen(int row, int n);
    printf("\n Enter the number of Queens:");
    scanf("%d",&n);
    Nqueen(1,n);
    return 0;
}
void printslo(int n)
{
    int i,j;
    printf("\n Solution %d:\n",++c);
    for(i=1;i<=n;++i)
    printf("\t%d",i);
    for(i=1;i<=n;++i);
    {
        printf("\n\n%d",i);
        for(j = 1; j <=n;++j)
        {
            if(x[i]==j)
                printf("\tQ");
            else
                printf("\t-");
        }
    }
    
}
