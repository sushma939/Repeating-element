import java.io.*;
import java.util.*;
public class RepeatingArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
int array[] =new int[100];
int i = 0;
while (sc.hasNext())
{
    int n = sc.nextInt();
    if(n==-1)break;
    array[i]=n;
    i++;
}
HashSet<Integer>hm=new HashSet<>();
int min=-1;
for(int j=i-1;j>=0;j--) {
    if (hm.contains(array[j])) {
        min = j;
        break;
    } else
        hm.add(array[j]);
}
if(min!=-1)
    System.out.println("The first repeating element is : "+array[min]);
else
    System.out.println("There is no repeating element");
    }
}
