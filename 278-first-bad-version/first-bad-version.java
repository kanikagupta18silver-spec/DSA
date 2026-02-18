/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int r =n;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(mid>=0 && isBadVersion(mid) && isBadVersion(mid-1))
            {
                r=mid-1;
            }else if (mid>=0 && isBadVersion(mid) && ! isBadVersion(mid-1)){
                return mid;
            }else{
                l=mid+1;

            }
            }
            return -1;
            }
        }
        
    
