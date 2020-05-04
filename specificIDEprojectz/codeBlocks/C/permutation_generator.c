void perm(char *list,int i,int n)
{/* generate all the permutations of list[i] to list[n] */
    int j,temp;
    if(i==n){
        for(j=0;j<=n;j++)
            printf("%c",list[j]);
        printf("    ");
    }
    else {
        /*list[i] to list[n] has more than one permutation,
        generate these recursively */
        for(j=i;j<=n;j++){
            SWAP(list[i],list[j],temp);
            perm(list,i+1,n);
            SWAP(list[i],list[j],temp);
        }
    }
}
