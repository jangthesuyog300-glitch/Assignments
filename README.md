# Assignments
for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1 || arr[i]== 2) {
				arr1[cunt]=arr[i];
				cunt++;
			}
			else {
				int j=2;
				while(j<arr[i])
				{
					if(arr[i]%j==0) 
					{
					  break;
					}else
					{
						arr1[cunt]=arr[i];
						  cunt++;
						  j++;
					}
				}
			}
			
		}
		return arr1;