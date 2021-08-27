import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Homeless_mapper_2
extends Mapper<LongWritable, Text, Text, Text> {
@Override
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	

	String test = value.toString();
	int sw=0;
	int i=0;
	int count=0;
	String result="";
	String temp="";

	while(true){
	        
	    if(i>=test.length()-10){
	        
	        break;
	        
	    }

		if(test.charAt(i)=='\"'){
			if(sw==0){
				//test=test.substring(0,i)+test.substring(i+1,test.length());
				sw=1;
			}
			else{
				//test=test.substring(0,i)+test.substring(i+1,test.length());
				sw=0;
			}

		}
		else if(test.charAt(i)==','){
			//if(sw==1){
				//test=test.substring(0,i)+test.substring(i+1,test.length());
			//}
			if(sw==0){
				count++;
				if(count==1 || count==3||count==62 || count==77){
					result+=temp+",";
					temp="";

				}
				else{
					temp="";
				}

			}
		}
		else{
			temp+=test.charAt(i);
		}
		i=i+1;
	}
	
    context.write(new Text("1"), new Text(result));
    
	
	
	
}
}