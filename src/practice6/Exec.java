package practice6;

public class Exec {
    public static <T> void insertionSort(Comparable<T>[] arr) {
        Comparable<T> current;
        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j - 1].compareTo((T) current) == 1) {
                    arr[j] = arr[j - 1];
                } else {
                    arr[j] = current;
                    break;
                }
            }
        }
    }
    private static int split(Student[] arr, int left, int right) {
        Student splitter = arr[right];
        int i = (left - 1);

        Student temp;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j].getSortingByGPA().compare(arr[j], splitter) != 1) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return (i + 1);
    }

    public static void quickSort(Student[] arr, int left, int right) {
        if (left < right) {
            int splitter = split(arr, left, right);

            quickSort(arr, left, splitter - 1);
            quickSort(arr, splitter + 1, right);
        }
    }
    public static Student[] mergeSort(Student[] leftArr, Student[] secondArr) {
        int fal = leftArr.length, sal = secondArr.length;
        Student[] fullArr = new Student[fal + sal];
        System.arraycopy(leftArr, 0, fullArr, 0, fal);
        System.arraycopy(secondArr, 0, fullArr, fal, sal);

        mergeSort(fullArr, 0, fal + sal - 1);

        return fullArr;
    }

    public static void mergeSort(Student[] arr, int l, int r) {
        if (l == r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        int i = l;
        int j = mid + 1;
        Student[] temp = new Student[arr.length];
        for (int step = 0; step < r - l + 1; step++) {
            if ((j > r) || ((i <= mid) && (arr[i].getSortingByGPA().compare(arr[i], arr[j]) == -1))) {
                temp[step] = arr[i];
                i++;
            } else {
                temp[step] = arr[j];
                j++;
            }
        }

        for (int step = 0; step < r - l + 1; step++) arr[l + step] = temp[step];
    }
    public static void main(String[] args) {
        Student[] iDNumber = new Student[5];
        iDNumber[0] = new Student("Student1", 1, 23);
        iDNumber[1] = new Student("Student2", 5, 78);
        iDNumber[2] = new Student("Student3", 4, 3);
        iDNumber[3] = new Student("Student4", 3, 98);
        iDNumber[4] = new Student("Student5", 2, 53);
        /*insertionSort(iDNumber);
        for (Student student : iDNumber) {
            System.out.println(student);
        }
        quickSort(iDNumber, 0, iDNumber.length - 1);
        for (Student student : iDNumber) {
            System.out.println(student);
        }*/
        Student[] iDNumber2 = new Student[5];
        iDNumber2[0] = new Student("Student6", 11, 43);
        iDNumber2[1] = new Student("Student7", 55, 20);
        iDNumber2[2] = new Student("Student8", 33, 87);
        iDNumber2[3] = new Student("Student9", 44, 45);
        iDNumber2[4] = new Student("Student10", 22, 21);
        Student[] mergedArr = mergeSort(iDNumber, iDNumber2);
        for (Student student : mergedArr) {
            System.out.println(student);
        }
    }
}
