
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



