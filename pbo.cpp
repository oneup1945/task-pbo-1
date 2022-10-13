#include <iostream>
#include <string>
using namespace std;
/*SEMANGAT NUGAS*/
int main(){
    int i, j;
    int x=0;
int A[2][2], B[2][2], O[2][2];
cout<<"Penjumlahan Matriks 2×2"<<endl;
cout<<"Input elemen matriks: "<<endl;

    for(i=0;i<2;i++){
        for(j=0;j<2;j++){
        cout<<"A["<<(i+1)<<"]["<<(j+1)<<"] = ";
        cin>>A[i][j];
            }
         }

    for(i=0;i<2;i++){
       for(j=0;j<2;j++){
            cout<<"B["<<(i+1)<<"]["<<(j+1)<<"] = ";
            cin>>B[i][j];
            }
        }

for(i=0;i<2;i++){
    for(j=0;j<2;j++){
       O[i][j]=A[i][j]+B[i][j];
    }
}

cout<<"Matriks A: "<<endl;
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
cout<<A[i][j]<<"\t";
}
cout<<endl;
}
cout<<endl;

cout<<"Matriks B:"<<endl;
for(i=0;i<2;i++){
        for(j=0;j<2;j++){
            cout<<B[i][j]<<"\t";
    }
    cout<<endl;
  }
 cout<<endl;

 cout<<"Hasil Penjumlahan Matriks A dan B:"<<endl;
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                cout<<O[i][j]<<"\t";
                //cout<<"["<<O[i]<<","<<O[j]<<"]"<<endl;
            }
            cout<<endl;
        }

    if (x<2){
        cout<<"Program bisa dijalankan"<<endl;
    }else{
            cout<<"Program tidak bisa dijalankan"<<endl;

        }

        do{
            cout<<"mantab";
            i++;
        }while (i<3);

return 0 ;
}
