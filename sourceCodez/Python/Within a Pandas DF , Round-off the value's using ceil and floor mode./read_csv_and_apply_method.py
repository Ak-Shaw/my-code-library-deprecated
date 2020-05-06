# Load the Pandas libraries with alias 'pd' 
import pandas as pd 

# Load the DataFrame from csv file
df_csv = pd.read_csv('ceil_mode.csv')

# Loading our library with alias 'myModule'
import pandas_dataframe_roundOff as myModule

print(myModule.round_entire_data_frame_ceil(df_csv))
