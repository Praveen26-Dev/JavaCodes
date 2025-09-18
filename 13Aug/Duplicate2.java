class Duplicate2{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,4,2,1,23,4,34};
        for(int i=0;i<arr.length;i++){
            boolean duplicate = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[j]!=-1){
                    duplicate = true;
                    arr[j]=-1;
                }
            }
            if(duplicate){
                System.out.println("duplicate elements => "+arr[i]+" ");
            }
        }
    }
}