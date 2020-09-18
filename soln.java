class hr
{
    public static void main(int n)
    {
        String[][] arr=new String[10000][10000];
        int ii=n*2+1;
        int jj=n*2+2;
        for(int i=0;i<ii;i++)
        {
            for(int j=0;j<jj;j++)
            {
                if(i==0||i==ii-1)
                {
                    if(j==0 ||j==jj-1)
                    arr[i][j]="+";
                    else if(j>0 && j<jj-1)
                    arr[i][j]="-"; 
                    else
                    arr[i][j]=" ";
                }
                else
                {
                    if(j==0 || j==jj-1)
                    arr[i][j]="|";
                    else
                    arr[i][j]=" ";
                }
            }
        }
        int c=1,d=1;
        for(int i=(ii/2);i>1;i--)
        {
            d=1;
            for(int j=1;j<i;j++)
            {
                arr[c][d]=" ";
                d++;
            }
            for(int j=(jj/2);j>i;j--)
            {
                if(j==(jj/2))
                arr[c][d]="/";
                else
                    if(c%2==0)
                    arr[c][d]="-";
                    else
                    arr[c][d]="=";
                d++;
            }
            for(int j=jj/2;j>i;j--)
            {
                if(j==i+1)
                arr[c][d]="\\";
                else
                {
                    if(c%2==0)
                    arr[c][d]="-";
                    else
                    arr[c][d]="=";
                }
                d++;
            }
            c++;
        }
        d=1;
        for(int j=1;j<jj-1;j++)
        {
            if(j==1)
            arr[c][d]="<";
            else if(j+1==jj-1)
            arr[c][d]=">";
            else
                if(c%2==0)
                arr[c][d]="-";
                else
                arr[c][d]="=";
            d++;
        }
        c++;
        for(int i=ii/2;i>1;i--)
        {
            d=1;
            for(int j=jj/2;j>i;j--)
            {
                arr[c][d]=" "; 
                d++;
            }
            for(int j=1;j<i;j++)
            {
                if(j==1)
                arr[c][d]="\\";
                else
                    if(c%2==0)
                    arr[c][d]="-";
                    else
                    arr[c][d]="=";
                d++;
            }
            for(int j=1;j<i;j++)
            {
                if(j+1==i)
                arr[c][d]="/";
                else
                    if(c%2==0)
                    arr[c][d]="-";
                    else
                    arr[c][d]="=";
                d++;
            }
            c++;
        }
        for(int i=0;i<ii;i++)
        {
            for(int j=0;j<jj;j++)
            System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
    
