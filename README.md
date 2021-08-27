# Hadoop_Project
**DATA**
Download crime data from here
Download TEDS data from here
Download Educational attainment data from here Download Mental health data from here Download Unemployment data from here Download Homeless data from here

**Data Cleaning**
Login to Hadoop by using command: ssh -Y NetID@dumbo.es.its.nyu.edu
Create hdfs directory: hdfs dfs -mkdir <name>
Upload java program to the directory: scp ./ filename NetID@dumbo.es.its.nyu.edu:/home/NetID
Run java program to clean dataset and extract data(by using following command):
java -version
yarn classpath
javac -classpath `yarn classpath` -d . "mapper program".java
javac -classpath `yarn classpath` -d . "reducer program".java
javac -classpath `yarn classpath`:. -d . "java program".java
jar -cvf "jar file name".jar *.class
hadoop jar "jar file name".jar "java program" /user/yourNetID/<dataset path> /user/yourNetID/<output path>
All the data cleaning program are in the directory “Dataset_Mapreduce” After cleaning data, should use the command to get permission:
hdfs dfs -chmod -R 775 /user/ yourNetID/<output path>
   
**STORE DATA**
Open beeline and create schema for your dataset. Example:
create external table w1 (data1 string, year int, data2 string, temperature int, quality tinyint, data3 string) row format delimited fields terminated by ','
LOAD DATA INPATH "/user/tcm390/freq2015/output" INTO TABLE freq2015;
Data Analysis
Open spark to analyze the data.
Run spark1 for the code in “check_correlation for teds” (spark-shell --packages com.databricks:spark-csv_2.10:1.5.0) Run spark2 for the code in “predict_logistic_regression” (spark2-shell --packages com.databricks:spark-csv_2.10:1.5.0)
 
