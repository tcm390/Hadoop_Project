import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat; 
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Homeless_2007 {
public static void main(String[] args) throws Exception { 
	if (args.length != 2) {
	System.err.println("Usage: homeless <input path> <output path>");
	System.exit(-1); }

	
	Job job = new Job(); 
	job.setJarByClass(Homeless_2007.class); 
	job.setJobName("Homeless_2007");
	FileInputFormat.addInputPath(job, new Path(args[0])); 
	FileOutputFormat.setOutputPath(job, new Path(args[1]));
	job.setMapperClass(Homeless_mapper_5.class); 
	job.setReducerClass(Homeless_reducer_2007.class);
	job.setOutputKeyClass(Text.class); 
	job.setOutputValueClass(Text.class);
	job.setNumReduceTasks(1);
	System.exit(job.waitForCompletion(true) ? 0 : 1); 
}
}