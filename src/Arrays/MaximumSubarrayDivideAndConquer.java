package Arrays;

public class MaximumSubarrayDivideAndConquer {
    public static void main(String args[]) {
        /* public int[] findMaximumSubarray(int A[], int low, int high) {
            int array[];
            if(high==low) {     // base case: only one element

                array = {low, high, A[low]};
                return array;

            } else {
                int mid=(low+high)/2;

                {left_low, left_high, left_sum} = findMaximumSubarray(A, low, mid);
                {right_low, right_high, right_sum} = findMaximumSubarray(A, mid+1, high);
                {cross_low, cross_high, cross_sum} = findMaxCrossingSubarray(A, low, mid, high);
                if(left_sum>right_sum && left_sum>cross_sum {
                    return (left_low, left_high, left_sum);
                } else if(right_sum>left_sum && right_sum>cross_sum) {
                    return (right_low, right_high, right_sum);
                } else {
                    return (cross_low, cross_high, cross_sum);
                }

            }
        }
        */
    }

    public static int[] findMaxCrossingSubarray(int A[], int low, int mid, int high) {
        int left_sum=Integer.MIN_VALUE, right_sum=Integer.MIN_VALUE, sum=0;
        int max_left=0, max_right=0;
        for(int i=mid; i>=low; i--) {
            sum+=A[i];
            if(sum>left_sum) {
                left_sum=sum;
                max_left=i;
            }
        }
        sum=0;
        for(int i=mid+1; i<=high; i++) {
            sum+=A[i];
            if(sum>right_sum) {
                right_sum=sum;
                max_right=i;
            }
        }

        int array[]={max_left, max_right, left_sum+right_sum};

        return array;
    }
}