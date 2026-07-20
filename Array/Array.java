class Array{

    int[] arr;
    int capacity;
    int size;

    //Array Creation

    Array(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];

    }

    //Insert

    boolean insert(int index,int element){
        if(index<0 || index>size || size>=capacity){
            System.out.println("Invalid index : cannot insert");
            return false;
        }
        else{
            for(int i=size;i>index;i--){
                arr[i]=arr[i-1];
            }
            arr[index]=element;
            size++;
            return true;
        }
    }

    //access

    int get(int index){
        if(index<0 || index >=size){
            System.out.println("invalid index : cannot get");
            return -1;
        }
        return arr[index];
    }

    int set(int index,int element){
        if(index<0 || index >= size){
            System.out.println("invalid index : cannot set");
            return -1;
        }
        arr[index]=element;
        return arr[index];
    }

    //search

    int search(int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    //delete

    boolean delete(int index){
        if(index<0|| index>=size){
            System.out.println("Cannot index : cannot delete");
            return false;
        }
        else{
            for(int i=index;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            return true;
        }

    }
    //display

    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        Array arr1 = new Array(5);

        arr1.insert(0,5);
        arr1.insert(1,10);
        arr1.insert(1,15);
        arr1.insert(1,20);
        arr1.insert(1,25);
        arr1.insert(1,30);

        arr1.display();

        System.out.println("Get value: " +arr1.get(0));
        System.out.println("Set value in index 1: " +arr1.set(1,70));

        arr1.delete(4);

        arr1.display();

        System.out.println("Search value found in the index: "+arr1.search(15));
    }


}