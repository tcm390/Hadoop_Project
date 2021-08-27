import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
public class Homeless_reducer_2009
extends Reducer<Text, Text, Text, Text> {
	@Override
	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
 		 
		for (Text value : values) {

			 context.write(new Text(""), new Text("2009,"+value));
		}
		 
	}
}