package clase4;


//Clase Ejer01a
public class Ejer01 {
	int n1;
	int n2;
	int n3;
	char orden;
	int vector[]=new int[3];
	int vector2[]=new int[3];

	
	public Ejer01 (int num1,int num2,int num3,char ord)
	{
		this.n1=num1;
		this.n2=num2;
		this.n3=num3;
		this.orden=ord;
	}
	
	public int[] mostrar()
	{
	
		if((n1>=n2)&&(n1>=n3))
		{
			vector[0]=n1;
			if(n2>=n3)
			{
				vector[1]=n2;
				vector[2]=n3;
			}
			else 
			{
				vector[1]=n3;
				vector[2]=n2;
			}
			
		}
		else if((n2>=n1)&&(n2>=n3))
		{
			vector[0]=n2;
			if(n1>=n3)
			{
				vector[1]=n1;
				vector[2]=n3;
			}
			else 
			{
				vector[1]=n3;
				vector[2]=n1;
			}
			
		}
		else if((n3>=n1)&&(n3>=n2))
		{
			vector[0]=n3;
			if(n2>=n1)
			{
				vector[1]=n2;
				vector[2]=n1;
			}
			else 
			{
				vector[1]=n1;
				vector[2]=n2;
			}
			
		}
		if(orden=='d')
		{
			return vector;
		}
		else
		{
		    int j=0;
			for(int i=vector.length-1;i>-1;i--)
			{
				vector2[j]=vector[i];
				j++;
			}
			
			return vector2;
		}
		
	}

	
}
