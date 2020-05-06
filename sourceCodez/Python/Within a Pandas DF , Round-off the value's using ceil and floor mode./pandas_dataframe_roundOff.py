# In a Python method , within a Pandas DF , 
# Round-off the value's using ceil and floor mode.

import pandas as pd 
import numpy as np 

#Round up – Single DataFrame column - columnName
def round_single_data_frame_columnName_ceil(df, columnName):

	if (np.issubdtype(df[columnName].dtype, np.number)) :
		df[columnName] = df[columnName].apply(np.ceil)
		return df

	return df

#Round up – Single DataFrame column - columnIndex
def round_single_data_frame_columnIndex_ceil(df, columnIndex):

	if (np.issubdtype(df.iloc[ : , columnIndex ].dtype, np.number)) :
		df.iloc[ : , columnIndex ] = df.iloc[ : , columnIndex ].apply(np.ceil)
		return df

	return df

#Round down – Single DataFrame column - columnName
def round_single_data_frame_columnName_floor(df, columnName):

	if (np.issubdtype(df[columnName].dtype, np.number)) :
		df[columnName] = df[columnName].apply(np.floor)
		return df

	return df

#Round down – Single DataFrame column - columnIndex
def round_single_data_frame_columnIndex_floor(df, columnIndex):

	if (np.issubdtype(df.iloc[ : , columnIndex ].dtype, np.number)) :
		df.iloc[ : , columnIndex ] = df.iloc[ : , columnIndex ].apply(np.floor)
		return df

	return df

#Round to specific decimals places – Entire DataFrame
def round_to_specific_decimal_places_entire_data_frame(df, decimalPlacesNeeded):

	return df.round(decimals=decimalPlacesNeeded)

#Round up – entire DataFrame
def round_entire_data_frame_ceil(df):

	cols = df.columns.tolist()

	for i in cols:
		if (np.issubdtype(df[i].dtype, np.number)) :
			df[i] = df[i].apply(np.ceil)

	return df

#Round down – entire DataFrame 
def round_entire_data_frame_floor(df):

	cols = df.columns.tolist()

	for i in cols:
		if (np.issubdtype(df[i].dtype, np.number)) :
			df[i] = df[i].apply(np.floor)

	return df



#sample data frame 1 : One Column (Numeric)

# Sample = {'Value': [5.52132,6.572935,7.21,8.755,9.9989]}
# df = pd.DataFrame(Sample, columns= ['Value'])


#sample date frame 2 : Three columns; Two (Numeric) and One (Text)

# Sample = {'Values_1': [5.52132,6.572935,7.21,8.755,9.9989],
#           'Values_2': [22.7352,11.82,23.75839,4.22,15.1173],
#           'Text': ['AAA','ABC','XYZ','AABB','PPPP']                               
#           }
# df = pd.DataFrame(Sample, columns= ['Values_1','Values_2','Text'])
