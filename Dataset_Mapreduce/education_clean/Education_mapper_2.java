import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Education_mapper_2
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
			int a3 = Integer.parseInt(input[2].substring(1,input[2].length()-1)); 
			int a7 = Integer.parseInt(input[6].substring(1,input[6].length()-1)); 
			int a9 = Integer.parseInt(input[8].substring(1,input[8].length()-1));
			int a11 = Integer.parseInt(input[10].substring(1,input[10].length()-1)); 
			int a13 = Integer.parseInt(input[12].substring(1,input[12].length()-1)); 

			int a19 = Integer.parseInt(input[19].substring(1,input[19].length()-1)); 
			int a21 = Integer.parseInt(input[20].substring(1,input[20].length()-1)); 
			int a23 = Integer.parseInt(input[22].substring(1,input[22].length()-1));
			int a25 = Integer.parseInt(input[24].substring(1,input[24].length()-1)); 
			int a27 = Integer.parseInt(input[26].substring(1,input[26].length()-1)); 

			int hi_high = a7+a9+a11+a19+a21+a23+a25+a27;
			int hi_college=a11+a25+a27;
			int lo_high = a3-a7-a9-a11+a13-a19-a21-a23-a25-a27;
			int lo_college = a3-a11+a13-a25-a27;
			context.write(new Text(key1+","+hi_high+","+hi_college+","+lo_high+","+lo_college), new Text(""));

		}
	}

	

}
}