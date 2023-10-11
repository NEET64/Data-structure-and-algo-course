package DevideAndConquere;

public class sortedAndrotated {
    static void search(int ar[], int key){
        int left = 0;
        int right = ar.length-1;


        while(left<=right){
            int mid = left + (right - left)/2;
            if(ar[mid] == key){
                System.out.println("found the key at "+mid);
                return;
            }
            if(ar[left] <= key && key <= ar[mid]){
                right = mid-1;
            }else left = mid+1;
        }
        System.out.println("no element found");
    }
    public static void main(String[] args) {
        int ar[] = {4,5,6,7,0,1,2,3};

        search(ar, 4);
    }
}
