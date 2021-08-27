# Hadoop_Project
**DATA**

Download crime data from here

http://s3-us-gov-west-1.amazonaws.com/cg-d4b776d0-d898-4153-90c8-8336f86bdfec/estimated_crimes_1979_2019.csv

Download TEDS data from here

https://www.datafiles.samhsa.gov/study-series/treatment-episode-data-set-admissions-teds-nid13518

Download Educational attainment data from here 

https://data.census.gov/cedsci/table?q=education%20attainment&t=Education&g=0100000US.050000&y=2017&d=ACS%201-Year%20Estimates%20Subject%20Tables&tid=ACSST1Y2017.S1501&hidePreview=true

Download Mental health data from here 

https://wwwdasis.samhsa.gov/dasis2/mhcld.htm

Download Unemployment data from here 

https://data.bls.gov/PDQWeb/la

Download Homeless data from here

https://www.huduser.gov/portal/sites/default/files/xls/2007-2019-Point-in-Time-Estimates-by-CoC.xlsx

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
   
**Data Analysis**
   
Open spark to analyze the data.
   
Run spark1 for the code in “check_correlation for teds” (spark-shell --packages com.databricks:spark-csv_2.10:1.5.0) Run spark2 for the code in “predict_logistic_regression” (spark2-shell --packages com.databricks:spark-csv_2.10:1.5.0)
 
