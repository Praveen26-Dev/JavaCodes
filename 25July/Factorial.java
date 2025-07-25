int fact=1;
    cin>>num;
    if(num<=1){
        cout<<"factorial is "<<num<<endl;
    }

    for(int i=1;i<=num;i++){
        fact = fact*i;
    }
    cout<<fact;