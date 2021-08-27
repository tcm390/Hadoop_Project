import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Education_mapper_1
extends Mapper<LongWritable, Text, Text, Text> {
@Override
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	

	String line = value.toString();
	String[] input = line.split(",");
	String key1="";
	String id="";
	if(input[0].length()>9){
		id+=input[0].substring(1,input[0].length()-1);
	
	

		if(id.substring(0,id.length()-2).equals("0400000US")){
			if(id.charAt(9)=='0'){
					key1+=id.substring(10,11);
				}
			else{
					key1+=id.substring(9,11);
			}
			double a3 = Double.parseDouble(input[2].substring(1,input[2].length()-1)); 
			double a7 = Double.parseDouble(input[6].substring(1,input[6].length()-1)); 
			double a9 = Double.parseDouble(input[8].substring(1,input[8].length()-1)); 
			double a11 = Double.parseDouble(input[10].substring(1,input[10].length()-1)); 
			double a13 = Double.parseDouble(input[12].substring(1,input[12].length()-1)); 
			double a29 = Double.parseDouble(input[28].substring(1,input[28].length()-1)); 
			double a31 = Double.parseDouble(input[30].substring(1,input[30].length()-1)); 
			double hi_high = (a3 * (a7+a9+a11)/100)+(a13*a29/100);
			double hi_college=(a3 * a11 /100)+(a13*a31/100);
			double lo_high = (a3 * (1-((a7+a9+a11)/100)))+(a13*(1-(a29/100)));
			double lo_college = (a3 * (1-(a11/100)))+(a13 *(1-(a31/100)));
			context.write(new Text(key1+","+hi_high+","+hi_college+","+lo_high+","+lo_college), new Text(""));

		}
	}

	

}
}