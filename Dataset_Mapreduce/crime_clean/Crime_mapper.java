import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Crime_mapper
extends Mapper<LongWritable, Text, Text, Text> {
@Override
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	

	String line = value.toString();
	String[] input = line.split(",");
	String key1="";
	String id="";







	if(Character.isDigit(input[0].charAt(0))){
		if(input[1].length()==4){
			key1+=input[0]+","+input[1].substring(1,3);
			int sum=0;
			int year= Integer.parseInt(input[0]);
			if(year<2013){
				sum+=Integer.parseInt(input[4])
				+Integer.parseInt(input[5])+Integer.parseInt(input[6])
				+Integer.parseInt(input[8])+Integer.parseInt(input[9])
				+Integer.parseInt(input[10])+Integer.parseInt(input[11])
				+Integer.parseInt(input[12])+Integer.parseInt(input[13]);
			}
			else{
				sum+=Integer.parseInt(input[4])
				+Integer.parseInt(input[5])+Integer.parseInt(input[7])
				+Integer.parseInt(input[8])+Integer.parseInt(input[9])
				+Integer.parseInt(input[10])+Integer.parseInt(input[11])
				+Integer.parseInt(input[12])+Integer.parseInt(input[13]);
			}
			context.write(new Text(key1+","+sum), new Text(""));

		}
		
	}
	

}
}