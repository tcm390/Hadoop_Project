import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class Unemploy_mapper
extends Mapper<LongWritable, Text, Text, Text> {
@Override
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	

	String line = value.toString();
	String[] input = line.split(",");
	String key1="";
	if(input[0].length()>18){
		if(input[0].charAt(19)=='4'){
			if(input[0].charAt(5)=='0'){
				key1+=input[0].substring(6,7);
			}
			else{
				key1+=input[0].substring(5,7);
			}
			context.write(new Text(key1+","+2000), new Text(input[1]));
			context.write(new Text(key1+","+2001), new Text(input[2]));
			context.write(new Text(key1+","+2002), new Text(input[3]));
			context.write(new Text(key1+","+2003), new Text(input[4]));
			context.write(new Text(key1+","+2004), new Text(input[5]));
			context.write(new Text(key1+","+2005), new Text(input[6]));
			context.write(new Text(key1+","+2006), new Text(input[7]));
			context.write(new Text(key1+","+2007), new Text(input[8]));
			context.write(new Text(key1+","+2008), new Text(input[9]));
			context.write(new Text(key1+","+2009), new Text(input[10]));
			context.write(new Text(key1+","+2010), new Text(input[11]));
			context.write(new Text(key1+","+2011), new Text(input[12]));
			context.write(new Text(key1+","+2012), new Text(input[13]));
			context.write(new Text(key1+","+2013), new Text(input[14]));
			context.write(new Text(key1+","+2014), new Text(input[15]));
			context.write(new Text(key1+","+2015), new Text(input[16]));
			context.write(new Text(key1+","+2016), new Text(input[17]));
			context.write(new Text(key1+","+2017), new Text(input[18]));
			context.write(new Text(key1+","+2018), new Text(input[19]));
			
		}
	}
	
	

	

}
}