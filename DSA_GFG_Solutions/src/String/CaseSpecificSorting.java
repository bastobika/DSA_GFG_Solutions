package String;

public class CaseSpecificSorting {

	public static String caseSort(String str){
        int arr[] = new int[256];
        int n = str.length();
        int string[] = new int[n];
        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            arr[c]++;
            if(c >= 'a' && c<= 'z')
                string[i] = 1;
            else
                string[i] = 2;
        }
        int k = 0;
        int u = 'A';
        int l = 'a';
        String result = "";
        while(k<n){
            if(string[k] == 1){
                while(arr[l] == 0)
                    l++;
                result += (char)l;
                arr[l]--;
            }else{
                while(arr[u] == 0)
                    u++;
                result += (char)u;
                arr[u]--;
            }
            k++;
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(caseSort("adgFGDjfnKFJ"));
	}

}
