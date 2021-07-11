class InningStatistics{
	int totalRuns=0;
	int zeroes,ones,twos,threes,fours,fives,sixes;
    float strikeRate;
    int runs[] = new int[30];
    
    void createRandom()
    {
    	System.out.println("-----Inning Statistics-----");
    	int max=6;
    	int min=0;
    	int range=max-min+1;
    	for(int i=0;i<runs.length;i++)
    	{
    		runs[i]=(int)(Math.random()*range)+min;
    	}
    	System.out.println("Runs:");
    	for(int i=0;i<runs.length;i++)
    	{   		
    		System.out.print(runs[i]+" ");
    	}    	
    }
    void calculateTotalRuns(){
    	for(int i=0;i<runs.length;i++)
    	{
    		totalRuns = totalRuns+runs[i];
    	}
    	System.out.println("Total Runs Scored:"+totalRuns);    	
    }
    void eachRuns() {
    	for(int i=0;i<runs.length;i++)
    	{
    		if(runs[i]==0)
    			zeroes++;
    		else if(runs[i]==1)
    			ones++;
    		else if(runs[i]==2)
    			twos++;
    		else if(runs[i]==3)
    			threes++;
    		else if(runs[i]==4)
    			fours++;
    		else if(runs[i]==5)
    			fives++;
    		else if(runs[i]==6)
    			sixes++;    		
    	}
    	System.out.println("Number of 0s: "+zeroes); 
    	System.out.println("Number of 1s: "+ones);
    	System.out.println("Number of 2s: "+twos);
    	System.out.println("Number of 3s: "+threes);
    	System.out.println("Number of 4s: "+fours); 
    	System.out.println("Number of 5s: "+fives);
    	System.out.println("Number of 6s: "+sixes); 
    }
    void strike() {
    	strikeRate = (totalRuns/30)*100;
    	System.out.println("Strike Rate:"+strikeRate);
    }
}
public class AssignmentTwo {
   public static void main(String[] args) {
	   InningStatistics i=new InningStatistics();
	   i.createRandom();
	   i.calculateTotalRuns();
	   i.eachRuns();
	   i.strike();
}
}
