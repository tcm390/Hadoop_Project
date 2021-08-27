import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Substance_mapper
extends Mapper<LongWritable, Text, Text, Text> {
@Override
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	

	String line = value.toString();
	String[] input = line.split(",");
	String key1="";
	String id="";
	if(Character.isDigit(input[0].charAt(0))){
		
			
				key1+=input[0]+",";
				key1+=input[2]+",";
				key1+=input[20]+",";
				key1+=input[4]+",";
				key1+=input[11]+",";
				
				key1+=input[31]+",";
				key1+=input[6];

				context.write(new Text(key1), new Text(""));
			
		
		
	}
	

}
}