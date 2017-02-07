
public class AList 
{
private String[] data;
	
	public AList()
	{
		this.data = new String[0];
	}
	
	public String getAtIndex(int index) throws Exception
	{
		//returns without removing the String at position index
		if(index < 0 || index >= this.data.length)
		{
			//illegal position
			throw new Exception("check your input");
		}
		return this.data[index];
	}
	
	public String removeAtIndex(int index)
	{
		//returns with removing and resizing the String at positon index
		String[] resized = new String[data.length -1];
		String retStr = "";
		for(int i = 0, j=0; i<data.length; i++)
		{
			if (i!=index)
			{
				resized[j] = data[i];
				j++;
			}
			else
			{
				 retStr=data[i];
			}
		}
		data = resized;
		return retStr;
	}
	public void reverse()
	{
		//reverses the AList producing the original AList in reverse order
		String[] reverse = new String[data.length];
	    for( int i = data.length - 1; i >= 0 ; i-- ) 
	    {
	       reverse[i] = this.data[data.length - i - 1];
	    }
	    this.data = reverse;
	}
	public void display()
	{
		/*
		for(int i = 0; i < this.data.length; i++)
		{
			System.out.println(this.data[i]);
		}
		*/
		for(String s: this.data)
		{
			System.out.println(s);
		}
	}
	
	private int partition(String[] list, int lowerIndex, int higherIndex){
	        /*algorithm partition(A, lo, hi) is
	    pivot := A[hi]
	    i := lo     // place for swapping
	    for j := lo to hi – 1 do
	        if A[j] ≤ pivot then
	            swap A[i] with A[j]
	            i := i + 1
	    swap A[i] with A[hi]
	    return i*/
		
		String pivot = list[higherIndex];
		int i = lowerIndex;
		for(int j = lowerIndex; j < higherIndex; j++){
			if(list[j].compareTo(pivot) <= 0){
				String temp = list[j];//["a","b","c"],j=1,i=0, means temp = "b"
				list[j] = list[i];// means "b" becomes "a" -> ["a","a","c"],
				list[i] = temp;// means "a" becomes temp which is "b" - > ["b","a","c"],
				i++;
			}
		}
		String temp = list[i];
		list[i] = list[higherIndex];
		list[higherIndex] = temp;
		
		return i;
	}
	
	private String[] quickSort(String[] list, int lowerIndex, int higherIndex)
	{
		/*algorithm quicksort(A, lo, hi) is
	    if lo < hi then
	        p := partition(A, lo, hi)
	        quicksort(A, lo, p – 1)
	        quicksort(A, p + 1, hi)*/
		
		if(lowerIndex < higherIndex){
			int pivotIndex = partition(list, lowerIndex, higherIndex);
			quickSort(list, lowerIndex, pivotIndex - 1);
			quickSort(list, pivotIndex+1, higherIndex);
		}
		
		return list;
		
	}
	
	public void quickSort(){//smart, convenient call
		data = quickSort(data, 0, data.length - 1);
	}
	
	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public void add(String s)
	{
		String[] temp = new String[this.data.length + 1];
		for(int i = 0; i < this.data.length; i++)
		{
			temp[i] = this.data[i];
		}
		temp[temp.length-1] = s;
		data = temp;
	}

	
	public int size()
	{
		return this.data.length;
	}
}



