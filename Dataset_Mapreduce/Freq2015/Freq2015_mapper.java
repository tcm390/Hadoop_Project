import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Freq2015_mapper
extends Mapper<LongWritable, Text, Text, Text> {
@Override
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	

	String line = value.toString();
	String[] input = line.split(",");
	String key1="";
	String id="";
	if(Character.isDigit(input[0].charAt(0))){
		
				
				key1+=input[15]+",";
				if(input[2].equals("10")){
					key1+="10,";
				}
				else if(input[2].equals("11")){
					key1+="10,";
				}
				else if(input[2].equals("12")){
					key1+="10,";
				}
				else{
					key1+=input[2]+",";
				}

				key1+=input[3]+",";
				key1+=input[7]+",";

				if(input[8].equals("1")){
					key1+="1,";
				}
				else if(input[8].equals("2")){
					key1+="1,";
				}
				else if(input[8].equals("3")){
					key1+="2,";
				}
				else if(input[8].equals("4")){
					key1+="3,";
				}
				else{
					key1+=input[8]+",";
				}
				
				
				
				key1+=input[14]+",";
				key1+=input[25]+",";
				key1+=input[27]+",";
				key1+=input[29]+",";
				key1+=input[31]+",";
				key1+=input[33]+",";
				key1+=input[35]+",";
				if(input[19].equals("1")){
					key1+="1";
				}
				else if(input[19].equals("2")){
					key1+="1";
				}
				else if(input[19].equals("3")){
					key1+="2";
				}
				else if(input[19].equals("4")){
					key1+="2";
				}
				else if(input[19].equals("5")){
					key1+="2";
				}
				else if(input[19].equals("6")){
					key1+="3";
				}
				else if(input[19].equals("7")){
					key1+="3";
				}
				else if(input[19].equals("8")){
					key1+="3";
				}
				else{
					key1+=input[19];
				}
				
				

				context.write(new Text(key1), new Text(""));
		
			
		
		
	}
	

}
}