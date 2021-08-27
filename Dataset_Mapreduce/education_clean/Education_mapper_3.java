import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Education_mapper_3
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
			int a15 = Integer.parseInt(input[14].substring(1,input[14].length()-1));
			int a27 = Integer.parseInt(input[26].substring(1,input[26].length()-1)); 
			int a39 = Integer.parseInt(input[38].substring(1,input[38].length()-1));
			int a422 = Integer.parseInt(input[421].substring(1,input[421].length()-1)); 
			 
			int a434 = Integer.parseInt(input[433].substring(1,input[433].length()-1)); 
			int a446 = Integer.parseInt(input[445].substring(1,input[445].length()-1)); 
			int a470 = Integer.parseInt(input[469].substring(1,input[469].length()-1));
			int a474 = Integer.parseInt(input[473].substring(1,input[473].length()-1)); 
			int a486 = Integer.parseInt(input[485].substring(1,input[485].length()-1)); 
			int a498 = Integer.parseInt(input[497].substring(1,input[497].length()-1));
			int a510 = Integer.parseInt(input[509].substring(1,input[509].length()-1)); 
			
			int hi_high = a27+a39+a422+a446+a470+a474+a486+a498+a510;
			int hi_college=a422+a498+a510;
			int lo_high = a15+a434-(a446+a470+a474+a486+a498+a510);
			int lo_college = a434-a498-a510;
			context.write(new Text(key1+","+hi_high+","+hi_college+","+lo_high+","+lo_college), new Text(""));

		}
	}

	

}
}