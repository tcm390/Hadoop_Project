import java.io.IOException;
import org.apache.hadoop.io.IntWritable; 
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
public class Education_reducer_2015
extends Reducer<Text, Text, Text, Text> {
	@Override
	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
 		  
		String line = key.toString();
		String[] input = line.split(",");
		int test=0;
		String key1="";
		if(Character.isDigit(input[0].charAt(0)))
				test=Integer.parseInt(input[0]);
		if(test==1){
			key1+="AL";
		}
		else if(test==2){
			key1+="AK";
		}
		
		else if(test==4){
			key1+="AZ";
		}
		else if(test==5){
			key1+="AR";
		}
		else if(test==6){
			key1+="CA";
		}
		
		else if(test==8){
			key1+="CO";
		}
		else if(test==9){
			key1+="CT";
		}
		else if(test==10){
			key1+="DE";
		}
		else if(test==11){
			key1+="DC";
		}
		else if(test==12){
			key1+="FL";
		}
		else if(test==13){
			key1+="GA";
		}
		
		else if(test==15){
			key1+="HI";
		}
		else if(test==16){
			key1+="ID";
		}
		else if(test==17){
			key1+="IL";
		}
		else if(test==18){
			key1+="IN";
		}
		else if(test==19){
			key1+="IA";
		}
		else if(test==20){
			key1+="KS";
		}
		else if(test==21){
			key1+="KY";
		}
		else if(test==22){
			key1+="LA";
		}
		else if(test==23){
			key1+="ME";
		}
		else if(test==24){
			key1+="MD";
		}
		else if(test==25){
			key1+="MA";
		}
		else if(test==26){
			key1+="MI";
		}
		else if(test==27){
			key1+="MN";
		}
		else if(test==28){
			key1+="MS";
		}
		else if(test==29){
			key1+="MO";
		}
		else if(test==30){
			key1+="MT";
		}
		else if(test==31){
			key1+="NE";
		}
		else if(test==32){
			key1+="NV";
		}
		else if(test==33){
			key1+="NH";
		}
		else if(test==34){
			key1+="NJ";
		}
		else if(test==35){
			key1+="NM";
		}
		else if(test==36){
			key1+="NY";
		}
		else if(test==37){
			key1+="NC";
		}
		else if(test==38){
			key1+="ND";
		}
		else if(test==39){
			key1+="OH";
		}
		else if(test==40){
			key1+="OK";
		}
		else if(test==41){
			key1+="OR";
		}
		else if(test==42){
			key1+="PA";
		}
		else if(test==44){
			key1+="RI";
		}
		else if(test==45){
			key1+="SC";
		}
		else if(test==46){
			key1+="SD";
		}
		else if(test==47){
			key1+="TN";
		}
		else if(test==48){
			key1+="TX";
		}
		else if(test==49){
			key1+="UT";
		}
		else if(test==50){
			key1+="VT";
		}
		else if(test==51){
			key1+="VA";
		}
		else if(test==53){
			key1+="WA";
		}
		else if(test==54){
			key1+="WV";
		}
		else if(test==55){
			key1+="WI";
		}
		else if(test==56){
			key1+="WY";
		}
		else if(test==72){
			key1+="PR";
		}
		
		for (Text value : values) {
			context.write(new Text(""), new Text("2015"+","+key1+","+input[1]+","+input[2]+","+input[3]+","+input[4])); 
		}
		
		 
	}
}