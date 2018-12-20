
public class BucketSort {
   int[] a = { 2, 1, 1, 100 };
int max= a[1];for(
   int i = 0;i<a.length;i++)
   {
      if (max < a[i])
         max = a[i];
   }

   int[] b = new int[max + 1];for(
   int n = 0;n<a.length;n++)
   {
      b[a[i]] += 1;
   }for(
   int m = 0;m<b.length;m++)
   {
      if (b[m] != 0) {
         System.out.print(m);
      }
   }
}
