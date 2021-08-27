import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Tedsalcohol_mapper
extends Mapper<LongWritable, Text, Text, Text> {
@Override
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	

	String line = value.toString();
	String[] input = line.split(",");
	String key1="";
	String id="";
	if(Character.isDigit(input[0].charAt(0))){
		if(input[2].equals("36")){
			
				key1+=input[0]+",";
				key1+=input[25]+",";
				key1+=input[26]+",";
				key1+=input[27]+",";
				key1+=input[31]+",";
				key1+=input[32]+",";
				key1+=input[33];
				
				

				context.write(new Text(key1), new Text(""));
		}
			
		
		
	}
	

}
}