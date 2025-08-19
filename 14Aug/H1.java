class H1{
public static void main(String[]arg){

int arr[] = {8,2, 1,8, 3, 1, 2, 2, 9, 7, 3, 4, 2};
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j] && arr[i] != -1) {
            arr[i] = -1; 
            break;       
        }
    }
}

for (int i = 0; i < arr.length; i++) {
    if (arr[i] != -1) {
        System.out.print(arr[i] + " ");
    }
}
}
}